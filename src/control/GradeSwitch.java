package control;

import java.util.Scanner;

public class GradeSwitch {

		public static String printGrade(int score) {
			if(score<0 && score>100) {
				return "invalid";
			}
			
			switch (score/10) {
			case 10:
				return "O";
				
			case 9:
				return "A+";
			
			case 8:
				return "A";
				
			case 7:
				return "B+";
			
			case 6:
				return "B";
				
			default: return "f";
			}
		}
		

		public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter your score");
			int score=scanner.nextInt();
			System.out.println("My Score :"+score);
			//MarksheetSwitch m=new MarksheetSwitch();

			String result= printGrade(score);
			System.out.println("My Grade :"+ result);

		}
	}


