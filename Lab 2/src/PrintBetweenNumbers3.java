import java.util.Scanner;

public class PrintBetweenNumbers3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int lowerBound, upperBound;
		String yesOrNo;
		boolean run = true ;
		
		while (run == true){
		
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
