package basic;

public class Narrowing {

	public static void main(String[] args) {
	long l=67;
	System.out.println("Long:"+l);
	byte b= (byte)l;
	System.out.println("Narrowing long to byte:"+b);
	short s= (short)l;
	System.out.println("Narrowing long to short:"+s);
	char c= (char)l;
	System.out.println("Narrowing long to char:"+c);
	int i= (int)l;
	System.out.println("Narrowing long to int:"+i);
	float f= (float)l;
	System.out.println("Narrowing long to float:"+f);
			}
}
