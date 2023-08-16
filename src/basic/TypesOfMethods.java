package basic;
class Operation1{
	void addition(int a, int b, int c) {
		System.out.println("Addition of 3 numbers :"+ (a+b+c)); 
		}
		
		int divide(int a, int b) {
			return a/b;
		}
		
		int multiply(int a, int b) {
			return a*b;
		}
		
		int subract(int a, int b) {
			return a-b;
		}
		
		int modulo(int a, int b) {
			return a%b;
		}
}

public class TypesOfMethods {

	public static void main(String[] args) {
		Operation1 op=new Operation1();
		op.addition(1,2,3);
		op.divide(1,4);
		op.multiply(2, 5);
		op.subract(5, 2);
		op.modulo(12, 6);
		System.out.println("Multiplication of 2 numbers :"+op.multiply(2, 5));
		System.out.println("Division of 2 numbers :"+op.divide(20,5));
		System.out.println("Subraction of 2 numbers :"+op.subract(5, 2));
		System.out.println("Modulo of 2 numbers :"+op.modulo(12, 6));

	}

}
