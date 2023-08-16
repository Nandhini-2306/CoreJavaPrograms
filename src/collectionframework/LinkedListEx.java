package collectionframework;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Rose");
		list.add("Jasmine");
		list.add("Lotus");
		list.add(2, "Sunflower");
		System.out.println("Elements in the linked list: "+list);
		list.addFirst("Orchid");
		System.out.println("AddFirst elements in the linked list: "+list);
		list.addLast("Violets");
		System.out.println("AddLast elements in the linked list: "+list);
		list.poll();
		System.out.println("After polling: "+list);
		list.pollFirst();
		System.out.println("After polling first: "+list);
		list.pollLast();
		System.out.println("After polling last: "+list);
		list.getFirst();
		System.out.println("After getting first: "+list.getFirst());
		list.getLast();
		System.out.println("After getting last: "+list.getLast());
		System.out.println("After peeking: "+list.peek());
	}

}
