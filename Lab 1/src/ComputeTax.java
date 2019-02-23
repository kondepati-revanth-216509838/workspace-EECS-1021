import java.util.Scanner;

public class ComputeTax {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int TaxInc;
	
		System.out.println("Enter your name: ");
		String Name = input.nextLine().trim();
		
		System.out.println(Name + ", enter your filing status (1 - Single Filing; 2 - Married Filing): ");
		int Status = input.nextInt();
	
		if (Status == 1) {
			System.out.println(Name + ", enter your taxable income: ");
			TaxInc = input.nextInt();
			SingleTaxes(Name, TaxInc);
		} else if (Status == 2) {
			System.out.println(Name + ", enter your taxable income: ");
			TaxInc = input.nextInt();
			MarriedTaxes(Name, TaxInc);
		} else {
			System.out.println("Illegal status: " + Status);
		}
		
		
		input.close();

	}
	
	public static void SingleTaxes (String name, int income) {
		double PartOne = 0, PartTwo = 0, PartThree = 0, WholeTax = 0;
		/* 10% 0 - 8,350
		 * 15% 8,351 - 33,950
		 * 25% 33,950 +
		 * */
		
		double boundary1 = 8350, boundary2 = 33950;
		
		if (income >= 0 && income <= boundary1) {
			
			PartOne = (income * 0.1);
			WholeTax = PartOne;
			System.out.println(name + ", you should pay $" + WholeTax);
			System.out.println("Part I: " + PartOne);
		}  
		    else if (income > boundary1 && income <= boundary2) {
			
		    PartOne = (boundary1 * 0.1);
			PartTwo = (income - boundary1) * 0.15;
			WholeTax = PartOne + PartTwo;
			System.out.println(name + ", you should pay $" + WholeTax);
			System.out.println("Part I: " + PartOne);
			System.out.println("Part II: " + PartTwo);
		}
		
		    else if (income > boundary2) {
		    	
		    	PartOne = (boundary1 * 0.1);
				PartTwo = (boundary2 - boundary1) * 0.15;
		    	PartThree = (income - boundary2) * 0.25;
		    	WholeTax = PartOne + PartTwo + PartThree;
		    	System.out.println(name + ", you should pay $" + WholeTax);
		    	System.out.println("Part I: " + PartOne);
		    	System.out.println("Part II: " + PartTwo);
		    	System.out.println("Part III: " + PartThree);
		    }
		
	}
	
	public static void MarriedTaxes (String name, int income) {
		double PartOne = 0, PartTwo = 0, PartThree = 0, WholeTax = 0;
		/* 10% 0 - 16,700
		 * 15% 16,701 - 67,900
		 * 25% 67,900 +
		 * */
		
		double boundary1 = 16700, boundary2 = 67900;
		
			if (income >= 0 && income <= boundary1) {
			
				PartOne = (income * 0.1);
				WholeTax = PartOne;
				System.out.println(name + ", you should pay $" + WholeTax);
				System.out.println("Part I: " + PartOne);
		}  
		    else if (income > boundary1 && income <= boundary2) {
			
			    PartOne = (boundary1 * 0.1);
				PartTwo = (income - boundary1) * 0.15;
				WholeTax = PartOne + PartTwo;
				System.out.println(name + ", you should pay $" + WholeTax);
				System.out.println("Part I: " + PartOne);
				System.out.println("Part II: " + PartTwo);
		}
		
		    else if (income > boundary2) {
		    	
		    	PartOne = (boundary1 * 0.1);
				PartTwo = (boundary2 - boundary1) * 0.15;
		    	PartThree = (income - boundary2) * 0.25;
		    	WholeTax = PartOne + PartTwo + PartThree;
		    	System.out.println(name + ", you should pay $" + WholeTax);
		    	System.out.println("Part I: " + PartOne);
		    	System.out.println("Part II: " + PartTwo);
		    	System.out.println("Part III: " + PartThree);
		}
		
	}

}
