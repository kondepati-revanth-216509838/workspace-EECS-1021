import java.util.Scanner;

public class sumOfCrossProduct {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String numPlace = null;
		
		int[] point1 = new int [4];
		int[] point2 = new int [4];
		int sum = 0;
		
		for (int i = 1; i <= 4; i ++) {
			
			switch (i) {
			case 1: numPlace = "st"; break;
			case 2: numPlace = "nd"; break;
			case 3: numPlace = "rd"; break;
			case 4: numPlace = "th"; break;
			}
		System.out.println("Enter the " + i + numPlace + " integer in sequence 1:");
		point1[i - 1] = input.nextInt();
		
		}
		
		for (int i = 1; i <= 4; i ++) {
			
			switch (i) {
			case 1: numPlace = "st"; break;
			case 2: numPlace = "nd"; break;
			case 3: numPlace = "rd"; break;
			case 4: numPlace = "th"; break;
			}
		System.out.println("Enter the " + i + numPlace + " integer in sequence 2:");
		point2[i - 1] = input.nextInt();
		
		}
		
		input.close();
		
		for (int i = 0; i < 4; i ++) {
			sum = sum + (point1[i] * point2[i]) ;
		}
		
		System.out.print("sum([");
		System.out.print(point1[0]+", " + point1[1] + ", " + point1[2] + "," + point1[3] + "] * [" + point2[0]+", " + point2[1] + ", " + point2[2] + "," + point2[3] + "]) = ");
		System.out.println(sum);
	
	}

}
