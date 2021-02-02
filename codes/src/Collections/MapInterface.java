package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterface {
	public static void main(String args[]) {
		
		// Doesn't take care of sequence of values entered
		Map<String, String> map = new HashMap<>();
		map.put("myName", "Soham");
		map.put("actor", "Hritik");
		map.put("ceo", "Elon");
		
		// Duplicate values are not allowed, keys are unique
		
		System.out.println(map.get("myName")); // prints Soham
		System.out.println(map.get("myName1")); // prints null
		
		// fetches key into a set keys
		Set<String> keys = map.keySet();
		for(String key: keys) {
			System.out.println(key + " " + map.get(key));
		}
		
		// HashMap is not synchronized
		// Use HashTable if need to implement thread safety synchronization
	}
	
}
