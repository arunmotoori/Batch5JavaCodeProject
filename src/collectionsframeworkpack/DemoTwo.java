package collectionsframeworkpack;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DemoTwo {
	
	public static void main(String[] args) {
		
		Map<String,Object> map = new HashMap<>();
		
		map.put("First Name","Arun");
		map.put("Last Name","Motoori");
		map.put("Experience",17);
		map.put("Place","Hyderabad");
		map.put("Working",false);
		map.put("Payment",'$');
		map.put("Working",true);
		map.put("Location","Hyderabad");
		
		for(Entry<String, Object> o : map.entrySet()) {
			System.out.println(o.getKey()+" : "+o.getValue());
		}
		
//		for(String k : map.keySet()) {
//			System.out.println(k+" --- "+map.get(k));
//		}
		
//		System.out.println(map);
		
	}

}
