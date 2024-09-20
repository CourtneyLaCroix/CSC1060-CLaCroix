import java.util.Scanner;

public class BeverageSelector {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Please select a beverage");
		System.out.printf(" press (1) for Water\n press (2) for Coke\n press (3) for Coffee\n");
		
		int customerSelection = scn.nextInt();
		
		if (customerSelection == 1) {
			System.out.printf("You have selected %d, here is your Water!", customerSelection);
		}
		if (customerSelection == 2) {
			System.out.printf("You have selected %d, here is your Coke!", customerSelection);
		}
		if (customerSelection == 3) {
			System.out.printf("You have selected %d, here is your Coffee!", customerSelection);
		} else if (customerSelection > 3 || customerSelection < 1) {
			System.out.println("Invalid selection");
		}
		

	}

}
