package javacollationMap;
import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
	
		Map map = new HashMap();
		map.put(101, "piyush");
		map.put(102,"gitesh");
		map.put(103,"tushar");
		System.out.println(map);
// o/p :--> {101=piyush, 102=gitesh, 103=tushar}
		
		map.put(103,"durgesh");
		System.out.println(map);
// o/p:--> {101=piyush, 102=gitesh, 103=durgesh}
// 103 key value is upadate tushar to durgesh
		
		System.out.println(map.containsKey(101)); // true
		System.out.println(map.containsValue("piyush")); // true

	} }