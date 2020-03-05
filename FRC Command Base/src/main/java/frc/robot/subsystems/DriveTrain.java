/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotContainer;
import frc.robot.commands.TankDrive;

public class DriveTrain extends SubsystemBase {
  private Spark leftDrive = new Spark(RobotContainer.Motor_Left_0);
  private Spark rightDrive = new Spark(RobotContainer.Motor_Right_1);
  private Encoder leftDriveEncoder = new Encoder(0,1);
 private Encoder rightDriveEncoder = new Encoder(2,3);
 private DifferentialDrive drive = new DifferentialDrive(leftDrive, rightDrive);
  /**
   * Creates a new DriveTrain.
   */
  public DriveTrain() {
    
  }
  public void initDefaultCommand(){
    setDefaultCommand(new TankDrive());
  }
  public void setSparkEncodPulse(double feet,double pulse256){
    leftDriveEncoder.setDistancePerPulse(feet/pulse256);
    rightDriveEncoder.setDistancePerPulse(feet/pulse256);
  }
  public void setLeftInverted(boolean invert){
    leftDrive.setInverted(invert);
  }
  public void setRightInverted(boolean invert){
    rightDrive.setInverted(invert);
  }
  public void setLeftMotors(double speed){
    leftDrive.set(speed);
  }
  public void setRightMotors(double speed){
    rightDrive.set(speed);
  }
  public void setBothMotors(double LeftY,double RightY){
    drive.tankDrive(LeftY, RightY);
  }
  public void resetBothEncoders(){
    leftDriveEncoder.reset();
    rightDriveEncoder.reset();
  }
  public double getLeftDriveEncoderDistance(){
    return leftDriveEncoder.getDistance();
  }
  public double getRightDriveEncoderDistance(){
    return rightDriveEncoder.getDistance();
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
