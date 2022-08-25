package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetEx1 {

	public static void main(String[] args) {
		HashSet h=new HashSet();
		h.add(null);
		h.add(null);
		h.add("Aurangabad");
		h.add("Latur");
		h.add("Pune");
		h.add("Delhi");
		h.add("Kolkatta");
		h.add("Banglore");
		System.out.println(h);
		h.add("Latur");    //duplicate value dont take
	System.out.println(h);
	
	System.out.println(h.contains("Pune"));
	
	Iterator itr=h.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
