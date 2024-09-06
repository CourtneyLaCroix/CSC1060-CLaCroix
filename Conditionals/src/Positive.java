import java.util.Scanner;

public class Positive {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int userNumber;
		
		System.out.println("Hello! We're going to print if your number is positive, negative or 0!");
		System.out.println("Please enter a number!");
		userNumber = scn.nextInt();
		
		System.out.printf("Your number is: %d\n", userNumber);
		
		if (userNumber == 0) {
			System.out.println("Your number is equal to 0");
		}
		if (userNumber < 0) {
			System.out.println("Your number is negative!");
		}
		if (userNumber > 0) {
			System.out.println("Your number is positive!");
		}
		
	}

}
