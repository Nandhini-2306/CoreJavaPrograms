package basic;

public class unary {

	public static void main(String[] args) {
		int a = 20;
		int b = ++a*10/a++ + ++a;
		int c = 100;
		int d = ~c;
		System.out.println(b);
		System.out.println(d);
		//System.out.println(e);
	}

}
