package _01.decoupled.test;

import _01.decoupled.model.Car;
import _01.decoupled.model.GoodYear;
import _01.decoupled.model.LassaTire;
import _01.decoupled.model.Vehicle;
import _01.decoupled.model.Wheel;

public class DecoupledTest {
	
	public static void main(String[] args) {
		
		Vehicle vehicle = new Car();
		Wheel wheel = new LassaTire();
		
		vehicle.setWheel(wheel);
		
		vehicle.drive();
		
		wheel = new GoodYear();
		
		vehicle.setWheel(wheel);
		
		vehicle.drive();
	}
	
}
