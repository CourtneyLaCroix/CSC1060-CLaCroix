import java.util.Scanner;

public class RightAngleLoop {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("How large would you like your triange?");
		int triSize = scn.nextInt();
		
		
		for (int i = 1; i <= triSize; i++) {
            for (int n = triSize - i; n > 1; n--) {
            }
            for (int n = 1; n <= i; n++ ) {
                System.out.print(n);
            }
            System.out.println();
        }

	}

}
