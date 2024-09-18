import java.util.Scanner;

public class Factorials {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Please enter a number");
		int userNum = scn.nextInt();
		int factProduct = 1;
		
		
		//for (int i = userNum; i >= 1; i--) {
		//	factProduct = factProduct * i; 
			
		//}
		
		//System.out.printf("Your number, %d, the factorial is = %d\n", userNum, factProduct);
		
		for (int i = 1; i <= userNum; i++) {
			factProduct = factProduct * i;
		}
	
		System.out.printf("Your number, %d, the factorial is = %d\n", userNum, factProduct);
	}

}
