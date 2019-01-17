import java.util.Scanner;

 /* Rock Paper Scissors
  * 
  * Backward order: Who's gonna beat who.
  * 
  * */

public class RockPaperScissorsGame {
	
	static int P1Wins = 0, P1Losses = 0, P2Wins = 0, P2Losses = 0;

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
		String P1Play = input.nextLine().trim();
		
		System.out.println("What does " + P2Name + " play? (R, P, or S)");
		String P2Play = input.nextLine().trim();
		
		CheckScores(P1Play, P2Play);
		
		round += 1;
		printRound(round);
		
		System.out.println("What does " + P1Name + " play? (R, P, or S)");
		P1Play = input.nextLine();
		
		System.out.println("What does " + P2Name + " play? (R, P, or S)");
		P2Play = input.nextLine();
		
		CheckScores(P1Play,P2Play);
		
		if (P1Wins == P2Wins) {
			round += 1;
			printRound(round);
			
			System.out.println("What does " + P1Name + " play? (R, P, or S)");
			P1Play = input.nextLine();
			
			System.out.println("What does " + P2Name + " play? (R, P, or S)");
			P2Play = input.nextLine();
			
			CheckScores(P1Play,P2Play);
		}
		
		input.close();
		
		if (P1Wins == P2Wins) {
			System.out.println("Game over: a tie between " + P1Name + " and " + P2Name);
		
		} else if (P1Wins > P2Wins) {
			System.out.println("Game over: " + P1Name + " wins!");
		
		} else if (P2Wins > P1Wins) {
			System.out.println("Game over: " + P2Name + " wins!");
		}
		
	}
	
	public static void printRound(int round) {
		String Boundary = "========";
		System.out.println(Boundary);
		System.out.println("Round: " + round);
		System.out.println(Boundary);
	}
	
	public static void CheckScores(String a, String b) {
		
		/* Rock beats Scissors
		 * Paper beats Rock
		 * Scissors beats Paper
		 * */
		
		if (a.equals("R") == true && b.equals("S") == true) {
			P1Wins +=1;
			P2Losses +=1;
		} else if (a.equals("S") == true && b .equals("R")) {
			P2Wins +=1;
			P1Losses +=1;
		
		}  else if (a.equals("S") == true && b.equals("P") == true) {
			P1Wins +=1;
			P2Losses +=1;
		} else if (a.equals("P") == true && b .equals("S")) {
			P2Wins +=1;
			P1Losses +=1;
		
		}if (a.equals("P") == true && b.equals("R") == true) {
			P1Wins +=1;
			P2Losses +=1;
		}else if (a.equals("R") == true && b .equals("P")) {
			P2Wins +=1;
			P1Losses +=1;
		}
		
		
	}

}
