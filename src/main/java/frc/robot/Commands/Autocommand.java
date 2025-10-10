// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Commands;

import static frc.robot.Constants.CoralOutInTaker.CORAL_MOTOR_ID;

import com.ctre.phoenix6.CANBus;
import com.ctre.phoenix6.hardware.TalonFX;
import com.ctre.phoenix6.swerve.SwerveRequest;

import edu.wpi.first.math.kinematics.ChassisSpeeds;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Constants;
import frc.robot.Subsystems.CommandSwerveDrivetrain;


/* You should consider using the more terse Command factories API instead https://docs.wpilib.org/en/stable/docs/software/commandbased/organizing-command-based.html#defining-commands */
  public class Autocommand extends Command {
  Timer timer = new Timer();
  double autotimer = timer.get();
    private final CommandSwerveDrivetrain m_CommandSwerveDrivetrain;
  private final SwerveRequest.ApplyRobotSpeeds robotSpeeds = new SwerveRequest.ApplyRobotSpeeds().withSpeeds(new ChassisSpeeds(-1,0,0)); 
  {
    
  }


  /** Creates a new Auto. */
   public Autocommand(CommandSwerveDrivetrain s_CommandSwerveDrivetrain) {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(s_CommandSwerveDrivetrain);
    m_CommandSwerveDrivetrain = s_CommandSwerveDrivetrain; 
   
   

}

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    timer.start();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    timer.start();
   if (timer.get() > 1){
    m_CommandSwerveDrivetrain.setControl(robotSpeeds);
   }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

   //Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return (timer.get() - autotimer) > 15;
  }
} 
