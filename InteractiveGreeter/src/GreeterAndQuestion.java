import java.util.Scanner;

public class GreeterAndQuestion {

	public static void main(String[] args) {
		Scanner scn;
		scn = new Scanner(System.in);
		
		String name;
		String originalLocation;
		int age;
		String hobby;
		double donationAmount;

		
		System.out.println("What is your name?\n");
		name = scn.nextLine();
		
		System.out.println("Where are you from?\n");
		originalLocation = scn.nextLine();
		
		System.out.println("How old are you?\n");
		age = scn.nextInt();
		scn.nextLine();
		
		System.out.printf("Hello %s, you are from %s and are %d years old!\n", name, originalLocation, age);
		
		System.out.println("What is one of your favorite hobbies?\n");
		hobby = scn.nextLine();
		
		
		System.out.printf("That's really cool that you like %s!\n", hobby);
		
		System.out.println("How much would you like to donate today?\n");
		donationAmount = scn.nextDouble();
		
		System.out.printf("Thank you for donating $%.2f! Have a great day!", donationAmount);
	
	}

}
