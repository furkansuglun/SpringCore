package _02.constructor.injection;

public class Computer {
	
	private String brand;
	private int price;
	
	//HAS---A
	private Keyboard keyboard;
	
	
	
	
	public Computer(String brand, int price, Keyboard keyboard) {
		super();
		this.brand = brand;
		this.price = price;
		this.keyboard = keyboard;
		
		System.out.println("computer constructor is called");
	}




	@Override
	public String toString() {
		return "Computer [brand=" + brand + ", price=" + price + ", keyboard=" + keyboard + "]";
	}
	
	
	
	
	
}
