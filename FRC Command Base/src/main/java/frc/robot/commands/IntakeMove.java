/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

//import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.CommandBase;
//import frc.robot.Constants;
import frc.robot.Robot;
import frc.robot.RobotContainer;

public class IntakeMove extends CommandBase {
  /**
   * Creates a new IntakeMove.
   */
  public IntakeMove() {
    // Use addRequirements() here to declare subsystem dependencies.
   // addRequirements(Robot.intakeMove);
   addRequirements(Robot.intake);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if(Robot.m_Constants.getJoystickButton(RobotContainer.button_5)){
      Robot.intake.setBothMotors(Robot.m_Constants.magicNumIntake);

    }else if(Robot.m_Constants.getJoystickButton(RobotContainer.button_11)){
      Robot.intake.setBothMotors(Robot.m_Constants.magicNumIntake*1.5);
    }
    else{
      Robot.intake.setBothMotors(0);

    }
  
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
