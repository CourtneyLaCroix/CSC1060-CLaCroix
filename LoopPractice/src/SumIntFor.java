import java.util.Scanner;

public class SumIntFor {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("please enter a number");
		int userNum = scn.nextInt();
		int SumOfUserNum = 0;
		
		for(int i = 1; i <= userNum; i++) {
			System.out.printf("%d +\n", SumOfUserNum);
			SumOfUserNum = SumOfUserNum + i;
		}

		System.out.printf("your number %d, total sum is: %d", userNum, SumOfUserNum);
	}

}
