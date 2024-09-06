import java.util.Scanner;

public class Modulo {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int userNumber;
		
		
		System.out.println("I am going to tell you if your number is even or odd.");
		System.out.println("Please enter a number");
		userNumber = scn.nextInt();
		
		System.out.printf("You have entered the number %d\n", userNumber);
		
		if (isEven(userNumber)) {
			System.out.println("The number is even!");
		} else {
			System.out.println("The number is odd");
		}
		
		
	}
	
	public static boolean isEven(int userNumber) {
		if (userNumber % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

}
