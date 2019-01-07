import java.util.Scanner;

public class ConvertSecondsIntoMinutes {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("What's your name?");
		String name = input.next();
		
		System.out.println("Enter an integer for seconds:");
		int seconds = input.nextInt();
		
		int minutes = seconds / 60;
		int excessSeconds = seconds % 60;
		
		System.out.println(name + ", your input " + seconds + " can be divided into " + minutes + " and " + excessSeconds + " seconds.");
		input.close(); 
		

	}

}
