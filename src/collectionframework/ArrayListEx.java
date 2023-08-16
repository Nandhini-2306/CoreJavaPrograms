package collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("Nandhini");
		al.add(1, "Sneha");
		al.add(2, "Bava");
		al.add(3," ");
		ArrayList<String> a2 = new ArrayList<>();
		a2.addAll(al);
		System.out.println("Elements in my A2 ArrayList: "+a2);
		al.set(3, "Sandy");
		System.out.println("Elements in my ArrayList: "+al);
		al.add(" ");
		System.out.println("Elements in my ArrayList: "+al);
		al.remove(4);
		System.out.println("Elements in my ArrayList: "+al);
		al.add("Paru");
		System.out.println("Elements in my ArrayList: "+al);
		System.out.println("Size of the Array List: "+al.size());
		ArrayList<Integer> a3 = new ArrayList<>();
		a3.add(23);
		a3.add(34);
		a3.add(7);
		a3.add(30);
		a3.add(26);
		a3.add(34);
		System.out.println("Elements in my A3 Array List: "+a3);
		System.out.println("Index of 34: "+a3.indexOf(34));
		System.out.println("Last index of 34: "+a3.lastIndexOf(34));
		List<Integer> list = new ArrayList<>();
		Collections.addAll(list, 12,68,23,89);
		System.out.println("List: "+list);
		Collections.sort(list);
		System.out.println("Sorting list: "+list);
	
	}

}
