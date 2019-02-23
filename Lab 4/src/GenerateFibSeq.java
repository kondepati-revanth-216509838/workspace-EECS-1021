import java.util.Scanner;

public class GenerateFibSeq {

	public static void main(String[] args) {
		boolean run = true;
		Scanner input = new Scanner(System.in);
		
		while(run == true) {
			
		
			int size = 0;
			int [] fibArray;
			System.out.println("Enter the size of fibonacci sequence: ");
			size = input.nextInt();
			
			if (size >= 1) {
				System.out.println("Fibonacci Sequence of size " + size + ":");
				fibArray = new int[size + 1];
				
				int[] dummy = new int [2];
				dummy[0] = 1;
				dummy[1] = 1;
				
				System.out.print("<");
				for (int i = 0; i < size; i ++) {
					int location = i;
					fibArray[location] = dummy[0];
					
					int tempSum = dummy[0] + dummy[1];
					dummy[0] = dummy[1];
					dummy[1] = tempSum;
					
						if (i == 0) {
							System.out.print(fibArray[location]);
						} else {
							System.out.print(", "+fibArray[location]);
						}
				}
				System.out.println(">");
			} else {
				System.out.println("Error: Fibonacci Sequence must have size >= 1.");
			}
			input.nextLine();
			System.out.println("Would you like to continue? (Y/N)");
			String yN = input.nextLine().trim();
			
			if (yN.equals("Y")) {
				run = true;
			} else if (yN.equals("N")) {
				run = false;
			}
		}
		System.out.println("Bye!");
		input.close();
	}

}
