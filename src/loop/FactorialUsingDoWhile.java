package loop;

public class FactorialUsingDoWhile {

	public static void main(String[] args) {
		int num = 4;
		int i = 1;
		int fact = 1;
		do {
			fact*=i;
			i++;
		}while(i<=num);
		System.out.println(fact);

	}

}
