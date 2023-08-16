package exceptions;

import java.util.Scanner;

class CheckName extends Exception {
    String name;

    public CheckName(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

public class FirstLastName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first name: ");
        String name1 = sc.nextLine();
        System.out.println("Enter the second name: ");
        String name2 = sc.nextLine();
        try {
            if (name1.equals(name2)) {
                throw new CheckName("");
            } else {
                throw new CheckName(name1 +" "+ name2);
            }
        } catch (CheckName e) {
            System.out.println("Name: " + e.toString());
        }
    }
}



/*package exceptions;

import java.util.Scanner;

class checkName extends Exception{
	String Name1;
	String Name2;
	String Name = Name1+Name2;
	public checkName(String Name1,String Name2) {
		this.Name1=Name1;
		this.Name2=Name2;
	}public String toString() {
		return Name;
	}

public class FirstLastName {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first name: ");
		String Name1 = sc.nextLine();
		System.out.println("Enter the second name: ");
		String Name2 = sc.nextLine();
		try {
			if(Name1==Name2) {
				System.out.println(" ");
			}else {
				System.out.println("Name"+(Name1+Name2));
			}
		}catch(Exception e) {
			System.out.println();
		}
			
		
		}

	}

}*/
