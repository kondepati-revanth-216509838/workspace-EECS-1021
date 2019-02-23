import java.util.Scanner;

public class DetermineFibSeq {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean run = true;
		
		while (run == true) {
			int nInputs = 0;
			int deterFibSeq [] = new int [20];
			
			//Input part
			for (int i = 0; i < 20; i ++) {
				System.out.println("Enter a positive integer value, or -1 to stop:");
				deterFibSeq[i] = input.nextInt();
				nInputs ++;
				
				if (deterFibSeq[i] == -1) {
					i = 19;
					deterFibSeq[i] = 0;
					nInputs --;
				}
			}
			
			//Checking Part
			int check [] = {0,1};
			boolean yN = true;
			for (int i = 0; i < nInputs; i ++) {
				
				if (check[1] != deterFibSeq[i]) {
					yN = false;
				}
				
				int temp = check[0] + check[1];
				check[0] = check[1];
				check[1] = temp;
				
			}
			
			
			//Display result
			System.out.print("The system you entered <");
			
			for (int i = 0; i < nInputs; i ++) {
				if (i == 0) {
					System.out.print(deterFibSeq[i]);
				} else {
					System.out.print(", " + deterFibSeq[i]);
				}
			}
			System.out.println(">");
			System.out.print ("\tis ");
			if(yN == false) {
				System.out.print("not");
			}
			
			System.out.println(" the first " + nInputs + " numbers in the Fibonacci sequence.");
			
			//Would you like to continue?
			input.nextLine();
			System.out.println("Would you like to try another sequence? (Y/N)");
			String yOrN = input.nextLine().trim();
			
			if (yOrN.equals("Y")) {
				run = true;
			} else if (yOrN.equals("N")) {
				run = false;
			}
			
		}
		
		input.close();
		
		System.out.println("Bye!");

	}

}
