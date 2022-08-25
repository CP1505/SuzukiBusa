package InterfaceHybrid;

public class Ex1C2 extends Ex1 implements Ex1In2,Ex1In {


	public void test1() {
		System.out.println("Test1");
		
	}

	
	public void test2() {
	System.out.println("Test 2");
		
	}


	public void test3() {
		System.out.println("Test3");
		
	}

	
	public void test4() {
	System.out.println("test 4");
		
	}
public static void main(String[] args) {
	Ex1C2 z=new Ex1C2();
	z.test();
	z.test1();
	z.test2();
	z.test3();
	z.test4();
	
	
	
}

	

}
