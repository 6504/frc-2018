// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc6504.MyRobot;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.drive.MecanumDrive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */

//IGNORE THE ANALOG GYRO - IT DOESN'T WORK

public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController driveTrainFrontLeft;
    public static SpeedController driveTrainBackLeft;
    public static SpeedController driveTrainFrontRight;
    public static SpeedController driveTrainBackRight;
    public static MecanumDrive driveTrainRobotDrive;
    public static AnalogGyro driveTrainMyGyro;
    public static Compressor pneumaticsSubsystemCompressor1;
    public static DoubleSolenoid pneumaticsSubsystemDoubleSolenoid1;
    public static DoubleSolenoid pneumaticsSubsystemDoubleSolenoid2;
    public static SpeedController liftStage1SubsystemSpeedController1;
    public static DigitalInput liftStage1SubsystemLimitSwitch1;
    public static PowerDistributionPanel pDPSystemPDP;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static ADXRS450_Gyro gyro; //Real gyro 
    
    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainFrontLeft = new Spark(1);
        LiveWindow.addActuator("DriveTrain", "Front Left", (Spark) driveTrainFrontLeft);
        driveTrainFrontLeft.setInverted(false);
        driveTrainBackLeft = new Spark(0);
        LiveWindow.addActuator("DriveTrain", "Back Left ", (Spark) driveTrainBackLeft);
        driveTrainBackLeft.setInverted(false);
        driveTrainFrontRight = new Spark(3);
        LiveWindow.addActuator("DriveTrain", "Front Right", (Spark) driveTrainFrontRight);
        driveTrainFrontRight.setInverted(false);
        driveTrainBackRight = new Spark(2);
        LiveWindow.addActuator("DriveTrain", "Back Right", (Spark) driveTrainBackRight);
        driveTrainBackRight.setInverted(false);
        driveTrainRobotDrive = new MecanumDrive(driveTrainFrontLeft, driveTrainBackLeft,
              driveTrainFrontRight, driveTrainBackRight);
        LiveWindow.addActuator("DriveTrain", "Robot Drive", driveTrainRobotDrive);
        driveTrainRobotDrive.setSafetyEnabled(true);
        driveTrainRobotDrive.setExpiration(0.1);
        driveTrainRobotDrive.setMaxOutput(1.0);

        driveTrainMyGyro = new AnalogGyro(0);
        LiveWindow.addSensor("DriveTrain", "MyGyro", driveTrainMyGyro);
        driveTrainMyGyro.setSensitivity(0.007);
        pneumaticsSubsystemCompressor1 = new Compressor(0);
        LiveWindow.addActuator("PneumaticsSubsystem", "Compressor 1", pneumaticsSubsystemCompressor1);
        
        pneumaticsSubsystemDoubleSolenoid1 = new DoubleSolenoid(0, 5, 4);
        LiveWindow.addActuator("PneumaticsSubsystem", "Double Solenoid 1", pneumaticsSubsystemDoubleSolenoid1);
        
        pneumaticsSubsystemDoubleSolenoid2 = new DoubleSolenoid(0, 7, 6);
        LiveWindow.addActuator("PneumaticsSubsystem", "Double Solenoid 2", pneumaticsSubsystemDoubleSolenoid2);
        
        liftStage1SubsystemSpeedController1 = new Spark(8);
        LiveWindow.addActuator("LiftStage1Subsystem", "Speed Controller 1", (Spark) liftStage1SubsystemSpeedController1);
        liftStage1SubsystemSpeedController1.setInverted(false);
        liftStage1SubsystemLimitSwitch1 = new DigitalInput(0);
        LiveWindow.addSensor("LiftStage1Subsystem", "Limit Switch 1", liftStage1SubsystemLimitSwitch1);
        
        pDPSystemPDP = new PowerDistributionPanel(0);
        LiveWindow.addSensor("PDPSystem", "PDP", pDPSystemPDP);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        
        gyro = new ADXRS450_Gyro(); //Real gyro
    }
}
