package loop;

public class BreakContinueEx {

	public static void main(String[] args) {
		int i = 0;
		while(i<5) {
			if(i==2) {
				break;
			}
			System.out.println(i++);
		}
		System.out.println("Continue Statement");
		int j = 0;
		while(j<5) {
			if(j==2) {
				j++;
				continue;
			}
			System.out.println(j++);

	}

	}
}
