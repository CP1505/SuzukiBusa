package StaticAndNonStatic;

public class Ex3Main {

	public static void main(String[] args) {
		
		Ex3 A1=new Ex3();
		
		A1.Name="Ram";
		A1.Address="Pune";
		A1.Wing='A';
		//A1.Pin=413564;
		A1.Price=1245.36;
		A1.test1();
		
		System.out.println("======================================");
		
        Ex3 A2=new Ex3();
		
		A2.Name="Radha";
		A2.Address="Mumbai";
		A2.Wing='B';
		//A2.Pin=413234;
		A2.Price=145465.256;
		A2.test1();
		
	}
}
