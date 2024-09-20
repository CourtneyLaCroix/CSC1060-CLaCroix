import java.util.Scanner;

public class Accumulator {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int totalSum = 0;
		
		System.out.println("Enter in as many numbers as you'd like to find their total sum. "
				+ "Enter 0 when you'd like to stop");
		
		System.out.println("Please enter your first number:");
		int userNum = scn.nextInt();
		
		while (userNum != 0) {
			totalSum = totalSum + userNum;
			System.out.printf("Please enter another number, your current total sum is %d\n", totalSum);
			userNum = scn.nextInt();
		}
		
		if (userNum == 0) {
			System.out.printf("You have selected 0, your final total sum is %d", totalSum);
		}

	}

}
