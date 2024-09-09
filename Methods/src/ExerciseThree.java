import java.util.Scanner;

public class ExerciseThree {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		double userInput;
		
		System.out.println("Please enter a floating point number. EXAMPLE: 4.5 or 0.432");
		userInput = scn.nextDouble();

		String returnedUserInput = isTooSmall(userInput);
		
		System.out.printf("your number %f is %s", userInput, returnedUserInput);
		
	}
	public static String isTooSmall(double userInput) {
		if (userInput == 0) {
			return "zero";
		}
		if (userInput > Math.abs(1000000)) {
			return "Too Large";
		}
		if (userInput > 0) {
			return "positive";
		} 
		if (userInput < 0) {
			return "negative"; 
		} 
		return null;
	}

}
