package javacollationQueue;
import java.util.*;

public class DequeDemo {

	public static void main(String[] args) {
		
		Deque dq = new ArrayDeque();
		dq.add(1);
		dq.add(2);
		dq.add(3);
		dq.add(4);
		dq.add(5);
 
		System.out.println("Queue Element : "+ dq);
		dq.addFirst(0);
		System.out.println(dq);
		dq.addLast(6);
		System.out.println(dq);
		System.out.println(dq.peek());
		dq.poll();
		System.out.println(dq);
	}

}
