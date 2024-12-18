package javacollationMap;
import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(101, "piyush");
		hm.put(102, "tushar");
		hm.put(103, "durgesh");
		hm.put(104, "gitesh");
		hm.put(102, "pallavi");
		hm.put(null, "ram");
		System.out.println(hm);
		hm.replace(102, "sakshi");
		System.out.println(hm);
		
		HashMap hm1 = new HashMap(hm);
		hm1.put(105, null);
		hm1.put(106, null);
		System.out.println(hm1);
		System.out.println(hm.get(103));
		
	
	
	}

}
