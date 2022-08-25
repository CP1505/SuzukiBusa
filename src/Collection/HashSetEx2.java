package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx2 {
public static void main(String[] args) {
	
	HashSet<Integer> h=new HashSet<Integer>();
	h.add(null);
	h.add(null);
	h.add(10);
	h.add(10);
	h.add(20);
	h.add(30);
	h.add(60);
	System.out.println(h);
	System.out.println(h.contains(30));
	System.out.println(h.isEmpty());
	h.remove(20);
	System.out.println(h);
	
	System.out.println(h.size());
	
	//read
	Iterator x=h.iterator();
	while(x.hasNext()) {
		System.out.println(x.next()+"  ");
	}
	
	//advance forloop
	System.out.println();
	for(Integer m:h) {
		System.out.print(m+"  ");
	}
	
}
}
