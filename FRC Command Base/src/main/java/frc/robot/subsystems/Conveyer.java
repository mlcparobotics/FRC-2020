/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotContainer;

public class Conveyer extends SubsystemBase {
  /**
   * Creates a new Conveyer.
   */
  private VictorSP conveyerVictorSP = new VictorSP(RobotContainer.Conveyer_3);
  public Conveyer() {

  }
  public void setConveyerSpeed(double speed){
    conveyerVictorSP.set(speed);
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
