import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Please enter a number:");
		int userNumber = scn.nextInt();
		int totalSum = 0;
		
		
		do{
			if (userNumber == 0) {
				break;
			}
			totalSum = totalSum + userNumber;
			System.out.println("Please enter a another number\n"
					+ "Enter 0 to exit");
			
			System.out.printf("current total: %d\n", totalSum);
			
			userNumber = scn.nextInt();
		}
		// Condition check
		while (userNumber > 0);
		
		System.out.println("you have exited");
	}

}
