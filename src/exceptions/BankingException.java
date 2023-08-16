package exceptions;

import java.util.Scanner;

class MinBalanceException extends Exception{
	String msg;
	public MinBalanceException(String msg) {
		this.msg=msg;
	}
	@Override
	public String toString() {
		return msg;
	}
	
}

public class BankingException {
	static int balance=1000;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter money to withdraw:");
		int amount = sc.nextInt();
		try {
			if(balance<amount) {
				throw new MinBalanceException("Insufficient Balance! Your balance is "+balance);	
			}
			else {
				System.out.println("Please take your money!");
			}
		}
		catch(MinBalanceException e){
			System.out.println(e);
		}

	}

}
