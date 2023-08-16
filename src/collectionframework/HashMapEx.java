package collectionframework;

import java.util.HashMap;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "abc");
		hm.put(2, "pqr");
		hm.putIfAbsent(2, "xyz");
		hm.putIfAbsent(3, "ijk");
		System.out.println(hm);
		System.out.println("Contains value: "+hm.containsValue("abc"));
		System.out.println("Contains value: "+hm.containsValue("xyz"));
		System.out.println("Contains key: "+hm.containsKey(1));
		hm.replace(1, "abc", "lmn");
		System.out.println(hm);
	}

}
