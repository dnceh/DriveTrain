package org.usfirst.frc.team8.robot;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	final String defaultAuto = "Default";
	final String customAuto = "My Auto";
	String autoSelected;
	SendableChooser<String> chooser = new SendableChooser<>();
	RobotDrive myDrive;
	Joystick movement, rotation;
	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */

	CANTalon left_side1 = new CANTalon(1);
	CANTalon left_side2 = new CANTalon(2);
	CANTalon left_side3 = new CANTalon(3);
	CANTalon right_side1 = new CANTalon(4);
	CANTalon right_side2 = new CANTalon(5);
	CANTalon right_side3 = new CANTalon(6);

	double leftSpeed = 0; 
	double rightSpeed = 0;  
	double robotRotation = 0; 
	@Override
	public void robotInit() {
		movement = new Joystick(1);
		rotation = new Joystick(2);

	}

	@Override
	public void autonomousInit() {


	}

	/**
	 * This function is called periodically during autonomous
	 */
	@Override
	public void autonomousPeriodic() {

	}

	/**
	 * This function is called periodically during operator control
	 */
	@Override
	public void teleopPeriodic() {
		
		leftSpeed = movement.getY(); 
		rightSpeed = movement.getY(); 
		robotRotation = rotation.getX(); 
		
		leftSpeed -= robotRotation; 
		rightSpeed += robotRotation;
		leftSpeed = -leftSpeed; 
		
		left_side1.set(leftSpeed);
		left_side2.set(leftSpeed);
		left_side3.set(leftSpeed);
		right_side1.set(rightSpeed);
		right_side2.set(rightSpeed);
		right_side3.set(rightSpeed);

	}

}
