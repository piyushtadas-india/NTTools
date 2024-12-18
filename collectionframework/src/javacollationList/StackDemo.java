package javacollationList;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<String> st = new Stack<String>();
		 
		st.push("hello");
		st.push("ram");
		st.push("sham");
		st.push("ji");
		
		System.out.println(st);
		st.pop(); 
		System.out.println(st);
		System.out.println(st.peek());
		
		// push --> add
	}  // pop --> remove

}
