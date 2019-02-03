import java.util.Scanner;

/* Middle Number >= LowerBound && Middle Number <= UpperBound
 * Odd numbers will be printed out that are between LowerBound and Middle Number
 * Even number will be printed out that are between Middle Number and UpperBound
 * If Middle Number not valid, print the error.
 * */

public class PrintBetweenNumbers4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int lowerBound, upperBound, middleNum;
		String yesOrNo;
		boolean run = true ;
		
		while (run == true){
		
			System.out.println("Enter a lower bound: ");
			lowerBound = input.nextInt();
			
			System.out.println("Enter an upper bound: ");
			upperBound = input.nextInt();
			
			System.out.println("Enter a middle number: ");
			middleNum = input.nextInt();
			
			
			if (lowerBound <= upperBound){
				if (middleNum > upperBound || middleNum < lowerBound) {
					System.out.println("Error: middle number "+ middleNum + " is not in-between the lower bound " + lowerBound +  " and upper bound " + upperBound);
				}else {
					System.out.println("Odd numbers between " + lowerBound + " and " + middleNum);
					for (int i = lowerBound; i<= middleNum; i ++) {
						
						if (i % 2 == 1) {
							System.out.println(i);
						}
					}
					System.out.println("Even numbers between " + middleNum + " and " + upperBound);
					for (int i = middleNum; i<= upperBound; i ++) {
						
						if (i % 2 == 0) {
							System.out.println(i);
						}
					}
				}

			
			} else {
			
				System.out.println("Error: lower bound " + lowerBound + " is not less than or equal to the upper bound " + upperBound +  ".");
			
			}
			
			for (boolean stopPrompt = false; stopPrompt == false;){
				System.out.println("Would you like to continue printing? (Y/N)");
				input.nextLine();
				yesOrNo = input.nextLine().trim();
				
				if (yesOrNo.equals("Y")) {
					run = true;
					stopPrompt = true;
					break;
				} else if (yesOrNo.equals("N")) {
					run = false;
					stopPrompt = true;
					break;
				} else {
					System.out.println("Invalid indication on continuation: " + yesOrNo);
					stopPrompt = false;
				}
			
			} 
		
		}
		
		
		System.out.println("Bye!");
		input.close();
	}

}
