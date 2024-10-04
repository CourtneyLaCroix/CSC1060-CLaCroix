import java.util.Scanner;

public class Sales {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Please enter your sales:");
		double userInput = scn.nextDouble();

		double sales[] = new double[5];
		String iD[] = new String [5];
		
		for (int i = 0; i < sales.length; i++) {
			sales[i] = userInput;
			
			System.out.println("Please enter another sale");
			userInput = scn.nextDouble();	
			
	
		}
		for (int i = 0; i < sales.length; i++) {
			System.out.print(sales[i] + " ");
		}

	}
	public static double averageSales(double [] scr) {
		
	}
	public static double maximumSale(double [] scr) {
		
	}
	public static double minimumSale(double [] scr) {
		
	}
	public static String aboveAverage(double [] scr) {
		
	}
	
}
