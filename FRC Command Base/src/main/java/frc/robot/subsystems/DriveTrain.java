/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotContainer;
import frc.robot.commands.TankDrive;

public class DriveTrain extends SubsystemBase {
  private Spark leftDrive = new Spark(RobotContainer.Motor_Left_0);
  private Spark rightDrive = new Spark(RobotContainer.Motor_Right_1);
  
  /**
   * Creates a new DriveTrain.
   */
  public DriveTrain() {
    
  }
  public void initDefaultCommand(){
    setDefaultCommand(new TankDrive());
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
  public void setBothMotors(double speed){
    rightDrive.set(speed);
    leftDrive.set(speed);
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
