/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.InvertType;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.BaseMotorController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotContainer;

public class Shooter extends SubsystemBase {
  private TalonSRX shooterTop = new TalonSRX(RobotContainer.ShooterTop_0);
  private TalonSRX shooterBottom = new TalonSRX(RobotContainer.ShooterBottom_1);
  
  public Shooter() {
    }
public void setSettings(){
  shooterBottom.follow(shooterTop);
    shooterBottom.setInverted(InvertType.FollowMaster);
    shooterTop.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 10);
    shooterBottom.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 10);
    shooterTop.setSelectedSensorPosition(0, 0, 10);
  
}
  
  
  public void isInvtered(boolean x){
    shooterTop.setInverted(x);
  }
  public void setMaster(double speed){
    shooterTop.set(ControlMode.PercentOutput, speed);
    }
    public double getTopShooterOutPut(){
      return shooterTop.getMotorOutputPercent();
    }
    public double getBottomShooterOutPut(){
      return shooterBottom.getMotorOutputPercent();
    }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
