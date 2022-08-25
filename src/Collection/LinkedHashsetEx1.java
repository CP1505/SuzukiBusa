package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashsetEx1 {

	public static void main(String[] args) {
		LinkedHashSet l=new LinkedHashSet();
		
		l.add(null);
		l.add(null);
		l.add("Ausa");
		l.add("Latur");
		l.add("Mumbai");
		l.add("Ahamdabaad");
		l.add("Noida");
		l.add("Sector11");
		System.out.println(l);
		
		l.add("Ausa");
		
		System.out.println(l.contains("Noida"));
		
		l.remove("Ausa");
		System.out.println(l);
		System.out.println(l.remove("Nagpur"));
		
		
		System.out.println(l);
		
	System.out.println(l.size());
	
	Iterator itr=l.iterator();
	while(itr.hasNext()) {
		System.out.print(itr.next()+"  ");
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
