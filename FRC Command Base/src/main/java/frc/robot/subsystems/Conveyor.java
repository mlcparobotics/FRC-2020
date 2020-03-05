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

public class Conveyor extends SubsystemBase {
  /**
   * Creates a new Conveyer.
   */
  private VictorSP conveyorVictorSP = new VictorSP(RobotContainer.Conveyor_6);
  public Conveyor() {

  }
  public void setConveyerSpeed(double speed){
    conveyorVictorSP.set(speed);
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
