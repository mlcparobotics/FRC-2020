/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.InvertType;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;
/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
 private TalonSRX shooterTop = new TalonSRX(1);
 private TalonSRX shooterBottom = new TalonSRX(0);
 private Joystick controller = new Joystick(0);  
//  private Spark leftMaster = new Spark(0);
//  private Spark leftSlave = new Spark(0);
//  private Spark rightMaster = new Spark(1);
//  private Spark rightSlave = new Spark(1);
//changes the defualt of 4x to 2x (decrease chance of jitter)
//Encoder encoder = new Encoder(0, 1, false, Encoder.EncodingType.k2X);  
 private Spark intake = new Spark(2);
 private Spark leftDrive = new Spark(1);
 private Spark rightDrive = new Spark(0);
 private Encoder leftDriveEncoder = new Encoder(0,1);
 private Encoder rightDriveEncoder = new Encoder(2,3);
private DifferentialDrive drive = new DifferentialDrive(leftDrive, rightDrive);
 
 //private DifferentialDrive drive = new DifferentialDrive(leftMaster, rightMaster); 
 @Override
 
 public void robotPeriodic() {
  
 }
 
 @Override
  public void robotInit() {
    shooterTop.setInverted(false);
    shooterBottom.follow(shooterTop);
    shooterBottom.setInverted(InvertType.FollowMaster);

    shooterTop.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative,0,10);
    shooterTop.setSelectedSensorPosition(0, 0, 10);
  
      //1= feet 256= one pulse -technically-
    leftDriveEncoder.setDistancePerPulse(1./256.);
    rightDriveEncoder.setDistancePerPulse(1./256.);
  
  }

  @Override
  public void autonomousInit() {
  }
@Override
 public void autonomousPeriodic(){
  
 }
//  @Override
//  public void autonomousPeriodic(1){

// }
  @Override
  public void teleopInit() {
  }

  @Override
  public void teleopPeriodic() {
    double speed = controller.getThrottle();
    if(speed<0){
      shooterTop.set(ControlMode.PercentOutput, Math.abs(speed));
    }else{
      shooterTop.set(ControlMode.PercentOutput, 0);
    
    }
    
  if(controller.getRawButton(5)){
    leftDriveEncoder.reset();
    if(leftDriveEncoder.getDistance()<2){
      drive.tankDrive(.3, -.3);
    }
  }
    intake.setSpeed(controller.getY());
   
    NetworkTable table = NetworkTableInstance.getDefault().getTable("limelight");
NetworkTableEntry tx = table.getEntry("tx");
NetworkTableEntry ty = table.getEntry("ty");
NetworkTableEntry ta = table.getEntry("ta");

//read values periodically
double x = tx.getDouble(0.0);
double y = ty.getDouble(0.0);
double area = ta.getDouble(0.0);

//post to smart dashboard periodically
SmartDashboard.putNumber("LimelightX", x);
SmartDashboard.putNumber("LimelightY", y);
SmartDashboard.putNumber("LimelightArea", area);    
    SmartDashboard.putNumber("Shooter Top Encoder", shooterTop.getMotorOutputPercent());
    SmartDashboard.putNumber("Shooter Bottom Encoder", shooterBottom.getMotorOutputPercent());
    SmartDashboard.putNumber("Shooter Top Temp", shooterTop.getTemperature());
    SmartDashboard.putNumber("Shooter Bottom Temp", shooterBottom.getTemperature());
    SmartDashboard.putNumber("Encoder Left Drive", leftDriveEncoder.getDistance());
    SmartDashboard.putNumber("Shooter Top ", shooterTop.getActiveTrajectoryVelocity());
    
    SmartDashboard.putNumber("Encoder Right Drive", rightDriveEncoder.getDistance());
  }

  @Override
  public void testInit() {
  }

  @Override
  public void testPeriodic() {
    intake.setSpeed(controller.getY()*.5);
  }

}
