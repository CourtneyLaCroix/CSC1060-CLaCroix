import java.util.Scanner;

public class WhileTwo {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Please enter a random numer between 1 and 10!");
		int userRandomNumber = scn.nextInt();
		
		System.out.println("I'm now going to guess your number!");
		
		int randomNumber = (int)(Math.random()*10 + 1);
		int numGuesses = 1;
		
		while (randomNumber != userRandomNumber) {
			randomNumber = (int)(Math.random()*10 + 1);
			numGuesses++;
	}
		
		System.out.printf("Your number was %d, I got %d after %d guesses", 
				userRandomNumber, randomNumber, numGuesses);
		
}

}
