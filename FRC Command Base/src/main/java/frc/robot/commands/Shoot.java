/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
//import frc.robot.Constants;
import frc.robot.Robot;
import frc.robot.RobotContainer;

public class Shoot extends CommandBase {
  /**
   * Creates a new Shoot.
   */
  double toggle=0;
  public Shoot() {
    Robot.shooter.setSettings();
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(Robot.shooter);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
     double speed = -.4*Robot.m_Constants.getjoystickAxis(RobotContainer.shooterAxis_3)+.6;
     
     if(Robot.m_Constants.getJoystickButton(4)){
       toggle=0;
     }
     if(Robot.m_Constants.getJoystickButton(3)){
       toggle =1;
     }
     Robot.shooter.setMaster(speed*toggle);
      SmartDashboard.putNumber("Shooter Output Top", Robot.shooter.getTopShooterOutPut() );
      SmartDashboard.putNumber("Shooter Output Bottom", Robot.shooter.getBottomShooterOutPut() );
     
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
