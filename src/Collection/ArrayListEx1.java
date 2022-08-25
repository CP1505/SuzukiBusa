package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListEx1 {

	public static void main(String[] args) {
		//Way=1 common declareation
		//way=2 generic declareation
		//Way=1
		
		ArrayList al=new ArrayList();
		
		//Way=2
		//ArrayList <String> al=new ArrayList <String>();
		
		//Hetrogeneous Data
		al.add(10);
		al.add(20);
		al.add("ABC");
		al.add(3);
		al.add('C');
		al.add(10);
		System.out.println(al);
		al.add(2, 'K');
		System.out.println(al);
		//To replace value by index no
		al.set(1, 40);
		System.out.println(al);
		//remove value wrt index
		al.remove(2);
		System.out.println(al);
		//Empty or not
		al.isEmpty();
		System.out.println(al.isEmpty());
		//size
		System.out.println(al.size());
		//index
		System.out.println(al.indexOf("ABC"));
		//last index
		System.out.println(al.lastIndexOf(10));
		//contains
		System.out.println(al.contains("XYZ"));
		//Find value at perticular index
		System.out.println(al.get(2));
		
		//Reading values from arraylist
		
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+"  ");
		}
		System.out.println();
		
		
		Collections.reverse(al);
		Iterator itr1=al.iterator();
		while(itr1.hasNext()) {
			System.out.print(itr1.next()+ "  ");
		}
		
		
		
		
		
		
		
		
	}
}
