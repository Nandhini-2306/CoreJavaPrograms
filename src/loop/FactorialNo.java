package loop;

public class FactorialNo {

	public static void main(String[] args) {
		//Using for loop
		int num = 4;
		int fact = 1;
		for(int i=1; i<=num; i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of the number :"+fact);
		
		}

}
