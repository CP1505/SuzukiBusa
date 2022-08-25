package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorEx2 {
public static void main(String[] args) {
	
	Vector v=new Vector();
	v.add(10);
	v.add(20);
	v.add("Ausa");
	v.add("Latur");
	v.add(null);
	v.add(null);
	v.add(10);
	v.add(20);
	System.out.println(v);
	System.out.println(v.size());
    System.out.println(v.capacity());
    System.out.println(v.contains(10));
    System.out.println(v.get(2));
    v.set(2,"Mumbai");
    System.out.println(v);
    v.remove(0);
    System.out.println(v);
    System.out.println(v.get(3));
    

    Iterator x=v.iterator();
    while(x.hasNext()) {
    	System.out.print(x.next()+"   ");
    }
    System.out.println();
    Enumeration en=v.elements();
    while(en.hasMoreElements()) {
    	System.out.print(en.nextElement()+"  ");
    }
    
    












 }
}
