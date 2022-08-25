package Overridding;

public class Ex2Main {
public static void main(String[] args) {
	Ex2Child1 z=new Ex2Child1();
	z.Vehical();
	z.Bike();

	System.out.println(z.Wheels());
	System.out.println("***************************");
	
	Ex2Child2 x=new Ex2Child2();
	x.Vehical();
	x.Car();
	System.out.println(x.Wheels());
	System.out.println("***************************");
	Ex2Child3 c=new Ex2Child3();
	c.Vehical();
	c.Truck();
	System.out.println(c.Wheels());
	System.out.println("***************************");
}
}
