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
	
		
		
		for (int i = 1; i <= 9; i ++) {
			System.out.println(name + ", what is your score for Quiz " + i + "(out of 100)?");
			quiz[i - 1] = input.nextInt();
			avgQuiz += quiz[i - 1]; 
		}
		
		for (int i = 1; i <= 10; i ++) {
			System.out.println(name + ", what is your score for Assigment " + i + "(out of 100)?");
			assignment[i - 1] = input.nextInt();
			avgAssign += assignment[i - 1];
		}
		
		for (int i = 1; i <= 3; i ++) {
			System.out.println(name + ", what is your score for Lab Test " + i + "(out of 100)?");
			labTests[i - 1] = input.nextInt();
			avgLab += labTests[i - 1];
		}
		
		avgLab = avgLab / 3;
		avgAssign = avgAssign / 10;
		avgQuiz = avgQuiz / 9;
		
		System.out.println(name + ", what is your midterm score (out of 100)?");
		midTermTest = input.nextInt();
		System.out.println(name + ", what is your final exam score (out of 100)?");
		finalExam = input.nextInt();
		finalMark = (avgQuiz * 0.18) + (avgAssign * 0.20) + (avgLab * 0.12) + (midTermTest * 0.15) + (finalExam * 0.35);
		
		input.nextLine();
		System.out.println(name + ", which course are you talking about?");
		course = input.nextLine().trim();
		
		input.close();
		
		/* Print Report below
		 * */
		
		System.out.println(name + ", here is your grading report for " + course + ":");
		
		System.out.println(boundary);
		
		for (int i = 1; i <= 9; i ++) {
			System.out.println("Quiz " + i + ": " + quiz[i - 1]);
		}
		
		System.out.println(boundary);
		
		for (int i = 1; i <= 10; i ++) {
			System.out.println("Assignment " + i + ": " + assignment[i - 1]);
		}
		
		System.out.println(boundary);
		
		for (int i = 1; i <= 3; i ++) {
			System.out.println("Lab Test " + i + ": " + quiz[i - 1]);
		}
		
		System.out.println(boundary);
		System.out.println("Midterm Test: " + midTermTest);
		System.out.println("Final Exam: " + finalExam);
		System.out.println(boundary);
		
		System.out.println("Average of quizzes: " + avgQuiz);
		System.out.println("Average of assignments: " + avgAssign);
		System.out.println("Average of lab tests: " + avgLab);
		System.out.println("Final Raw Marks: " + finalMark);
		
	}

}
