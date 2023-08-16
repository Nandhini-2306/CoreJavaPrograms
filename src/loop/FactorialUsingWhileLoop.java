package loop;

public class FactorialUsingWhileLoop {

	public static void main(String[] args) {
		int num = 3;
		int fact = 1;
		int i = 1;
		while(i<=num) {
			fact *=i;
			i=i+1;
		}
		System.out.println(fact);

	}

}
