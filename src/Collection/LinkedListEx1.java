package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx1 {
public static void main(String[] args) {
	
	LinkedList l=new LinkedList();
	l.add("ABC");
	l.add("XYZ");
	l.add(10);
	l.add('K');
	l.add(777);
	System.out.println(l);
	
System.out.println(	l.isEmpty());
System.out.println(l.size());
System.out.println(l.contains("XYZ"));
System.out.println(l.get(3));

l.remove(2);
System.out.println(l);

System.out.println(l);


l.addFirst(2222);
System.out.println(l);
l.addLast(33333);
System.out.println(l);
System.out.println(l.size());

l.removeFirst();
System.out.println(l);
l.removeLast();
System.out.println(l);
System.out.println(l.size());

System.out.println(l.getFirst());
System.out.println(l.getLast());
	

	
	//read
Iterator k=l.iterator();
while(k.hasNext()) {
	System.out.print(k.next()+ "    ");
}
	
	}
}
