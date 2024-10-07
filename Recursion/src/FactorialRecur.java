import java.util.Scanner;

public class FactorialRecur {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int factorial = scn.nextInt();	
		
		System.out.println(returnFactorial(factorial));

	}
	public static int returnFactorial(int n) {
		int factorialProduct = 1;
		
		if (n == 0) {
			return 1;
		}
		if (n == 1) {
			return 1;
		}
		int previousTerm = returnFactorial(n - 1);
		factorialProduct = n * previousTerm;
		return factorialProduct;
	}
}
