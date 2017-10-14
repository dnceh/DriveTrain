package org.usfirst.frc.team8.robot;

import com.ctre.CANTalon;

public class Climber extends Subsystems {
	public CANTalon climber;
	public AllJoysticks humanInterface;

	public Climber() {
		super();
		climber = new CANTalon(9);
		humanInterface = new AllJoysticks(); 
	}

	public void action() {
		if ((humanInterface.climb).getY() < 0) {
			climber.set(humanInterface.climb.getY());
		}
	}
	/*
	 * public void climb(){ if((humanInterface.climb).getY() < 0){
	 * climber.set(humanInterface.climb.getY()); } }
	 */

}
