import java.util.Scanner;

public class LogicalOperationsApp2a {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter an integer between 1 and 10:");
		int i = input.nextInt();
		
		
		boolean isBetween1And10 = 1 <= i && i <= 10; // i >=1 && i <= 10
		
		System.out.println("The number you enteredi is " + i + " is between 1 and 10: " + isBetween1And10);
		
		input.close();

	}

}
