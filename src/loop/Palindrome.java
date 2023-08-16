package loop;

public class Palindrome {

	public static void main(String[] args) {
		int num = 121;
		int temp = num;
		int rev = 0;
		int r;
		while(num!=0) {
			r = num%10;
			rev = rev*10+r;
			num = num/10;
		}if(temp==rev) {
			System.out.println("The number is Palindrome.");
		}
		else {
			System.out.println("The number is not a Palindrome.");
		}

	}

}
