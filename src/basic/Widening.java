package basic;

public class Widening {

	public static void main(String[] args) {
		byte b=10;
		System.out.println("Byte:"+b);
		int i=b;
		System.out.println("Widening byte to int:"+i);
		short s=35;
		System.out.println("SHort:"+s);
		int ii=s;
		System.out.println("Widening short to int:"+ii);
		char ch='Y';
		System.out.println("Character:"+ch);
		int iii=ch;
		System.out.println("Widening char to int:"+iii);
	}

}
