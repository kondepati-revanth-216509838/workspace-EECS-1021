import java.util.Scanner;

 /* Rock Paper Scissors
  * 
  * Backward order: Who's gonna beat who.
  * */

public class RockPaperScissorsGame {
	
	int P1Wins = 0, P1Losses = 0, P2Wins = 0, P2Losses = 0;

	public static void main(String[] args) {
		
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the name of Player 1: ");
		String Player1Name = input.nextLine();
		
		System.out.println("Enter the name of Player 2: ");
		String Player2Name = input.nextLine();
		
		Game(Player1Name, Player2Name);
		
		input.close();

	}
	
	public static void Game(String P1Name, String P2Name){
		Scanner input = new Scanner (System.in);
		
		int round = 1;
		
		printRound(round);
		
		System.out.println("What does " + P1Name + " play? (R, P, or S)");
		String P1Play = input.nextLine();
		
		System.out.println("What does " + P2Name + " play? (R, P, or S)");
		String P2Play = input.nextLine();
		
		round += 1;
		printRound(round);
		
		System.out.println("What does " + P1Name + " play? (R, P, or S)");
		P1Play = input.nextLine();
		
		System.out.println("What does " + P2Name + " play? (R, P, or S)");
		P2Play = input.nextLine();
		
		
	}
	
	public static void printRound(int round) {
		String Boundary = "========";
		System.out.println(Boundary);
		System.out.println("Round: " + round);
		System.out.println(Boundary);
	}
	
	public static int CheckScores() {
		
		return 5;
	}

}
