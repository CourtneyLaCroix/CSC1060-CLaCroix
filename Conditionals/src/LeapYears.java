import java.util.Scanner;

public class LeapYears {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in); 
		
		int userYear;
		
		System.out.println("We're going to check if certain years are leap years!");
		System.out.println("Please enter a year:");	
		userYear = scn.nextInt();
		
		System.out.printf("You have entered the year %d\n", userYear);
		
		leapYear(userYear);
		

	}
	
	public static void leapYear(int userYear) {
		if (userYear % 400 == 0) {	
			System.out.printf("%d is a leap year", userYear);
		} else if (userYear % 100 == 0) {
			System.out.printf("%d is not a leap year", userYear);
		} else if (userYear % 4 == 0) {
			System.out.println("This year is leap year");
		} else {
			System.out.println("This year is not a leap year");
		}
	}

}
