package loop;

public class NestedLoop {

	public static void main(String[] args) {
		int num;
		/*for(int i=1;i<=5;i++) {
			System.out.println("value od i :"+i);
			for(int j=1;j<=i;j++) {
				System.out.println("value of j :"+j);
			}
		}*/
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=i;j++) {
				//System.out.print("* ");
				//System.out.print(j+" ");
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
