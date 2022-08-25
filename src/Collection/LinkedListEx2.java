package Collection;

import java.util.LinkedList;

public class LinkedListEx2 {
public static void main(String[] args) {
	LinkedList z=new LinkedList();
	z.add(10);
	z.add(20);
	z.add("Ausa");
	z.add("Mumbai");
	z.add(50);
	System.out.println(z);
	System.out.println(z.size());
	System.out.println(z.get(1));

	z.set(2, "Ram");
	System.out.println(z);
	z.addFirst("Maa");
	System.out.println(z);
	z.addLast(1505);
	System.out.println(z);
	z.removeFirst();
	System.out.println(z);
	z.removeLast();
	System.out.println(z);
	System.out.println(z.getFirst());
	System.out.println(z.getLast());
	
	
	
	
	
	
}
}
