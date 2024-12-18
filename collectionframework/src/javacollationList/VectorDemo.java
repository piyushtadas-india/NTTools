package javacollationList;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector<String> vec = new Vector<String>();
		
		vec.add("piyush");
		vec.add("Ravi");
		vec.add("Mohan");
		vec.add("Rohan");
		
		System.out.println(vec);
		System.out.println(vec.size());
		System.out.println(vec.capacity());
		System.out.println(vec.remove(2));
		System.out.println(vec.indexOf("Rohan"));
		System.out.println(vec.lastElement());
	}

}
