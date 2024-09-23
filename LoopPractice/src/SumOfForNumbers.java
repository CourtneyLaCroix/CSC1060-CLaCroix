import java.util.Scanner;

public class SumOfForNumbers {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("We're going to calculate the sum of the first 10 natural numbers");
		
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
		
		sum = sum + i;

	}
		
		System.out.printf("The sum of the first ten natural numbers is %d", sum);

}
}
