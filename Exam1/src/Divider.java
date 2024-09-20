import java.util.Scanner;

public class Divider {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("We're going to divide! Please enter a number,"
				+ " followed by the number you would like it to be divided by.");
		
		System.out.println("Please enter your first number:");
		double num1 = scn.nextDouble();
		
		System.out.println("Please enter your second number");
		double num2 = scn.nextDouble();
		
		while (num2 == 0) {
			System.out.println("The second number cannot be 0, please enter a new number");
			num2 = scn.nextDouble();
		}
		
		double answer = (double) num1 / num2;
		
		System.out.printf("The answer is %.2f when you divide %.2f by %.2f", answer, num1, num2);
	}

}
