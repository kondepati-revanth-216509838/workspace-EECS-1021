import java.util.Scanner;

public class PrintBetweenNumbers1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a lower bound: ");
		int lowerBound = input.nextInt();
		
		System.out.println("Enter a upper bound: ");
		int upperBound = input.nextInt();
	
		if (upperBound >= lowerBound) {
			System.out.println("Numbers between " + lowerBound + " and " + upperBound + ":");
			System.out.println(lowerBound + "\n" + upperBound);
		} else {
			System.out.println("Error: lower bound " + lowerBound + " is not less than or equal to the upper bound " + upperBound + "." );
		}
		
		System.out.println("Bye!");
		input.close();
	}

}
