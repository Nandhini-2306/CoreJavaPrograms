package inheritance;

//import java.util.Scanner;

class ClgStudent {
	String name;

	ClgStudent(String nm) {
		name = nm;
		System.out.println(name);
	}
}

class Role extends ClgStudent {
	String role;	
	String name;

	public Role(String role, String name) {
		super(name);
		this.role = role;
		System.out.println(role);
	}
}

public class UsingSuperKeyword {

	public static void main(String[] args) {
		Role d1 = new Role("Software Developer", "Nandhini");
		/*Scanner sc = new Scanner(System.in);
		String role=sc.next();
		String name=sc.next();
		Role r1=new Role(role,name);*/
	}

}
