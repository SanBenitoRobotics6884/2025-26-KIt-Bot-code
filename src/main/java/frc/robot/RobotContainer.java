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
  CoralOutakeSubsystem m_CoralSubsystem = new CoralOutakeSubsystem();
  // CoralOutputcommands m_CoralCommand = new CoralOutputcommands(m_CoralSubsystem, m_Controller.getLeftTriggerAxis());
  
  public RobotContainer() {
    m_CoralSubsystem.setDefaultCommand(new CoralOutputcommands(m_CoralSubsystem, m_Controller));

    configureBindings();
  }

  private void configureBindings() {
    System.out.println("bindings configured");
    /** if (m_Controller.getLeftTriggerAxis() > 0) {
      m_CoralCommand.schedule();
      m_CoralCommand.execute();
      System.out.println("Button A is pressed" "Coral Should be Outtaking");
    } */
  }

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}
