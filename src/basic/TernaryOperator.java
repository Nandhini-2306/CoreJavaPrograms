package basic;

public class TernaryOperator {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		String display;
		display = a>b? (a>c? "a is greater" : "c is greater") : (b>c? "b is greater" : "c is greater");
		System.out.println(display);
	}

}
