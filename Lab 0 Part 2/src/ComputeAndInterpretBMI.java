import java.util.Scanner;

public class ComputeAndInterpretBMI {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter your name: ");
		String name = input.next();
		System.out.println(name + ", enter your height in inches:");
		double height = input.nextDouble() * 0.0254;
		System.out.println(name + ", enter your weight in pounds:");
		double weight = input.nextDouble() * 0.45359237;
		
		double BMI = weight / Math.pow(height, 2);
		
		System.out.println(name + ", your BMI is " + BMI);
		
		if (BMI < 18.5) {
			System.out.println("You are underweight!");
		} else if (BMI <= 18.5 && BMI < 25) {
			System.out.println("You are normal!");
		} else if (BMI >= 25 && BMI < 30) {
			System.out.println("You are overweight!");
		} else if (BMI >= 30) {
			System.out.println("You are obese!");
		}



	}

}
