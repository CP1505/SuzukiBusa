package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx2 {
public static void main(String[] args) {
	
	ArrayList z=new ArrayList();
	z.add(1505);
	z.add(10);
	z.add(20);
	z.add(30);
	z.add("Ausa");
	z.add("Ausa");
	z.add("Latur");
	z.add(1505);
	
	z.add(null);
	z.add(null);
	System.out.println(z);
	System.out.println(z.contains(30));
	System.out.println(z.isEmpty());
	System.out.println(z.indexOf("Ausa"));
	System.out.println(z.get(2));
	System.out.println(z.lastIndexOf("Ausa"));
	z.remove(1);
	System.out.println(z);
	z.set(2,"Pune");
	System.out.println(z);
	System.out.println(z.size());
	
	Iterator x=z.iterator();
	while(x.hasNext()) {
		System.out.print(x.next()+"   ");
	}
	//by using advance for loop
	
	for(Object m:z) {
		System.out.print(m+"  ");
	}
	
	}
}
