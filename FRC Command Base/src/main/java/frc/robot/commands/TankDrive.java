/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;


import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;
import frc.robot.RobotContainer;

public class TankDrive extends CommandBase {
  /**
   * Creates a new TankDrive.
   */
  double toggle=1;
  public TankDrive() {
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
    
    if(Robot.m_Constants.getJoystickButton(3)){
      toggle=-1;
    }
    if(Robot.m_Constants.getJoystickButton(2)){
      toggle =1;
    }
    double RightY = Robot.m_Constants.driveControllerAxis(RobotContainer.Right_Stick_5);
    double LeftY = Robot.m_Constants.driveControllerAxis(RobotContainer.Left_Stick_1);
    Robot.driveTrain.setBothMotors((LeftY*.8),(-RightY*.8));
    
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
