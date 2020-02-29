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
import frc.robot.commands.IntakeMove;

public class Intake extends SubsystemBase {
  private VictorSP intake1VictorSP = new VictorSP(RobotContainer.Intake_2);
  private VictorSP intake2VictorSP = new VictorSP(RobotContainer.Intake_3);
  
  public Intake() {

  }
  public void setBothMotors(double speed){
    intake1VictorSP.set(speed);
    intake2VictorSP.set(speed);
  }
  public void initDefaultCommand(){
    setDefaultCommand(new IntakeMove());
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
