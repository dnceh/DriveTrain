package org.usfirst.frc.team8.robot;
import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.interfaces.Potentiometer;

public class Slider extends Subsystems{
	Potentiometer pot; 
	CANTalon sliderTalon = new CANTalon(10); 
	AllJoysticks humanInterface; 
	double sliderSpeed = 0; 
	double fullRange = 0; 
	
	public Slider(){
		super(); 
		pot = new AnalogPotentiometer(7); 
		sliderTalon.set(0);
		humanInterface = new AllJoysticks(); 
	}
	
	public void action(){
		if ((Math.abs(pot.get()) < fullRange) || (pot.get() >= fullRange && humanInterface.slider.getX() < 0) || (pot.get() <= -fullRange && humanInterface.slider.getX() > 0)){
			sliderSpeed = (humanInterface.slider).getX(); 
		}
		else{
			sliderSpeed = 0; 
		}
		sliderTalon.set(sliderSpeed);
	}
}
