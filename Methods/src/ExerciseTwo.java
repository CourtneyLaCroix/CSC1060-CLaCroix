import java.util.Scanner;

public class ExerciseTwo {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int num1;
		int num2;
		int num3;
		
		System.out.println("Please enter 3 numbers, we're checking which is largest");
		
		System.out.println("Please enter you first number");
		num1 = scn.nextInt();
		System.out.println("Please enter you second number");
		num2 = scn.nextInt();
		System.out.println("Please enter you Third number");
		num3 = scn.nextInt();
		
		System.out.printf("You have chosen the numbers, %d, %d and %d", num1, num2, num3);
		
		int maxValue = (isGreatestNumber(num1, num2, num3));
		
		System.out.printf("The greatest number is %d", maxValue);

	}

	public static int isGreatestNumber(int num1, int num2, int num3) {
		if (num1 >= num2 && num1 >= num3) {
			return num1;
		} 
		else if (num2 >= num1 && num2 >= num3) {
			return num2;
		}
		return num3;
		
	}
}
