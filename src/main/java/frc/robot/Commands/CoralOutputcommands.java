// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Subsystems.CoralOutakeSubsystem;

/* You should consider using the more terse Command factories API instead https://docs.wpilib.org/en/stable/docs/software/commandbased/organizing-command-based.html#defining-commands */
public class CoralOutputcommands extends Command {
  XboxController m_Controller;
  CoralOutakeSubsystem m_Subsystem = new CoralOutakeSubsystem();
  //Double m_speed;

  /** Creates a new CoralOutputcommands. */
  public CoralOutputcommands(CoralOutakeSubsystem subsystem, XboxController controller) {
    m_Subsystem = subsystem;
    m_Controller = controller;
    
    addRequirements(subsystem);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double speedValue = m_Controller.getLeftTriggerAxis();
    m_Subsystem.RotateThisMotor(speedValue);
    
    System.out.println("execute");
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
