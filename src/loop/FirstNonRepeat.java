package loop;

import java.util.Scanner;

public class FirstNonRepeat {

	public static void FirstNonRepeatt(String s)
	  {
	 
	    for (int i = 0; i < s.length(); i++) {
	 
	      if (s.indexOf(s.charAt(i), s.indexOf(s.charAt(i)) + 1) == -1) {
	        System.out.println("First non-repeating character is "+ s.charAt(i));
	        break;
	      }
	    }
	    return;
	  }
	  public static void main (String[] args) {
	    //String s = "geeksforgeeks";
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter any string: ");
	    String s = sc.nextLine(); 
		  FirstNonRepeatt(s);
	  }
	}