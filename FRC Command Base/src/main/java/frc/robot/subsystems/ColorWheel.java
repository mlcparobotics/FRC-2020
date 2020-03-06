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

public class ColorWheel extends SubsystemBase {
  private Spark ColorWheel = new Spark(RobotContainer.ColorWheel_SPARK_PWM_4);
  /**
   * Creates a new ColorWheel.
   */
  public ColorWheel() {

  }
public void setColorWheel(double speed){
 ColorWheel.set(speed);
}
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
