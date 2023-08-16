package string;

public class SimpleMethods {

	public static void main(String[] args) {
		String a = "Louis";
		String b = "louis";
		System.out.println("Length is :"+a.length());
		System.out.println("Uppercase is :"+a.toUpperCase());
		System.out.println("Lowercase is :"+a.toLowerCase());
		System.out.println("Equals :" +a.equals(b));
		System.out.println("Equals :"+a.equalsIgnoreCase(b));
		System.out.println("Concates :"+a.concat(" Tomlinson"));
		System.out.println("Index of u :"+a.indexOf("u"));
		System.out.println("Last Index of :"+a.lastIndexOf("o"));
		System.out.println("Contains s :"+a.contains("s"));
		System.out.println("Substring :"+a.substring(2,4));
		System.out.println("Character at :"+a.charAt(3));
		String c = "Where are you?";
		System.out.println("Trim :"+c.trim());
		String arrStr[] = c.split(" ",3);
			for(String d : arrStr) {
				System.out.print(d+" ");
			}
			System.out.println();
		String e = " ";
		System.out.println("Is string empty :"+e.isEmpty());
		System.out.println("Is string blank :"+e.isBlank());
	}

}
