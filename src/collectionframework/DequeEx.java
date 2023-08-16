package collectionframework;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeEx {

	public static void main(String[] args) {
		Deque<String> dq = new ArrayDeque<String>();
		dq.offer("abc");
		dq.offerFirst("xyz");
		dq.offerLast("pqr");
		System.out.println(dq);
		dq.pollFirst();
		System.out.println(dq);
		dq.pollLast();
		System.out.println(dq);

	}

}
