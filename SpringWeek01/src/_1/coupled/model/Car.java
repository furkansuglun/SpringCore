package _1.coupled.model;

public class Car {

	private Tire tire;
	
	public Car() {
		tire = new Tire();
		//bu noktada g�bekten ba�l�
		
		//coupling ; bir sinifin diger sinifi ne kadar/nasil bildigi ve uyelerine nasil eristigi ile ilgili bir kavramdir.
	}

	public void drive() {
		tire.useTire();
	}
	
}
