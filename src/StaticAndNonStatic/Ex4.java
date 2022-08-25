package StaticAndNonStatic;

public class Ex4 {

	static int a=10;
	int b=20;
	
	public static void t() {
		System.out.println("hi");
	}
	public void m() {
		System.out.println("hello");
	}
	
	public void n() {
		System.out.println("dasdfesf");
		
		t();
		m();
	}
	public static void main(String[] args) {
		
		
	}
	
	
}
