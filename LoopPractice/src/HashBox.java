import java.util.Scanner;

public class HashBox {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Please enter the height");
		int height = scn.nextInt();

		System.out.println("Please enter the width");
		int width = scn.nextInt();


		for (int x = 1; x <= height; x++) {

			for (int y = 1; y <= width; y++) {

				System.out.printf("#", x * y);
			}
			System.out.println();
		}

	}

}
