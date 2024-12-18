package javacollationMap;
import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {

	public static void main(String[] args) {
		Map map = new HashMap();
		map.put(101, "piyush");
		map.put(102,"gitesh");
		map.put(103,"tushar");
		System.out.println(map); //  {101=piyush, 102=gitesh, 103=tushar}
		
		System.out.println(map.get(101)); // piyush
		
		map.replace(101, "Banti");
		System.out.println(map); // {101=Banti, 102=gitesh, 103=tushar}
		
		map.remove(102);
		System.out.println(map); // {101=Banti, 103=tushar}
	}
	  }