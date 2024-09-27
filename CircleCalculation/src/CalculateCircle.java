import java.util.Scanner;

public class CalculateCircle {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		double userInput;

		System.out.println("Please enter the radius of your circle:");

		userInput = scn.nextDouble();

		System.out.printf("You have entered the radius: %.2f \n", userInput);

		System.out.printf("Your circles diameter is %.2f, area is %.2f and circumfrence is %.2f",
				getDiameter(userInput),getArea(userInput), getcircumference(userInput));
	}

	public static double getDiameter(double userInput) {
		double diaResult = userInput * 2;
		return diaResult;
	}

	public static double getArea(double userInput) {
		double areaResult = Math.PI * Math.pow(userInput, 2);
		return areaResult;
	}

	public static double getcircumference(double userInput) {
		double circumfResult = 2 * Math.PI * userInput;
		return circumfResult;
	}

}
