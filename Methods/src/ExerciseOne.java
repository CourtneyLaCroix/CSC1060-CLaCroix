import java.util.Scanner;

public class ExerciseOne {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int input;
		
		System.out.println("Please enter a number");
		input = scn.nextInt();
		
		if (isPositive(input) {
			System.out.printf("Your number, %d is postive", input);
		} else {
			System.out.printf("Your number, %d is negative", input);
		}

	}
	
	
	public static boolean isPositive(int input) {
		if (input > 0) {
			return true;
		} else {
			return false; 
		}
	}
}
