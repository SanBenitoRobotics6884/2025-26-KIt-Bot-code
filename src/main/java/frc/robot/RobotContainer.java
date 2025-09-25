// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.robot.Commands.CoralOutputcommands;
import frc.robot.Subsystems.CoralOutakeSubsystem;

public class RobotContainer {
  XboxController m_Controller = new XboxController(0);
  
  public RobotContainer() {
    //Sub:
    CoralOutakeSubsystem m_CoralSubsystem = new CoralOutakeSubsystem();
    //Command:
    CoralOutputcommands m_CoralCommand = new CoralOutputcommands(m_CoralSubsystem, m_Controller.getLeftTriggerAxis());
    if (m_Controller.getAButtonPressed()) {
      m_CoralCommand.execute();
    }

    configureBindings();
  }

  private void configureBindings() {}

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}
