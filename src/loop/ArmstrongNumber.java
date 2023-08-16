package loop;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num = 153;
		int temp = num;
		double sum = 0;
		int rem = 0;
		while(num!=0) {
			rem = num%10;
			sum = sum+Math.pow(rem, 3);
			num = num/10;
		}
		System.out.println(sum);
		if(temp==sum) {
			System.out.println("The number is an Armstrong Number");
		}
		else {
			System.out.println("The number is not an Armstrong Number");
		}
		
	}

}
