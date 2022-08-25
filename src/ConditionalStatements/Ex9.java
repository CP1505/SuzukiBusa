package ConditionalStatements;

public class Ex9 {

	//nested if
	public static void main(String[] args) {
		String City="Latur";
		if(City=="Mumbai") {
			System.out.println("Mumbai is famous for Share Market investment");
		}
		else if(City=="Nagpur") {
			System.out.println("Nagpur is famous for oranges");
		}
		else if(City=="Pune") {
			System.out.println("Pune is famus for IT hub");
		}
		else if (City=="Banglor") {
			System.out.println("Banglor is famous for food");
		}
		else if (City=="New Delhi") {
			System.out.println("New Delhi is famous for Free water and free light bill");
		}else if (City=="Ahmdabad") {
			System.out.println("Ahamdabad is famous for Dhokla");
		}else {
			System.out.println("You are not from india");
		}
	}
}
