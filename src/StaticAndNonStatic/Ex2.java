package StaticAndNonStatic;

public class Ex2 {

	public void test1() {
		System.out.println("This is non static method 1.");
	}
	public void test2() {
		System.out.println("This is non static method 2.");
	}
	
	public static void main(String[] args) {
	
		Ex2 obj=new Ex2();
		obj.test1();
		obj.test2();
	
	}
}
