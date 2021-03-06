/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide
 * numerical or boolean constants. This class should not be used for any other
 * purpose. All constants should be declared globally (i.e. public static). Do
 * not put anything functional in this class.
 *
 * <p>
 * It is advised to statically import this class (or one of its inner classes)
 * wherever the constants are needed, to reduce verbosity.
 */
public final class Constants {
    private Joystick driveController = new Joystick(RobotContainer.Drive_Controller_0);
    private Joystick joystick = new Joystick(RobotContainer.Joystick_1);
    public double getjoystickAxis(int axis){
        return joystick.getRawAxis(axis);
    }
    public boolean getJoystickButton(int button){
        return joystick.getRawButton(button);
    }
    public double driveControllerAxis(int axis){
       return driveController.getRawAxis(axis);
    }
    public boolean getDriveControllerButton(int button){
        return driveController.getRawButtonPressed(button);
    }
    public double magicNegFlip = -1;
    public double flipControl = 0;
    public double magicNumIntake = -.5;
    public double magicNumConvey = .3;
    public double magicMoveForwardAt4 = .3;

}
