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
				
				boolean isIt = true;
				
				series = new int[10];
				String yesOrNo = "";
				int nInputs = 0;
				for (int i= 0; i < series.length; i ++) {
					System.out.println("Enter a new number: ");
					series[i] = input.nextInt();
					sigma += series[i];
					nInputs = i + 1;
					
					
					if (i < series.length - 1) {
						System.out.println("You have entered " + nInputs + " numbers.");
						System.out.println("You may still enter another " + (10 - nInputs) + " numbers.");
						input.nextLine();
						
						while (yesOrNo.equals("")) {
						System.out.println("Would you like to enter another number? (Y/N)");
						yesOrNo = input.nextLine();
						
							if (yesOrNo.equals("Y")) {
								break;
							} else if (yesOrNo.equals("N")) {
								break;
							} else {
								System.out.println("Invalid input.");
								yesOrNo = "";
							}
						}
						
						if (yesOrNo.equals("Y")) {
							yesOrNo = "";
						} else if (yesOrNo.equals("N")) {
							yesOrNo = "";
							break;
						}
						
						
					} else {
						System.out.println("You have entered the maximum number of numbers!");
						System.out.println("We will start processing your sequence right away.");
						break;
					}
				}
				
				if (nInputs > 1) {
				
					int seqD[] = new int [nInputs - 1];
					
					for (int i = 0; i < nInputs - 1; i ++) {
						if(i < nInputs - 2) {
						seqD[i] = series[i + 1]  - series[i];
						if (i > 0 && seqD[i] != seqD[i - 1]) {
							isIt = false;
							break;
						}
						
						} 
						
					
						
					}
					
					System.out.print("<");
					for (int i = 0; i < nInputs; i ++) {
						if (i < nInputs - 1) {
						System.out.print(series[i] + ", ");
						} else {
							System.out.print(series[i]);
						}
					}
					System.out.print("> ");
					
					if (isIt == false) {
						System.out.println(" is not an arithmetic sequence.");
					} else if (isIt == true) {
						System.out.println("is an arithmetic sequence with ");
						System.out.println("first term " + series[0] + ", common difference " + (series[1] - series[0]) + ", length " + (seqD.length + 1) + " and sum " + sigma);
					}
					
					
				} else {
					System.out.println("Error: we cannot infer the common difference from a sequence size one.");
				}
				
				//End choice == 3
				
			} else {
				System.out.println("Error: task number must be 1, 2, or 3.");
			}
			
			
			while (yesNo.equals("")) {
				input.nextLine();
				System.out.println("Would you like to process another sequence? (Y/N)");
				yesNo = input.nextLine();
				
				if (yesNo.equals("Y")) {
					break;
				} else if (yesNo.equals("N")) {
					break;
				} else {
					System.out.println("Invalid input.");
					yesNo = "";
				}
			}
			
			if (yesNo.equals("Y")) {
				yesNo = "";
			} else if (yesNo.equals("N")) {
				yesNo = "";
				break;
			}
			
			
		}
		
		System.out.println("Bye!");

		input.close();

	}
		
		
}