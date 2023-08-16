package oops;

	class Privatedemo {
		int b = 1;

		void display() {
			System.out.println("b :" + b);

		}

	}
	public class PrivateAccessEx {
		private int a;
		
		public static void main(String[] args) {
			Privatedemo d = new Privatedemo();
			System.out.println("Value of b:" + d.b);
			d.display();
			PrivateAccessEx p = new PrivateAccessEx();
			p.a = 10;

			System.out.println(p.a);

		}

	}

