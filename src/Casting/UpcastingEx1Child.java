package Casting;

public class UpcastingEx1Child extends UpcastingEx1Parent{

	public void test1() {
		System.out.println("This is child class");
	}
	
	public static void main(String[] args) {
		
		UpcastingEx1Parent z=new UpcastingEx1Parent();
		z.test();
		System.out.println("*************************");
		UpcastingEx1Child x=new UpcastingEx1Child();
		x.test();x.test1();
		x.test1();
		System.out.println("++++++++++++++++++++++++++++++");
		//upcasting 
		
		UpcastingEx1Parent c=new UpcastingEx1Child ();
		c.test();
		
	}
	
	
	
	
	
}
