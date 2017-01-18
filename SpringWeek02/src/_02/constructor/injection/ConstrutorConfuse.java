package _02.constructor.injection;

public class ConstrutorConfuse {

	private String stringProperty;
	private int intProperty;
	
	public ConstrutorConfuse(String stringProperty) {
		super();
		this.stringProperty = stringProperty;
		System.out.println("string property constructor");
	}
	
	
	
	public ConstrutorConfuse(int intProperty) {
		super();
		this.intProperty = intProperty;
		System.out.println("int property constructor");
	}



	@Override
	public String toString() {
		return "ConstrutorConfuse [stringProperty=" + stringProperty + ", intProperty=" + intProperty + "]";
	}
	
	
	
}
