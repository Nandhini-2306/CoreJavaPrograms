package exceptions;

public class TryCatch {

	public static void main(String[] args) {
		try {
			int[] numbers = {1,2,3};
			System.out.println(numbers[50]);
		}catch(ArithmeticException a) {
			System.out.println("Some error in code."+a);
		
		}/*catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("Some error in code."+a);
		
		}catch(Exception e){
			System.out.println("Some error in code");
		}*/
		

	}


}
