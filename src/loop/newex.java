package loop;

public class newex {
	
	static void pattern(int row) {
		for(int i=1;i<=row;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	

	public static void main(String[] args) {
		int row=3,b=2,c=4;
		pattern(row);
		pattern(b);
		pattern(c);

	}

}

