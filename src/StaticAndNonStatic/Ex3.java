package StaticAndNonStatic;

public class Ex3 {

	String Name;
	String Address;
	static int Pin=111000;
	char Wing;
	double Price;
	
	//Non static methods
	public void test1() {
		System.out.println("Name="+Name);
		System.out.println("Address="+Address);
		System.out.println("Pin="+Pin);
		System.out.println("Wing="+Wing);
		System.out.println("Price="+Price);
		
		
	}
}
