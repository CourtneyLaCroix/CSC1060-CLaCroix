import java.util.Scanner;

public class WhileThree {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int randomNumber = (int)(Math.random()*10 + 1);
		
		System.out.println("I have a random number between 1 and 10! Try guessing!");
		
		
	
		int numGuesses = 1;
		int userRandomNumber = scn.nextInt();
		
		while (randomNumber != userRandomNumber) {
			if (userRandomNumber > randomNumber) {
				System.out.println("Nice try, your number was too high!");
				userRandomNumber = scn.nextInt();
			}
			if (userRandomNumber < randomNumber) {
				System.out.println("Nice try, your number was too low!");
				userRandomNumber = scn.nextInt();
			}
			numGuesses++;
	}
		
		System.out.printf("My number was %d, you got %d after %d guesses", 
				userRandomNumber, randomNumber, numGuesses);
		
}
}

