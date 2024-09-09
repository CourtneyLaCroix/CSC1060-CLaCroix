import java.util.Scanner;

public class RandomNumberGuesser {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int randomNumber = (int)(Math.random()*10 + 1);
		
		System.out.println(randomNumber);
		
		
		System.out.println("Enter a random number between 1 and 10");
		
		
		int userNumber;
		userNumber = scn.nextInt();
		
		System.out.printf("You have enter the number %d\n", userNumber);
		
		if (userNumber == randomNumber) {
			System.out.printf("your number %d and the random number %d are the same", userNumber, randomNumber);
		} else {
			System.out.println("The numbers are not the same");
		}
		
	
	}

}
