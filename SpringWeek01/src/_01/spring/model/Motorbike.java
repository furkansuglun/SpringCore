package _01.spring.model;

public class Motorbike implements Vehicle {

	private Wheel wheel;
	
	@Override
	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
		
	}

	@Override
	public void drive() {
		wheel.useWheel();
		//
		//bussiness logic.
		
	}

}
