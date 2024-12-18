package javacollationQueue;
import java.util.*;
public class ArrayDequeDemo {

	public static void main(String[] args) {
		
		ArrayDeque ad = new ArrayDeque();
		ad.offer(1);
		ad.offer(2);
		ad.offer(3);
		ad.offer(4);
		
		System.out.println(ad);
		ad.offerFirst(0);
		ad.offerLast(5);
		System.out.println(ad);
		System.out.println(ad.size());
		
	}

}
// add() --> madhe exception yet.
// offer() --> exception nahi yet