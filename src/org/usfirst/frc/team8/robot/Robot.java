package org.usfirst.frc.team8.robot;

import edu.wpi.first.wpilibj.IterativeRobot;

public class Robot extends IterativeRobot{
	Slider slider; 
	DriveTrain drivetrain; 
	AllJoysticks humanInterface; 
	Climber climb; 
	@Override 
	public void robotInit(){
		slider = new Slider(); 
		drivetrain = new DriveTrain();  
		humanInterface = new AllJoysticks(); 
		climb = new Climber(); 
	}
	@Override
	public void autonomousInit() {


	}
	@Override 
	public void teleopInit(){
		
	}

	/**
	 * This function is called periodically during autonomous
	 */
	@Override
	public void autonomousPeriodic() {

	}
	
	@Override 
	public void teleopPeriodic(){
		drivetrain.action(); 
		slider.action(); 
		climb.action(); 
	}
	
	@Override 
	public void disabledInit(){
		
	}
	
	@Override 
	public void disabledPeriodic(){
		
	}
}
