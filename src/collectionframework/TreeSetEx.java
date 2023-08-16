package collectionframework;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(10);
		ts.add(20);
		ts.add(30);
		System.out.println(ts);
		System.out.println("Retrieve date using iterator");
		Iterator<Integer> itr = ts.descendingIterator();
		while(itr.hasNext()) {
			Integer i = itr.next();
			System.out.println(i);
		}

	}

}
