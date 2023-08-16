package collectionframework;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueEx {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new Comparator<Integer>() {
			public int compare(Integer lhs, Integer rhs) {
				
				if(lhs<rhs) return +1;
				if(lhs.equals(rhs)) return 0;
					return -1;
			}
		});
		
		pq.add(1);
		pq.add(4);
		pq.add(3);
		pq.add(9);
		pq.add(7);
		
		System.out.println("'The max Priority Queue contents: ");
		Integer val = null;
		while((val = pq.poll()) !=null)
			System.out.println(val+ " ");

		
		

	}

}
