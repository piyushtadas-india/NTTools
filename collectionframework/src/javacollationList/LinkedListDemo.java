package javacollationList;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList li = new LinkedList();
		li.add(1);
		li.add("D");
		li.add("piyush");
		li.add(1,50);
		
		li.set(1, 100);
		li.remove("piyush");
	
		System.out.println(li); 
		
		
		for(int i=0; i<li.size(); i++) {
			System.out.println(li.get(i));
		}
	
	}
}
