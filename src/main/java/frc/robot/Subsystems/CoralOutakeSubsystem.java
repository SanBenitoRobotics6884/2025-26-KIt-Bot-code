// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystems;

import java.util.function.DoubleSupplier;

import com.ctre.phoenix6.hardware.TalonFX;  

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import static frc.robot.Constants.CoralOutInTaker.*;

public class CoralOutakeSubsystem extends SubsystemBase {
  /** Creates a new CoralOutakeSubsystem. */
  TalonFX aTalonFX;
  // XboxController sillyController = new XboxController(0);

  public CoralOutakeSubsystem() {
    aTalonFX = new TalonFX(CORAL_MOTOR, OUR_CANBUS);
  }
 
  @Override
  public void periodic() {}

  public void RotateThisMotor(Double speed) {
    aTalonFX.set(speed);
    /**if(sillyController.getLeftTriggerAxis() > 0.1){
      aTalonFX.set(1);
    } else {
      aTalonFX.set(0);
    }*/
  }
}
