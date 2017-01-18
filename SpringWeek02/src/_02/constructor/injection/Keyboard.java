package _02.constructor.injection;

public class Keyboard {

	private String model;
	private String price;
	
	
	
	
	public Keyboard(String model, String price) {
		super();
		this.model = model;
		this.price = price;
		
		System.out.println("computer constructor is called");
	}




	@Override
	public String toString() {
		return "Keyboard [model=" + model + ", price=" + price + "]";
	}
	
	
	
	
	
}
