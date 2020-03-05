/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;

import edu.wpi.first.wpilibj2.command.Command;

/**
 * This class is where the bulk of the robot should be declared.  Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls).  Instead, the structure of the robot
 * (including subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  
//Motor Controllers
      //drive PWM ports SPARKS
        public static final int Motor_Left_0 = 0;
        public static final int Motor_Right_1 = 1;
      //Shooter ID TALONS
       public static final int ShooterTop_0 = 0;
       public static final int ShooterBottom_1 = 1;
      //Intake PWM ports VICTORSP
       public static final int Intake_2 = 2;
        public static final int Intake_3 = 3;
      //Conveyer PWM ports VICTORSP
      public static final int Conveyor_6 = 6;
      //Controllers
      public static final int Joystick_1 = 1;//one stick joystick
      public static final int Drive_Controller_0 = 0;//logitech controller
      //Controller MAIN- LOGITECH
        
        public static final int Left_Stick_1 = 1;
        public static final int Right_Stick_5= 5;
        public static int Trigger_3 = 3;
        public static final int Shooter_2 = 2;
      public static final int shooterAxis_3 = 3;
//Things pressed on Large Joystickxs

public static int button_5= 5;
public static int button_6= 6;
/**
   * The container for the robot.  Contains subsystems, OI devices, and commands.
   */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings.  Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a
   * {@link edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
  }


  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
 
}
