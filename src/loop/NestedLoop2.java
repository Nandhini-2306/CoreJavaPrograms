package loop;

public class NestedLoop2 {

	public static void main(String[] args) {
		/*int row = 3;
        for (int i = 1; i <= row; i++) {
            for (int j = row; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();

	}*/
		/*for(int i=3;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}*/

		for (int i= 0; i<= 3; i++)  
		{  
			for (int j=0; j<=i; j++)   
			{  
				System.out.print("* ");  
			}   
			System.out.println("");   
		}   
		for (int i=3; i>=0; i--)  
		{  
			for(int j=0; j <= i-1;j++)  
			{  
				System.out.print("*"+ " ");  
			}  
			System.out.println("");
			
		}
	}
}
