package javacollationSet;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(20);
		ts.add(10);
		ts.add(50);
		ts.add(40);
		ts.add(30);
		System.out.println(ts);
		System.out.println(ts.contains(30));
		System.out.println(ts.first());
		System.out.println(ts.last());

	}

}
