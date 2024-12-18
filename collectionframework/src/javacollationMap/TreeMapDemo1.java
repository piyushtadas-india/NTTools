package javacollationMap;

import java.util.TreeMap;

public class TreeMapDemo1 {

	public static void main(String[] args) {
		
		TreeMap tm = new TreeMap();
		tm.put("piyush",101);
		tm.put("ram",102);
		tm.put("Arjun",103);
		System.out.println(tm); // {Arjun=103, piyush=101, ram=102}
		
		// it's soppert the sorting piyush is key 
		//key will be sorting by alphabetical order
	}

}
