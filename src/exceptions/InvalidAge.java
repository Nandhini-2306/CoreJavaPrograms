package exceptions;

import java.util.Scanner;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String msg) {
		super(msg);
	}
}

public class InvalidAge {
	void checkage(int age) {
		if(age<18) {
			System.out.println("Invalid Age");
		}
		else {
			System.out.println("Valid Age");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age: ");
		int age = sc.nextInt();

	}

}
