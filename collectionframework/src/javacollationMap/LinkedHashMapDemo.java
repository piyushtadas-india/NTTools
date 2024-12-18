package javacollationMap;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
		LinkedHashMap lhm = new LinkedHashMap();
		lhm.put(101, "tech");
		lhm.put(102, "dive");
		lhm.put(103, "live");
		lhm.put(104, "bik");
		lhm.put(100, "car"); //  insertion order retrive kete
		System.out.println(lhm); // {101=tech, 102=dive, 103=live, 104=bik, 100=car}
		
		System.out.println(lhm.values()); //[tech, dive, live, bik, car]
		
		System.out.println(lhm.keySet()); //[101, 102, 103, 104, 100]
		
		System.out.println(lhm.entrySet()); // [101=tech, 102=dive, 103=live, 104=bik, 100=car]
		
	}
}
