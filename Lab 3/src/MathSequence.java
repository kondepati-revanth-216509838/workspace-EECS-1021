import java.util.Scanner;

public class MathSequence {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		String yesNo = "";
		
		while (yesNo.equals("")) {
			int choice = 0;
			
			System.out.println("What kind of would you like to perform?");
			System.out.println("1: Generate an arithmetic sequence.");
			System.out.println("2: Generate an geometric sequence.");
			System.out.println("3: Determine an arithmetic sequence.");
			choice = input.nextInt();
			int firstTerm, d, n, sigma = 0;
			int series[];
			
			if (choice == 1) {
				
				System.out.println("Enter the first term in the arithmetic sequence");
				firstTerm = input.nextInt();
				
				System.out.println("Enter the common difference in the arithmetic sequence");
				d = input.nextInt();
				
				System.out.println("Enter the number of terms in the arithmetic sequence");
				n = input.nextInt();
				
				series = new int [n];
				
				System.out.print("<");
				for (int i = 0; i < n; i ++) {
					series[i] = firstTerm + (i * d);
					
					if (i == n - 1) {
						System.out.println(series[i] + ">");
					} else {
						System.out.print(series[i] + ", ");
					}
					
					sigma += series[i];
				}
				
				System.out.println("Sum of arithmetic sequence: " + sigma);
				
			} else if (choice == 2) {
				
				System.out.println("Enter the first term in the geometric sequence");
				firstTerm = input.nextInt();
				
				System.out.println("Enter the common difference in the geometric sequence");
				d = input.nextInt();
				
				System.out.println("Enter the number of terms in the geometric sequence");
				n = input.nextInt();
				
				series = new int [n];
				
				int key = firstTerm;
				
				System.out.print("<");
				for (int i = 1; i <= n; i ++) {
					
					key *= d;
					
					series[i - 1] = key/d;
					if (i == n) {
						System.out.println(series[i - 1] + ">");
					} else {
						System.out.print(series[i - 1] + ", ");
					}
					
					sigma += series[i - 1];
				}
				
				System.out.println("Sum of geometric sequence: " + sigma);
				
				
			} else if (choice == 3) {
				/*Big load of thinking required (read what he wants from this 3rd task)
				 * 
				 * */
				determineArithmeticSeq();
				
			} else {
				System.out.println("Error: task number must be 1, 2, or 3.");
			}
			
			while (!yesNo.equals("Y") && !yesNo.equals("N")){
				System.out.println("Would you like to process another sequence? (Y/N)");
				yesNo = input.nextLine();
				input.nextLine();
				if (yesNo.equals("N")) {
					break;
				} else if (yesNo.equals("Y")) {
					break;
					//do nothing.
				} else {
					System.out.println("Invalid input.");
				}
			}
			
			if (yesNo.equals("N")) {
				System.out.println("Bye!");
				break;
			} else {
				yesNo = "";
			}
		}
		
		
		
		input.close();

	}
	
	
	public static void determineArithmeticSeq() {
		/*Think about this question right after you reach home.
		 * */
		Scanner input = new Scanner (System.in);
		
		/*How to do this??
		 * Ask the number
		 * Ask whether he'll input extra numbers or not (till it reaches 9, because 10 will be the end)
		 * Run the loop for 10 times (max)
		 * 
		 * if the input is more than 1 then check the all Ds are equal or else it's not arithmetic sequence
		 * */
		
		int series [] = new int [10];
		String yOrN = "";
		
		for (int i = 0; i < series.length; i ++) {
		System.out.println("Enter a new number:");
		series[i] = input.nextInt();
		
		System.out.println("Would you like to enter another new number? (Y/N)");
		input.nextLine();
		yOrN = input.nextLine();
		
		
		
		
		if (yOrN.equals("Y")) {
			//do nothing.
		} else if (yOrN.equals("N")) {
			break;
		} else {
			System.out.println("Invalid input");
		}
		
		yOrN = "";
		}
		
		input.close();
			
}
		
		
		
}