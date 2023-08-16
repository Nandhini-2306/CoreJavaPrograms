package accessspecifier;

class Demo{
	int c = 2;
	Demo(int a){
		c = a;
	}
	void display() {
		int b = 28;
		System.out.println(c);
	}
}

public class PrivateAccessEx {
	private int a;
	private int b = 1;
	public void test() {
		System.out.println(b);
	}

	public static void main(String[] args) {
		PrivateAccessEx p = new PrivateAccessEx();
		Demo d = new Demo(10);
		d.display();
		System.out.println(d.c);
		p.a=10;
		

	}

}
