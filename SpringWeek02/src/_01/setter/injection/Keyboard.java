package _01.setter.injection;

public class Keyboard {

	private String model;
	private String price;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Keyboard [model=" + model + ", price=" + price + "]";
	}
	
	
	
	
	
}
