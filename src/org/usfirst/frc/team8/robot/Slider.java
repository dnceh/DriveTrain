package org.usfirst.frc.team8.robot;
import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.interfaces.Potentiometer;

public class Slider extends Subsystems{
	Potentiometer pot; 
	CANTalon sliderTalon = new CANTalon(7); 
	AllJoysticks humanInterface; 
	double sliderSpeed = 0; 
	double fullRange = 0; 
	double maxValue = 0; 
	double minValue = 0; 
	
	public Slider(){
		super(); 
		pot = new AnalogPotentiometer(8); 
		sliderTalon.set(0);
	}
	
	public void action(){
		if(Math.abs(pot.get()) < fullRange){
			sliderSpeed = (humanInterface.slider).getX(); 
			sliderTalon.set(sliderSpeed);
		}
		else if((pot.get() > fullRange) && (sliderSpeed < 0)){
			sliderTalon.set(sliderSpeed);
		}
		else if((pot.get() < fullRange) && (sliderSpeed > 0)){
			sliderTalon.set(sliderSpeed);
		}
		else{
			sliderTalon.set(0);
		}
	}
}
