package Abstract;

public class Ex2Main {
	public static void main(String[] args) {
		Ex2ConcreteClass H1=new Ex2ConcreteClass();
		
		H1.Construction();
		System.out.println("THE NO OF BAR="+H1.Flats());
		System.out.println("THE NO OF BAR="+H1.Rowhouse());
		System.out.println("THE NO OF BAR="+H1.Bunglow());
		System.out.println("THE NO OF BAR="+H1.Duplex());
	
		
		}

}
