import java.util.Scanner;

public class TenMaker {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Please enter 2 whole numbers and we'll check if their sum is equal to 10");
		System.out.println("Please enter your first number:");
		int num1 = scn.nextInt();
		
		System.out.println("Please enter your second number:");
		int num2 = scn.nextInt();
		
		if (makes10(num1, num2)) {
			System.out.printf("Your numbers: %d and %d have a sum of 10", num1, num2);
		} else {
			System.out.printf("Your numbers: %d and %d DO NOT have a sum of 10", num1, num2);
		}
		
		

	}
	public static boolean makes10(int num1, int num2) {
		return (num1 + num2 == 10);	
	}
}
