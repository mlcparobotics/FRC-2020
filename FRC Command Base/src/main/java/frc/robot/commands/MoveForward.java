/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;

public class MoveForward extends CommandBase {

  
    
  public MoveForward() {
    
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(Robot.driveTrain);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    Robot.driveTrain.setRightInverted(true);
    
    
   
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    // Robot.driveTrain.resetBothEncoders();
    // while(Robot.driveTrain.getLeftDriveEncoderDistance()<3){
    //   Robot.driveTrain.setBothMotors(Robot.m_Constants.magicMoveForwardAt4,-Robot.m_Constants.magicMoveForwardAt4 );
    
      Robot.driveTrain.setBothMotors(-.5,.5);
  
    
    
  
    
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
