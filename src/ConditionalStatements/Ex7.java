package ConditionalStatements;

public class Ex7 {

	public static void main(String[] args) {
		int age=18;
		if(age>=18) {
			System.out.println("You can enter in pubs");
		}
	
		else if (age<18) {
			System.out.println("they have to take permission from parents");
		}	
		else {System.out.println("You cant enter in");
		}
}
}