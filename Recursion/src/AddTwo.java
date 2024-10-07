import java.util.Scanner;

public class AddTwo {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Please enter a term");
		int userInput = scn.nextInt();

		
		//System.out.println(userInput);
		
		int returnNumber = findNthTerm(userInput);
		 System.out.println(returnNumber);
		
	}
	public static int findNthTerm(int n) {
		if (n == 0) {
			//System.out.println(n);
			return 0;
		}
			//System.out.println(n);
			int previousTerm = findNthTerm(n - 1);
			return previousTerm + 2;
		
	}

}
