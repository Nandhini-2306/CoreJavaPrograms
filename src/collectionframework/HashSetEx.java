package collectionframework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	public static void main(String[] args) {
		HashSet<String> h = new HashSet<String>();
		h.add("Nandhu");
		h.add("Sneha");
		h.add("Paru");
		h.add("Sandy");
		//h.remove("Sandy");
		//System.out.println("Contains Paru: "+h.contains("Paru"));
		System.out.println("Retrieve data using Iterator: ");
		Iterator<String> iterator = h.iterator();
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
			
		}
		

	}

}
