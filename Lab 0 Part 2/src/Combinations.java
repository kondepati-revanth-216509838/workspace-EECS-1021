import java.util.Scanner;

public class Combinations {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		String numPlace = null;
		String[] x = new String [4];
		int [] y = new int [4];
		
		
		//1st sequence input
		for (int i = 1; i <= 4; i++) {
			
			
			switch (i) {
			case 1: numPlace = "st"; break;
			case 2: numPlace = "nd"; break;
			case 3: numPlace = "rd"; break;
			case 4: numPlace = "th"; break;
			}
			
			System.out.println("Enter the " + i + numPlace+ " string:");
			x[i - 1] = input.nextLine();
		}
		
	
		//2nd sequence input
		for (int i = 1; i <= 4; i ++) {
			
			switch (i) {
			case 1: numPlace = "st"; break;
			case 2: numPlace = "nd"; break;
			case 3: numPlace = "rd"; break;
			case 4: numPlace = "th"; break;
			}
		System.out.println("Enter the " + i + numPlace + " integer:");
		y[i - 1] = input.nextInt();
		
		}
		
		input.close();
		
		//Display all 16 combinations
		for (int i = 1; i <= 4; i ++) {
			
			for (int j = 1; j <= 4; j ++) {
				System.out.println("(" + x[i - 1] + ", " + y[j - 1] + ")");
			} 
			
		}
	}

}
