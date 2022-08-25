package InterfaceHybrid;

public class Ex2C2 extends Ex2 implements Ex2I2,Ex2I1{

	
	public void xiomi() {
	System.out.println("Made in chaina");
		
	}

	
	public void redmi(int a, int b) {
		System.out.println(a+b);
		
	}


	public void samsung(int a, int b, int c) {
		System.out.println(a+b-c);
		
	}


	public int apple() {
	
		return 900000;
	}

	
	public int moto(int a, int b) {
		
		return a*b;
	}

}
