import java.util.Scanner;

public class FactorialWhile {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Please enter a number");
		int userNum = scn.nextInt();
		int factProduct = 1;
		int i = 1;

		while (i <= userNum) {
			factProduct = factProduct * i++;
		}

		System.out.printf("You have entered %d, the factorial product is %d",userNum,factProduct);
	}

}
