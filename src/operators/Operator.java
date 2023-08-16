package operators;

public class Operator {

	public static void main(String[] args) {
		//Arithmetic operator
		int a = 10, b = 20, c = 30;
		System.out.println("Addition :"+ (a+b));
		System.out.println("Subracton :"+ (a-b));
		System.out.println("Multiplication :"+ (a*b*c));
		System.out.println("Division :"+ (a/b/c));
		System.out.println("Modulo :"+ (a%b%c));
		
		//Assignment operator
		int num1 = 10;
		int num2 = 20;
		int u = num1 += num2;
		int v = num1 -= num2;
		int w = num1 *= num2;
		int x = num1 /= num2;
		int y = num1 ^= num2;
		int z = num1 %= num2;
		System.out.println("+= :"+u);
		System.out.println("-= :"+v);
		System.out.println("*= :"+w);
		System.out.println("/= :"+x);
		System.out.println("^= :"+y);
		System.out.println("%= :"+z);
		
		//Unary operator
		System.out.println("++a :"+ ++a);
		System.out.println("a++ "+ a++);
		System.out.println("--b :"+ --b);
		System.out.println("b-- :"+ b--);
		System.out.println("~c :"+ ~c);
		boolean d = true;
		System.out.println("!d :"+ !d);

		//Relational operator
		System.out.println("== :"+ (a==b));
		System.out.println("!= :"+ (a!=b));
		System.out.println("< :"+ (b<c));
		System.out.println("> :"+ (b>c));
		
		//Bitwise operator
		int p = 1001;
		int q = 1010;
		System.out.println("p|q :"+ (p|q));
		System.out.println("p&q :"+ (p&q));
		System.out.println("p^q :"+ (p^q));
		System.out.println("~p :"+ (~p));
		
		//Logical operator
		boolean bol1 = true;
		boolean bol2 = false;
		System.out.println("&& :"+ (bol1&&bol2));
		System.out.println("|| :"+ (bol1||bol2));
		System.out.println("! :"+ (!bol2));
		
		//Shift operator
		int e = 1010;
		System.out.println("<< :"+ (e<<1));
		System.out.println(">> :"+ (e>>1));
		System.out.println(">>> :"+ (e>>>1));
		
		//Ternary operator
		int l = 27;
		int m = 23;
		int n = 11;
		int max1;
		max1 = l>m? l:m;
		System.out.println("Max of two nos :"+max1);
		int max2;
		max2 = (l>m)?(l>n? l:m):(m>n? m:n);
		System.out.println("Max of three nos :"+max2);
		
	}

}
