package Interface;

public class Ex1Main {

	public static void main(String[] args) {
		//object creation
		Ex1Child z=new Ex1Child();
		z.test1();
		z.test2();
		z.add(10, 20);
		z.add1(20, 300);
		System.out.println(z.add1(20, 300));
		
	}
}
