package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortingOfArrayListEx3 {
public static void main(String[] args) {
	ArrayList<Integer> z=new ArrayList<Integer>();
	z.add(10);
	z.add(20);
	z.add(30);
	z.add(40);
	z.add(50);
	z.add(60);
	z.add(9);

	System.out.println(z);
	
	Collections.sort(z);
	System.out.println(z);
	Collections.reverse(z);
	System.out.println(z);
	
	for(Object m:z) {
		System.out.print(m+"  ");
	}
	System.out.println();
	Iterator c=z.iterator();
	while(c.hasNext()) {
		System.out.print(c.next()+"  ");
	}
	
	
}
}
