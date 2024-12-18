package javacollationSet;

import java.util.Iterator;
import java.util.LinkedHashSet;
// Linkedhash set 
public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		LinkedHashSet<String> lhs = new LinkedHashSet();
		lhs.add("piyush");
		lhs.add("ravi");
		lhs.add("Om");
		lhs.add("Ram");
		lhs.add("Sun");
		System.out.println(lhs);

		 Iterator<String> itr = lhs.iterator();
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
		 }
	}

}
