package java8basic;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapClass {
	public static void main(String a[]) {
		  HashMap<String, String> hashMap = new HashMap<>();
		  hashMap.put("CSLT", "Cơ hashMapsở lập trình");
		    hashMap.put("C++", "C++");
		    hashMap.put("C#", "C Sharp");
		    hashMap.put("PHP", "PHP");
		    hashMap.put("Java", "Java");
		  HashMap<String, String> hashMap1 = new HashMap<>();
		    hashMap.put("CSLT", "1");
		    hashMap.put("C++", "1");
		    hashMap.put("C#", "1");
		    hashMap.put("PHP", "1");
		    hashMap.put("Java", "1");
		    
		    
		    
		    }
		    
	private Map<String, Boolean> areEqualKeyValues(Map<String, String> first, Map<String, String> second) {
	    return first.entrySet().stream()
	      .collect(Collectors.toMap(e -> e.getKey(), 
	        e -> e.getValue().equals(second.get(e.getKey()))));
	}
		    
	
}
