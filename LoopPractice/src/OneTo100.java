import java.util.Scanner;

public class OneTo100 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("We're going to pring out a table of numbers from 1 to 100");
		
		System.out.println("Please enter the height (select 10)");
		int height = scn.nextInt();
		
		System.out.println("Please enter the width (select 10)");
		int width = scn.nextInt();
		
		
		mulTable(height, width);
		
	}
	
	public static void inOrder(int height, int width) {
		for (int x = 1; x <= height; x++) {
				System.out.printf("%4d", x);
				if (x % 10 == 0) {
					System.out.println();
			    }
		}
	}

	public static void mulTable(int height, int width) {
		for (int x = 1; x <= height; x++) {
			for (int y = 1; y <= width; y++) {
				System.out.printf("%4d", x * y);
			}
			System.out.println();
		}
	}

}
