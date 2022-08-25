package Overridding;

public class Ex2Child1 extends Ex2 {

	public void Bike() {
		System.out.println("Price Under 32k");
	}
	public int Wheels() {
		return 2;
	}    // child class has allow to redefine the logic for same method
}
