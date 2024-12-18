package javacollationSet;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		hs.add(20);
		hs.add(50);
		hs.add(60);
		hs.add(10);
		System.out.println(hs);
		
		HashSet hs1 = new HashSet(hs);
		hs1.add("piyush");
		hs1.add("ravi");
		hs1.add("gaurav");
		System.out.println(hs1);
	}
}
