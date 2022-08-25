package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortingOfArrayListEx1 {
public static void main(String[] args) {
	
	ArrayList<String> al=new ArrayList<String>();
	
	al.add("Pune");
	al.add("Mumbai");
    al.add("Delhi");
    al.add("Banglor");
    al.add("ausa");
    System.out.println(al);
 //for assending order   
    Collections.sort(al);
    System.out.println(al);
 //for revers of assending order 
   Collections.sort(al,Collections.reverseOrder());
   System.out.println(al);
  
   Collections.reverse(al);
   System.out.println(al);
	
//	Collections.reverse(al);
	Iterator itr=al.iterator();
	while(itr.hasNext()) {
		System.out.print(itr.next()+"   ");
	}
	
	
}
	
}
