package Collection;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorEx1 {
public static void main(String[] args) {
	Vector v=new Vector();
	
	v.add("Prasad");
	v.add("Pranay");
	v.add(1505);
	v.add("anu");
	v.add(202);
	v.add('H');
	System.out.println(v);

	System.out.println(v.size());
	
	System.out.println(v.contains("anu"));
	
	System.out.println(v.capacity());
	
	v.remove(2);
	System.out.println(v);
	v.isEmpty();
	System.out.println(v.isEmpty());
	
	System.out.println(v.indexOf("anu"));
	
	System.out.println(v.get(3));
	
	v.set(0, "Pune");
	System.out.println(v);
	
	
	Enumeration en=v.elements();
	while(en.hasMoreElements()) {
		System.out.println(en.nextElement());
	}
	
	Iterator itr=v.iterator();
	
	while(itr.hasNext()) {
		System.out.println(itr.next()+"   ");
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
