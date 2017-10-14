package org.usfirst.frc.team8.robot;

import edu.wpi.first.wpilibj.Joystick;

public class AllJoysticks{
	public Joystick driveStick, rotation, slider, climb;
	public AllJoysticks(){
		driveStick = new Joystick(0);
		rotation = new Joystick(1);
		slider = new Joystick(3); 
		climb = new Joystick(2); 
	}
}
