package basic;

public class LocalVariableEx {
		public void displayAge() {
		int age=0;
		age=age+20;
		System.out.println("Age :"+age);
	}
	
public static void main(String[] args) {
		LocalVariableEx ex= new LocalVariableEx();
		ex.displayAge();
	}
}