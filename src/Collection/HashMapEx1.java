package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapEx1 {
public static void main(String[] args) {
	
	HashMap<Integer,String> h=new HashMap<Integer,String>();
	h.put(01,"Pranay Chaudhari");
	h.put(11,"Pallavi Raut");
	h.put(12,"Prasad Chavan");
	h.put(13,"Padamraj Sapate");
	h.put(14,"Karuna Kore");
	
	System.out.println(h);
	
	System.out.println(h.size());
	System.out.println(h.isEmpty());
	
	h.put(13,"Ramesh Babu");
	System.out.println(h);
	

	

	h.replace(13,"Ram");
	System.out.println(h);
	
	
	for(Entry m:h.entrySet()) {
		System.out.println(m.getKey() + " "+ m.getValue());
	}
	


	
	
	
	
	
	
	
	
	
	
	
	
}
}
