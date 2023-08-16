package string;

public class StringArray {

	public static void main(String[] args) {
		String str="How are you?";
		String arrStr[]=str.split("  ", 3);
		for(String str1:arrStr) {
			System.out.println(str1+ "  ");
		}
		

	}

}
