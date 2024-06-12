package streamAPI;

import java.util.*;
import java.util.stream.Collectors;
public class StreamAPI_Codes {
	public static void main(String args[]) {
		Map<String, Integer> map=new HashMap<>();
		map.put("A", 100);
		map.put("B", 200);
		map.put("C", 300);
		map.put("D", 100);
		
		//map.entrySet().stream().forEach(m->System.out.println(m));
		
		List<String> keys=map.keySet().stream().filter(k->map.get(k)!=100).collect(Collectors.toList());
		//System.out.println(keys);
		
		List<String> en=map.entrySet().stream().filter(e->e.getValue()!=100).map(Map.Entry::getKey).collect(Collectors.toList());
		//System.out.println(en);
		
		Optional<Map.Entry<String, Integer>> findFirst=map.entrySet().stream().findFirst();
		System.out.println(findFirst);
		
		Collection<Integer> val=map.values();
		System.out.println(val);
		
		List<Integer> values=map.values().stream().collect(Collectors.toList());
		System.out.println(values);
		
		String colours[]= {"Pink", "Blue", "Purple", "Green", "Yellow"};
		//Arrays.stream(colours).forEach(c->System.out.println(c));
		
		List<String> resColours=Arrays.stream(colours).filter(c->c.startsWith("P") || (c.endsWith("e"))).collect(Collectors.toList());
		//System.out.println(resColours);
		
		Map<Integer, String> map1=new HashMap<>();
		map1.put(1, "CB");
		map1.put(2, "CB");
		map1.put(3, "BB");
		map1.put(4, "CB");
		
		Map<Object, Object> resMap=map1.entrySet().stream().filter(e -> e.getValue().equals("CB")).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println(resMap);
		
		Optional<Map.Entry<Object, Object>> find=resMap.entrySet().stream().findFirst();
		System.out.println(findFirst);
		
	}
}
