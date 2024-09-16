import java.util.Scanner;

public class WhileFour {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = 0;
		
		System.out.println("PLease enter a random number");
		int userNum = scn.nextInt();
		int userNumSum = 0;
		
		while (num < userNum) {
			System.out.printf("%d is num currently\n, lets add one", num);
			num++;
		}
		
		
		System.out.printf("Your number was: %d, its sum is: %d", userNum, userNumSum);

	}

}
