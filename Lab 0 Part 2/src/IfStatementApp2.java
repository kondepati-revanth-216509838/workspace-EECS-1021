import java.util.Scanner;

public class IfStatementApp2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		/*
		 * Prompt the user to enter an integer balance, and then
		 * Prompt the user to enter an integer amount to withdraw.
		 * Display the remaining balance after withdrawal.
		 * 
		 * Three possible errors from the user:
		 * 1. balance < 0
		 * 2. amount < 0
		 * 3. amount >= balance (e.g., balance is 100, amount cannot be 100, 101, 102, ...)
		 * */
		
		System.out.println("Enter an integer balance: ");
		int initialBalance = input.nextInt();
		
		System.out.println("Enter an amount to withdraw: ");
		int amount = input.nextInt();
		
		if (initialBalance < 0 || amount < 0 || amount >= initialBalance) {
			/*body of if-statement */
			//this block of code is executed only if the if branch condition is true.
			System.out.println("Error: Launch the program again.");
		} else {
			/*body of else-statement */
			//this block of code is executed only if the if branch condition is true.
			int resultingBalance = initialBalance - amount;
			initialBalance = initialBalance - amount;
			System.out.print("Inital balance, " + initialBalance + " after withdrawing " + amount);
			System.out.println(" has resulting balance " + resultingBalance);
		}
		
		input.close();

	}

}
