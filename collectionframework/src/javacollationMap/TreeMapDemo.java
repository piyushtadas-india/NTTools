package javacollationMap;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {

		TreeMap tm = new TreeMap();
		tm.put(105, "piyush");
		tm.put(104, "ram");
		tm.put(102, "krushna");
		tm.put(103, "Hanumaji");

		System.out.println(tm);
		System.out.println(tm.ceilingKey(106)); // null because key 105 is not present.
		System.out.println(tm.containsKey(101)); // false
		System.out.println(tm.firstKey()); // 102 because it soppert sorting order
		System.out.println(tm.size()); // 4.

	}}

