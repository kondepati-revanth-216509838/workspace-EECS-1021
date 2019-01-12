import java.util.Scanner;

public class sumOfCrossProduct {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Used as a string prompt handler
		String numPlace = null;
		
		//Declared important variables (2 matrices and sum).
		int[] point1 = new int [4];
		int[] point2 = new int [4];
		int sum = 0;
		
		
		//Prompt the user enter integer values for the 1st sequence
		System.out.println("Enter the 1st integer in sequence 1:");
		point1[0] = input.nextInt();
		
		System.out.println("Enter the 2nd integer in sequence 1:");
		point1[1] = input.nextInt();
		
		System.out.println("Enter the 3rd integer in sequence 1:");
		point1[2] = input.nextInt();
		
		System.out.println("Enter the 4th integer in sequence 1:");
		point1[3] = input.nextInt();
		
		
		//Prompt the user enter integer values for the 2nd sequence
		System.out.println("Enter the 1st integer in sequence 2:");
		point2[0] = input.nextInt();
		
		System.out.println("Enter the 2nd integer in sequence 2:");
		point2[1] = input.nextInt();
		
		System.out.println("Enter the 3rd integer in sequence 2:");
		point2[2] = input.nextInt();
		
		System.out.println("Enter the 4th integer in sequence 2:");
		point2[3] = input.nextInt();
		
		
		input.close();
		
		sum = (point1[0] * point2[0]) + (point1[1] * point2[1]) + (point1[2] * point2[2]) + (point1[3] * point2[3]);
		
		//Output of the sum
		System.out.print("sum([");
		System.out.print(point1[0]+", " + point1[1] + ", " + point1[2] + ", " + point1[3] + "] * [" + point2[0]+", " + point2[1] + ", " + point2[2] + ", " + point2[3] + "]) = ");
		System.out.println(sum);
	
	}

}
