package control;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the mark of first subject :");
		int mark1 = sc.nextInt();
		System.out.println("Enter the mark of second subject :");
		int mark2 = sc.nextInt();
		System.out.println("Enter the mark of third subject :");
		int mark3 = sc.nextInt();
		System.out.println("Enter the mark of fourth subject :");
		int mark4 = sc.nextInt();
		System.out.println("Enter the mark of fifth subject :");
		int mark5 = sc.nextInt();
		System.out.println("Mark1 :"+mark1);
		System.out.println("Mark2 :"+mark2);
		System.out.println("Mark3 :"+mark3);
		System.out.println("Mark4 :"+mark4);
		System.out.println("Mark5 :"+mark5);
		int average = (mark1+mark2+mark3+mark4+mark5)/3;
		if(average>=90) {
			System.out.println("Grade : O");
		}
		else if((average>=80)&&(average<90)) {
			System.out.println("Grade : A+");
		}
		else if((average>=70)&&(average<80)) {
			System.out.println("Grade : A");
		}
		else if((average>=60)&&(average<70)) {
			System.out.println("Grade : B+");
		}
		else if((average>=50)&&(average<60)) {
			System.out.println("Grade : B");
		}
		else{
			System.out.println("Failed!");
		}
	}

}
