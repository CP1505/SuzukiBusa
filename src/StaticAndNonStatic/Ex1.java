package StaticAndNonStatic;

public class Ex1 {
	
	public static void test() {
		System.out.println("This is static method 1.");
		
	}
 
	public static void test2() {
		System.out.println("This is ststic method 2.");
	}
	
	
	
	public static void main(String[] args) {
		Ex1.test();
		Ex1.test2();
	test();
	}
//	
}
