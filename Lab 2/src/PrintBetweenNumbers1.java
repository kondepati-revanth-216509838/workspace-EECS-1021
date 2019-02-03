import java.util.Scanner;

public class PrintBetweenNumbers1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int lowerBound, upperBound;
		
		System.out.println("Enter a lower bound: ");
		lowerBound = input.nextInt();
		
		System.out.println("Enter an upper bound: ");
		upperBound = input.nextInt();
		
		if (lowerBound <= upperBound){
			System.out.println("Number between " + lowerBound + " and " + upperBound + ":");
			for (int i = lowerBound; i <= upperBound; i ++) {
				System.out.println(i);
			}
		} else {
			System.out.println("Error: lower bound " + lowerBound + " is not less than or equal to the upper bound " + upperBound +  ".");
		}
		
		System.out.println("Bye!");
		
		input.close();
	}

}
