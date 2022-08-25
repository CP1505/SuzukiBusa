package Constructor;

public class Ex1 {

	String Name;
	int Pin;
	double Price;
	
	Ex1(String s,int p,double d){
		Name=s;
		Pin=p;
		Price=d;
		
	}
	public void test() {
		System.out.println(Name);
		System.out.println(Pin);
		System.out.println(Price);
	}
	public static void main(String[] args) {
		Ex1 z=new Ex1("XXX",1235641,45.22);
		z.test();
	}
}
