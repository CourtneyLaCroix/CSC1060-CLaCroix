import java.util.Scanner;

public class CalculateGrades {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		double userInputGrade;
		
		System.out.println("Please enter your grade:");
		userInputGrade = scn.nextDouble();
		
		System.out.printf("You have entered the numaric grade: %.2f, your letter grade is: %s", 
				userInputGrade, getLetterGrade(userInputGrade));

	}
	
	public static String getLetterGrade(double userInputGrade) {
		if (userInputGrade >= 92.00) {
			return "A";
		}
		if (userInputGrade < 92.00 && userInputGrade >= 89) {
			return "A-";
		}
		if (userInputGrade < 89 && userInputGrade >= 87) {
			return "B+";
		}
		if (userInputGrade < 87 && userInputGrade >= 82) {
			return "B";
		}
		if (userInputGrade < 82 && userInputGrade >= 79) {
			return "B-";
		}
		if (userInputGrade < 79 && userInputGrade >= 77) {
			return "C+";
		}
		if (userInputGrade < 77 && userInputGrade >= 72) {
			return "C";
		}
		if (userInputGrade < 72 && userInputGrade >= 69) {
			return "C-";
		}
		if (userInputGrade < 69 && userInputGrade >= 67) {
			return "D+";
		}
		if (userInputGrade < 67 && userInputGrade >= 60) {
			return "D";
		}
		if (userInputGrade < 60 && userInputGrade >= 0) {
			return "F";
		}
		if (userInputGrade < 0) {
			return "error";
		}
		return "error";
}
}
