/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Sendable;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ArmConstants;

public class Arm extends SubsystemBase {
  /**
   * Creates a new Arm.
   */

  private final SpeedController m_armMotor = new WPI_TalonSRX(ArmConstants.kARM_MOTOR_ID);

  public Arm() {

    // m_armMotor.configOpenloopRamp(ArmConstants.kArmRampRate);
    SmartDashboard.putData("Arm Motor", (Sendable) m_armMotor);
      SmartDashboard.putData("Arm Subsystem", this);

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }


 
  public void armUp() {
    m_armMotor.set(ArmConstants.kArmUpSpeed);
  }

  public void armStop() {
    m_armMotor.set(0);
  }
  public void armDown() {
    m_armMotor.set(ArmConstants.kArmDownSpeed);
  }



}
