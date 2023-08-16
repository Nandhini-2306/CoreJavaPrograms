package collectionframework;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		System.out.println("Stack: "+s);
		System.out.println("Size  of the Stack: "+s.size());
		System.out.println("Is Empty? "+s.isEmpty());
		s.pop();
		System.out.println("After popping "+s);
		s.peek();
		System.out.println("After peeking: "+s.peek());
		int position = s.search(20);
		System.out.println("Position: "+position);
	}

}
