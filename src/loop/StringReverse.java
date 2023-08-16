package loop;

public class StringReverse {

	public static void main(String[] args) {
		//Using string builder
		StringBuilder sb1 = new StringBuilder("Welcome");
		sb1.reverse();
		System.out.println("Reverse of the string :"+sb1);
		
		
		//Using string buffer
		String s = "Welcome";
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		System.out.println("Reverse of the string :"+sb);
		
		
		//Using For Loop
		String str = "Hello";
		String rev = "";
		for(int i=str.length()-1;i>=0;i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
		
		
		//Check for Palindrome
		String str1 = "Malayalam";
		String temp = str1;
		String rev1 = "";
		for(int i=str1.length()-1;i>=0;i--) {
			rev1 = rev1 + str1.charAt(i);
		}
		System.out.println(rev1);
		if(rev1.equalsIgnoreCase(temp)) {
			System.out.println("The string is palindrome");
		}else {
			System.out.println("The string is not a palindrome");
		}
		
		
		
		
		
	}


	}
