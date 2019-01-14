import java.util.Scanner;

public class Combinations {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		String[] i = new String [4];
		int [] j = new int [4];
		
		
		//1st sequence input
		
			System.out.println("Enter the 1st string:");
			i[0] = input.nextLine();
		
			System.out.println("Enter the 2nd string:");
			i[1] = input.nextLine();
			
			System.out.println("Enter the 3rd string:");
			i[2] = input.nextLine();
		
			System.out.println("Enter the 4th string:");
			i[3] = input.nextLine();
		
	
		//2nd sequence input
		
		System.out.println("Enter the 1st integer:");
		j[0] = input.nextInt();
		
		System.out.println("Enter the 2nd integer:");
		j[1] = input.nextInt();
		
		System.out.println("Enter the 3rd integer:");
		j[2] = input.nextInt();
		
		System.out.println("Enter the 4th integer:");
		j[3] = input.nextInt();
		
		input.close();
		
		System.out.println("Here are all 16 possible combinations: ");
		
		//Display all 16 combinations
		System.out.println("(" + i[0] + " , " + j[0] + ")");
		System.out.println("(" + i[0] + " , " + j[1] + ")");
		System.out.println("(" + i[0] + " , " + j[2] + ")");
		System.out.println("(" + i[0] + " , " + j[3] + ")");
		System.out.println("(" + i[1] + " , " + j[0] + ")");
		System.out.println("(" + i[1] + " , " + j[1] + ")");
		System.out.println("(" + i[1] + " , " + j[2] + ")");
		System.out.println("(" + i[1] + " , " + j[3] + ")");
		System.out.println("(" + i[2] + " , " + j[0] + ")");
		System.out.println("(" + i[2] + " , " + j[1] + ")");
		System.out.println("(" + i[2] + " , " + j[2] + ")");
		System.out.println("(" + i[2] + " , " + j[3] + ")");
		System.out.println("(" + i[3] + " , " + j[0] + ")");
		System.out.println("(" + i[3] + " , " + j[1] + ")");
		System.out.println("(" + i[3] + " , " + j[2] + ")");
		System.out.println("(" + i[3] + " , " + j[3] + ")");
	}

}
