package loop;

public class RevrseOfNos {

	public static void main(String[] args) {
		int rev = 0;
		int num = 987;
		while(num!=0) {
			int r = num%10;
			rev = rev*10+r;
			num = num/10;
		}
		System.out.println("Reverse of the number :"+rev);
	}

}
