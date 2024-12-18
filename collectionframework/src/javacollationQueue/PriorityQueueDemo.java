package javacollationQueue;
import java.util.Collections;
import java.util.PriorityQueue;
public class PriorityQueueDemo {
	public static void main(String[] args) {
	PriorityQueue pq = new PriorityQueue();
		pq.add(5);
		pq.add(50);
		pq.add(12);
		pq.add(76);
		pq.add(1);
		
		System.out.println(pq);
		System.out.println(pq.peek());
		pq.poll();
		System.out.println(pq);
		System.out.println(pq.peek());
		pq.poll();
		System.out.println(pq);
		System.out.println(pq.peek());
		
		PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>(Collections.reverseOrder());
		pq1.add(5);
		pq1.add(50);
		pq1.add(12);
		pq1.add(76);
		pq1.add(1);
		System.out.println("reverce queue" + pq1);
	}
}
