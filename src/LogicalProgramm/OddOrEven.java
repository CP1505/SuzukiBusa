package LogicalProgramm;

public class OddOrEven {
public static void main(String[] args) {
	int a[]= {10,20,30,40,50,60,33,19};
	int even=0;
	int odd=0;
	for(int i=0;i<a.length;i++) {
		if(a[i]%2==0) {
			//even=even+1;
			even++;
		
		}
		else {odd=odd+1;
			
		}
	}System.out.println("Number of even number="  +even);
	System.out.println("Number of odd number="  +odd);
	
}
}
