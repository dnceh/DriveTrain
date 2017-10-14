package org.usfirst.frc.team8.robot;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.interfaces.Potentiometer;

public class DriveTrain extends Subsystems{
	Potentiometer potentSlider;
	AllJoysticks humanInterface; 
	public CANTalon left_side1, left_side2, left_side3, right_side1, right_side2, right_side3; 
	public DriveTrain(){
		super(); 
		left_side1 = new CANTalon(1);
		left_side2 = new CANTalon(2);
		left_side3 = new CANTalon(3);
		right_side1 = new CANTalon(4);
		right_side2 = new CANTalon(5);
		right_side3 = new CANTalon(6);
		humanInterface = new AllJoysticks(); 
	}
	
 
	double leftSpeed = 0; 
	double rightSpeed = 0;  
	double robotRotation = 0; 
	
	public void action(){
		leftSpeed = -(humanInterface.driveStick).getY(); 
		rightSpeed = -(humanInterface.driveStick).getY(); 
		robotRotation = (humanInterface.rotation).getX(); 
		
		leftSpeed += robotRotation; 
		rightSpeed -= robotRotation; 
			
		rightSpeed = -rightSpeed; 
		
		left_side1.set(leftSpeed);
		left_side2.set(leftSpeed);
		left_side3.set(leftSpeed);
		right_side1.set(rightSpeed);
		right_side2.set(rightSpeed);
		right_side3.set(rightSpeed);
	}

}
