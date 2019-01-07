import java.util.Scanner;

public class ComputePerimeterAndAreaofCircle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer for radius: ");
		int radius = input.nextInt();
		
		System.out.println("What's your name? ");
		String name = input.next();
		
		double pi = 3.14;
		double perimeter = (2 * pi * radius), area = pi *(Math.pow(radius, 2));
		
		System.out.println(name + ", your input circle with radius " + radius + " has perimeter " + perimeter + " and area " + area);
		
		input.close();

	}

}
