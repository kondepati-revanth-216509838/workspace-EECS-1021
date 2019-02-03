import java.util.Scanner;

public class PrintBetweenNumbers2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		boolean stop = false;
		
		int lowerBound, upperBound;
		
		while (stop != true) {
			
			System.out.println("Enter a lower bound: ");
			lowerBound = input.nextInt();
			
			System.out.println("Enter a upper bound: ");
			upperBound = input.nextInt();
		
			if (upperBound >= lowerBound) {
				System.out.println("Numbers between " + lowerBound + " and " + upperBound + ":");
				System.out.println(lowerBound + "\n" + upperBound);
			} else {
				System.out.println("Error: lower bound " + lowerBound + " is not less than or equal to the upper bound " + upperBound + "." );
			}
		
		
				 for (boolean runAgain = true; runAgain == true;) {
					 Scanner check = new Scanner (System.in);
					System.out.println("Would you like to continue printing? (Y/N)");
					String YorN = check.nextLine().trim();
					check.close();
					if (YorN.equals("Y")) {
						stop = false;
						runAgain = false;
					} else if (YorN.equals("N")) {
						stop = true;
						runAgain = false;
						System.out.println("Bye!");
					} else {
						runAgain = true;
					}
					
				}
				
				 
		}
		
		 input.close();
		
		
	}

}
