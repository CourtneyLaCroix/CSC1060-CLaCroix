import java.util.Scanner;

public class ForFibonacci {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		
		System.out.println("How far would you like your fibonacci sequence to go?");
		int spiralLength = scn.nextInt();
		
		int num1 = 0;
		int num2 = 1;
		int i = 1;
		
		int spiralSum = 0;
		
		while (i < spiralLength) {
			spiralSum = num1 + num2;
			num1 = num2;
			num2 = spiralSum;
			i++;
		}
		
		System.out.printf("You preformed %d spirals, your sum is %d", spiralLength, spiralSum);

	}

}
