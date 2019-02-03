import java.util.Scanner;

public class WhileLoopApp {

	public static void main(String[] args) {
		/*
		 * Prompt the user for two strictly positive integers,
		 * and calculate their average.
		 * Error Handling: For each integer, as long as the user cannot
		 * enter a value > 0, we keep prompting the user for an integer.
		 * */
		Scanner input = new Scanner (System.in);
		
		int i = 1;
		int total = 0;
		
		/*
		 * This outer while loop controls the number of times
		 * that the user will be prompted to an integer.
		 * */
		while(i <= 2) {
			System.out.println("Enter a positive integer " + i + ":");
			int x = input.nextInt();
			
			/*
			 * This outer while loop controls the number of times
			 * that the user will be prompted to an integer.
			 * */
			while(!(x > 0)) {
				System.out.println("Error: " + x + "is not > 0");
				x = input.nextInt();
			}
			
			total += x;
			i ++;
			
		}
		
		double average = total / 2.0;
		System.out.println("Average is " + average);
		input.close();
	}

}
