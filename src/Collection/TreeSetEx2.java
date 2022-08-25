package Collection;

import java.util.TreeSet;

public class TreeSetEx2 {
public static void main(String[] args) {
	TreeSet z=new TreeSet();
	z.add(100);                           //
	z.add(10);
	z.add(20);
	z.add(30);
	z.add(40);
	z.add(50);
	z.add(60);
	System.out.println(z);
	System.out.println(z.size());
	System.out.println(z.first());
	System.out.println(z.last());
	z.pollFirst();
	System.out.println(z);
	z.pollLast();
	System.out.println(z);
	System.out.println(z.contains(20));
    
    System.out.println(z.higher(20));
	
	System.out.println(z.lower(60));
	
	
	
	
	
}
}
