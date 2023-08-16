package inheritance;

class Student{
	String name = "Nandhini";
	void display() {
		System.out.println("Name: "+name);	
	}
}

class Developer extends Student{
	String role = "Software Developer";
	void displayRole() {
		System.out.println("Role: "+role);
	}
}


public class SingleInheritance {

	public static void main(String[] args) {
		Developer d1 = new Developer();
		d1.display();
		d1.displayRole();
		
	}

}
