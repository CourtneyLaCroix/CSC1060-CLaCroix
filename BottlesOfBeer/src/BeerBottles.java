import java.util.Scanner;

public class BeerBottles {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter a number for how many bottles of beer:");
		int beerBottles = scn.nextInt();
		
		int originalAmountOfBeer = beerBottles;
		
		
		while (beerBottles > 2) {
			System.out.printf("%d bottles of beer on the wall, %d bottles of beer\n",
					beerBottles, beerBottles);
			beerBottles--;
			System.out.printf("Take one down and pass it around, %d bottles of beer on the wall.\n",
					beerBottles);
			
			if (beerBottles >= 1) {	
				System.out.printf("2 bottles of beer on the wall, 2 bottles of beer\nTake one down and pass it around, 1 bottle of beer on the wall.\n");
				beerBottles--;
			} 
			if (beerBottles >= 0) {
				System.out.printf("1 bottle of beer on the wall, 1 bottle of beer.\n"
						+ "Take one down and pass it around, 0 bottles of beer on the wall.\n"
						+ "0 bottles of beer on the wall, 0 bottles of beer.\n"
						+ "Go to the store and buy some more, %d bottles of beer on the wall.\n",
						originalAmountOfBeer);
			}
		}

	}

}
