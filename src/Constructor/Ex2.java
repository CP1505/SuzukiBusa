package Constructor;

public class Ex2 {

	int BikeNo;
	String BikeName;
	double BikePrice;
	char Type;
	
	Ex2(){
		System.out.println("This Is zero Argument Constructor");
	}
	Ex2(int a,String b,double c,char d){
		BikeNo=a;
		BikeName=b;
		BikePrice=c;
		Type=d;
	}
	public void Test() {
		System.out.println(BikeName+" " + BikeNo+" "+ BikePrice+" "+Type);
	}
	public static void main(String[] args) {
		Ex2 z=new Ex2(12,"Honda",12.2,'A');
		z.Test();
				
	}
}
