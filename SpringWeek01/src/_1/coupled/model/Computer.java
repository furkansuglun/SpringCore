package _1.coupled.model;

public class Computer {
	
	private Keyboard keyboard;
	
	//computer has a keyboard �nermesi do�rudur. 
	public Computer() {
		//burada Computer ile Keyboard birbirine tight coupled(ba�l�d�r)
		//yani ; keyboard sinifinda yapilandiricisinda olan herhangi bir degisiklik direkt olarak Computer sinifini etkilemektedir.
		keyboard = new Keyboard();
	}
	
	
	public void lenovo() {
		keyboard.tusBas();
	}
}
