// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc6504.MyRobot.subsystems;

import org.usfirst.frc6504.MyRobot.RobotMap;
import org.usfirst.frc6504.MyRobot.commands.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class LiftStage1Subsystem extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final SpeedController speedController1 = RobotMap.liftStage1SubsystemSpeedController1;
    private final DigitalInput limitSwitch1 = RobotMap.liftStage1SubsystemLimitSwitch1;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    @Override
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

    public static boolean limitReached() {
    	boolean reachedLimit;
    	if(RobotMap.liftStage1SubsystemLimitSwitch1.get()) {
     	   reachedLimit = true;
        } else {
     	   reachedLimit = false;
        }
    	return reachedLimit;
    }
    
    @Override
    public void periodic() {
        // Put code here to be run every loop
        SmartDashboard.putBoolean("Lift limit reached", limitReached());
    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void stop() {
    	speedController1.set(0);
    	speedController1.stopMotor();
    }
}

