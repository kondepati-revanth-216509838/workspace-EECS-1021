import java.util.Scanner;

public class GradeReport {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = input.nextLine();
		String course;
		String boundary = "------------------------------------------";//42 dashes
		
		int[] quiz = new int[9];
		int[] assignment = new int[10];
		int[] labTests = new int[3];
		int midTermTest, finalExam;
		double avgQuiz = 0, avgLab = 0, avgAssign = 0;
		double finalMark = 0;
	
		
		
			//Quiz marks input
			System.out.println(name + ", what is your score for Quiz 1 (out of 100)?");
			quiz[0] = input.nextInt();
			avgQuiz += quiz[0];
			
			System.out.println(name + ", what is your score for Quiz 2 (out of 100)?");
			quiz[1] = input.nextInt();
			avgQuiz += quiz[1];
			
			System.out.println(name + ", what is your score for Quiz 3 (out of 100)?");
			quiz[2] = input.nextInt();
			avgQuiz += quiz[2];
			
			System.out.println(name + ", what is your score for Quiz 4 (out of 100)?");
			quiz[3] = input.nextInt();
			avgQuiz += quiz[3];
			
			System.out.println(name + ", what is your score for Quiz 5 (out of 100)?");
			quiz[4] = input.nextInt();
			avgQuiz += quiz[4];
			
			System.out.println(name + ", what is your score for Quiz 6 (out of 100)?");
			quiz[5] = input.nextInt();
			avgQuiz += quiz[5];
			
			System.out.println(name + ", what is your score for Quiz 7 (out of 100)?");
			quiz[6] = input.nextInt();
			avgQuiz += quiz[6];
			
			System.out.println(name + ", what is your score for Quiz 8 (out of 100)?");
			quiz[7] = input.nextInt();
			avgQuiz += quiz[7];
			
			System.out.println(name + ", what is your score for Quiz 9 (out of 100)?");
			quiz[8] = input.nextInt();
			avgQuiz += quiz[8];
			
			//Assignment marks input
			System.out.println(name + ", what is your score for Assigment 1 (out of 100)?");
			assignment[0] = input.nextInt();
			avgAssign += assignment[0];
			
			System.out.println(name + ", what is your score for Assigment 2 (out of 100)?");
			assignment[1] = input.nextInt();
			avgAssign += assignment[1];
			
			System.out.println(name + ", what is your score for Assigment 3 (out of 100)?");
			assignment[2] = input.nextInt();
			avgAssign += assignment[2];
		
			System.out.println(name + ", what is your score for Assigment 4 (out of 100)?");
			assignment[3] = input.nextInt();
			avgAssign += assignment[3];
			
			System.out.println(name + ", what is your score for Assigment 5 (out of 100)?");
			assignment[4] = input.nextInt();
			avgAssign += assignment[4];
			
			System.out.println(name + ", what is your score for Assigment 6 (out of 100)?");
			assignment[5] = input.nextInt();
			avgAssign += assignment[5];
			System.out.println(name + ", what is your score for Assigment 7 (out of 100)?");
			assignment[6] = input.nextInt();
			avgAssign += assignment[6];
			
			System.out.println(name + ", what is your score for Assigment 8 (out of 100)?");
			assignment[7] = input.nextInt();
			avgAssign += assignment[7];
			
			System.out.println(name + ", what is your score for Assigment 9 (out of 100)?");
			assignment[8] = input.nextInt();
			avgAssign += assignment[8];
			
			System.out.println(name + ", what is your score for Assigment 10 (out of 100)?");
			assignment[9] = input.nextInt();
			avgAssign += assignment[9];
		
			
			//Lab Test Marks input
			System.out.println(name + ", what is your score for Lab Test 1 (out of 100)?");
			labTests[0] = input.nextInt();
			avgLab += labTests[0];
		
			System.out.println(name + ", what is your score for Lab Test 2 (out of 100)?");
			labTests[1] = input.nextInt();
			avgLab += labTests[1];
			
			System.out.println(name + ", what is your score for Lab Test 3 (out of 100)?");
			labTests[2] = input.nextInt();
			avgLab += labTests[2];
			
		//Compute the average mark for Lab Tests, Assignments, and Quizzes
		avgLab = avgLab / 3;
		avgAssign = avgAssign / 10;
		avgQuiz = avgQuiz / 9;
		
		//Input for Midterm test and Final Exam mark
		System.out.println(name + ", what is your midterm score (out of 100)?");
		midTermTest = input.nextInt();
		System.out.println(name + ", what is your final exam score (out of 100)?");
		finalExam = input.nextInt();
		
		//Compute the final raw mark
		finalMark = (avgQuiz * 0.18) + (avgAssign * 0.20) + (avgLab * 0.12) + (midTermTest * 0.15) + (finalExam * 0.35);
		
		input.nextLine();
		System.out.println(name + ", which course are you talking about?");//Prompt the user for what course this is for
		course = input.nextLine().trim();
		
		input.close();
		
		/* Print Report below
		 * */
		
		System.out.println(name + ", here is your grading report for " + course + ":");
		
		System.out.println(boundary);
		
		//Quiz marks display
		System.out.println("Quiz 1: " + quiz[0]);
		System.out.println("Quiz 2: " + quiz[1]);
		System.out.println("Quiz 3: " + quiz[2]);
		System.out.println("Quiz 4: " + quiz[3]);
		System.out.println("Quiz 5: " + quiz[4]);
		System.out.println("Quiz 6: " + quiz[5]);
		System.out.println("Quiz 7: " + quiz[6]);
		System.out.println("Quiz 8: " + quiz[7]);
		System.out.println("Quiz 9: " + quiz[8]);
		
		
		System.out.println(boundary);
		
		//Assignment marks display
		System.out.println("Assignment 1: " + assignment[0]);
		System.out.println("Assignment 2: " + assignment[1]);
		System.out.println("Assignment 3: " + assignment[2]);
		System.out.println("Assignment 4: " + assignment[3]);
		System.out.println("Assignment 5: " + assignment[4]);
		System.out.println("Assignment 6: " + assignment[5]);
		System.out.println("Assignment 7: " + assignment[6]);
		System.out.println("Assignment 8: " + assignment[7]);
		System.out.println("Assignment 9: " + assignment[8]);
		System.out.println("Assignment 10: " + assignment[9]);
		
		
		System.out.println(boundary);
		
		//Lab Test marks display
		System.out.println("Lab Test 1: " + labTests[0]);
		System.out.println("Lab Test 2: " + labTests[1]);
		System.out.println("Lab Test 3: " + labTests[2]);
		
		System.out.println(boundary);
		
		//Display Midterm Test and Final Exam marks
		System.out.println("Midterm Test: " + midTermTest);
		System.out.println("Final Exam: " + finalExam);
		System.out.println(boundary);
		
		//Display the averages and the final mark.
		System.out.println("Average of quizzes: " + avgQuiz);
		System.out.println("Average of assignments: " + avgAssign);
		System.out.println("Average of lab tests: " + avgLab);
		System.out.println("Final Raw Marks: " + finalMark);
		
	}

}
