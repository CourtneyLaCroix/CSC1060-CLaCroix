import java.util.Scanner;

public class ExerciseFour {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int userInput;
		
		System.out.println("Enter a number between 1 and 7");
		userInput = scn.nextInt();
		
		String weekday = getWeekDay(userInput);
		
		System.out.printf("your number %d, is %s", userInput, weekday);

	}
	public static String getWeekDay(int userInput) {
		String word = null;
		
		switch (userInput) {
			case 1:
				word = "Sunday";
				break;
			case 2:
				word = "Monday";
				break;
			case 3:
				word = "Tuesday";
				break;
			case 4:
				word = "Wednesday";
				break;
			case 5:
				word = "Thursday";
				break;
			case 6:
				word = "Friday";
				break;
			case 7:
				word = "Saturday";
				break;
			default:
				word = "unknown";
				break;
		}
		return word;
	}
}
