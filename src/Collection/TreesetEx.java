package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetEx {
public static void main(String[] args) {
	
	TreeSet k=new TreeSet();
	//k.add(null);
	k.add("A");
	k.add("A");
	k.add("B");
	k.add("F");
	k.add("C");
	k.add("D");
	k.add("E");
	
	System.out.println(k);
	
	System.out.println(k.size());
	System.out.println(k.contains("F"));
	System.out.println(k.first());
	System.out.println(k.last());
	
    k.pollFirst();
	System.out.println(k);
	k.pollLast();
	System.out.println(k);
	
	
	Iterator i=k.iterator();
	while(i.hasNext()) {
		System.out.print(i.next()+"  ");
	}

	
	
	
	
	
	
	
	
}
}
