package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortingOfArrayListEx2 {
public static void main(String[] args) {
	ArrayList<String> z=new ArrayList<String>();
	z.add("Aurangabad");
	z.add("Banglore");
	z.add("Colkatta");
	z.add("Delhi");
	z.add("Mumbai");
	z.add("Ahmdabad");
	z.add(0,"Anu");
	z.add("anushri");
	System.out.println(z);
	
    Collections.sort(z);
    System.out.println(z);
     
    Collections.reverse(z);
    System.out.println(z);
  
    Collections.sort(z,Collections.reverseOrder());
    System.out.println(z);
   
	Iterator x=z.iterator();
	while(x.hasNext()) {
		System.out.print(x.next()+"   ");
	}
	
	
	
	
}
}
