import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("How far would you like your fibonacci sequence to go?");
		int spiralLength = scn.nextInt();
		
		System.out.println(SpinSpin(spiralLength));
		
	}
	
	public static int SpinSpin(int n) {
		if(n == 0) {
			return 0;
		}
		else {
			if( n == 1) {
				return 1;
		}
		int previousTerm = SpinSpin(n - 1);
		int previousTerm2 = SpinSpin(n - 2);
		return (previousTerm + previousTerm2);
			
			
		}
		
	}

}
