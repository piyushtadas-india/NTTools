package javacollationQueue;
import java.util.LinkedList;
import java.util.Queue;
public class QueueDemo {

	public static void main(String[] args) {
	
		Queue<String> qu = new LinkedList<>();
		
		 qu.add("aman");
		 qu.add("jatin");
		 qu.add("ramn");
		 System.out.println(qu);
		 System.out.println(qu.remove());
		 System.out.println(qu); // FIFO
		 qu.add("shubham");
		 System.out.println(qu);
	}

}  //  -> insertion will happen at end of the collection
   //-> Removal will happen at beginning of the collection
