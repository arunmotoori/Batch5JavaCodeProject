package collectionsframeworkpack;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DemoOne {
	
	public static void main(String[] args) {
		
//		List<Integer> list = new ArrayList<>();
		
		Set<Integer> set = new HashSet<>();
		
		set.add(9);  
		set.add(5);  
		set.add(7);  
		set.add(1);  
		set.add(12); 
		set.add(9);  
		set.add(9);  
		set.add(9);  
		set.add(3);  
		set.add(6);  
		set.add(4);  
		set.add(9); 
		set.add(13); 
		set.add(22); 
		set.add(17); 
		set.add(99); 
		set.add(121);
		set.add(1);  
		
		for(Integer e : set) {
			System.out.println(e);
		}
		
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));			
//		}
		
//		System.out.println(list);
//		System.out.println(list.get(5));  // 9
//		System.out.println(list.get(9));  // 6
//		System.out.println(list.get(12)); // 13
		
	}

}
