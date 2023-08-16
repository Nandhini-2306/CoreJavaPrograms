package control;

import java.util.Scanner;

public class MaxOfTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a:");
		int a = sc.nextInt();
		System.out.println("Enter b:");
		int b = sc.nextInt();
		System.out.println("a :" + a);
		System.out.println("b :" + b);
		if (a > b) {
			System.out.println(a + " is greater.");
		} else {
			System.out.println(b + " is greater.");
		}
	}

}
