package org.usfirst.frc.team8.robot;

import edu.wpi.first.wpilibj.Joystick;

public class AllJoysticks{
	public Joystick driveStick, rotation, slider, climb;
	public AllJoysticks(){
		driveStick = new Joystick(1);
		rotation = new Joystick(2);
		slider = new Joystick(3); 
		climb = new Joystick(4); 
	}
}
