import java.util.Scanner;

public class EquilateralTri {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("What is the size of your triange? (Between 1 and 50)");
		int triSize = scn.nextInt();


		while (triSize > 50 || triSize <= 0) {
			System.out.println("Invalid entry. Please enter triangle size between 1 and 50");
			triSize = scn.nextInt();
		}


		System.out.println("What would you like your triangle to look like? (Choose a character)");
		char character = scn.next( ).charAt(0);

		System.out.println("You have chosen " + triSize + " for the size and " + character + " for the symbol");

		makeTriange(triSize, character);

		System.out.println("Would you like to make another triangle (Y/N)");
		char userChoice = scn.next( ).charAt(0);


		while (userChoice == 'Y' || userChoice == 'y') {

			System.out.println("What is the size of your triange? (Between 1 and 50)");
			triSize = scn.nextInt();


			while (triSize > 50 || triSize <= 0) {
				System.out.println("Invalid entry. Please enter triangle size between 1 and 50");
				triSize = scn.nextInt();
			}
			System.out.println("What would you like your triangle to look like? (Choose a character)");
			character = scn.next( ).charAt(0);

			System.out.println("You have chosen " + triSize + " for the size and " + character + " for the symbol");

			makeTriange(triSize, character);

			System.out.println("Would you like to make another triangle (Y/N)");
			userChoice = scn.next( ).charAt(0);

		}

		if (userChoice == 'N' || userChoice == 'n') {
			System.out.println("Thank you for making triangles. Goodbye!");
		}

	}
	public static void makeTriange(int triSize, char character) {

		for (int i = 0; i < triSize; i++) {
			for (int n = triSize - i; n > 1; n--) {
				System.out.print(" ");
			}
			for (int n = 0; n <= i; n++ ) {
				System.out.printf("%s ",character);
			}
			System.out.println();
		}
	}
}


