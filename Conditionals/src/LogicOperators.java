import java.util.Scanner;

public class LogicOperators {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Please enter a number");
		int input = scn.nextInt();
		
		
		if (input > 10) {
			System.out.printf("Your number is greater then then 10\n");
		}
		
		if ((input > 10) && (input <= 20)) {
			System.out.println("Your number is greater then 10, <= to 20");
		}
		
		if ((input > 30) && (input < 50) || (input < -1) && (input > -6)) {
			System.out.println("Your number is A");
		} else {
			System.out.println("Your number is B");
		}
		
		if (! isSingleDigit(input)) {
			System.out.println("This is not a single digit number");
		}
		

	}
	
	public static boolean isSingleDigit(int input) {
		if (input > -10 && input < 10) {
			return true;
		} else {
			return false;
		}
	}

}
