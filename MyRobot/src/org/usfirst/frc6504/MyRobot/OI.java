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

import org.usfirst.frc6504.MyRobot.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton liftSystemUpButton;
    public JoystickButton liftSystemDownButton;
    public JoystickButton pneumaticIn;
    public JoystickButton pneumaticOut;
    public Joystick xbox360joyStick1;
    public Joystick logitechJoystick0;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        logitechJoystick0 = new Joystick(1);
        
        xbox360joyStick1 = new Joystick(0);
        
        pneumaticOut = new JoystickButton(xbox360joyStick1, 2);
        pneumaticOut.whenPressed(new PneumaticIntakeOut());
        pneumaticIn = new JoystickButton(xbox360joyStick1, 1);
        pneumaticIn.whenPressed(new PneumaticIntakeIn());
        liftSystemDownButton = new JoystickButton(xbox360joyStick1, 6);
        liftSystemDownButton.whileHeld(new LiftDown());
        liftSystemUpButton = new JoystickButton(xbox360joyStick1, 5);
        liftSystemUpButton.whileHeld(new LiftUp());


        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        SmartDashboard.putData("Drive Forward", new DriveForward());
        SmartDashboard.putData("Turn Left", new TurnLeft());
        SmartDashboard.putData("Turn Right", new TurnRight());
        SmartDashboard.putData("Drive Backward", new DriveBackward());
        SmartDashboard.putData("Lift Up", new LiftUp());
        SmartDashboard.putData("Lift Down", new LiftDown());
        SmartDashboard.putData("PneumaticPiston", new PneumaticPiston());
        SmartDashboard.putData("Pneumatic Intake In", new PneumaticIntakeIn());
        SmartDashboard.putData("Pneumatic Intake Out", new PneumaticIntakeOut());
        SmartDashboard.putData("Test", new Test());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getxbox360joyStick1() {
        return xbox360joyStick1;
    }

    public Joystick getLogitechJoystick0() {
        return logitechJoystick0;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

