import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		String name;
		int age;
		
		System.out.println("what is your name?");
		name = scn.nextLine();
		System.out.println("Hello! Please enter your age.");
		age = scn.nextInt();
		
		
		printGreeting(age, name);
		
		

	}

	public static void printGreeting(int age, String name) {
		if (age <= 18) {
			System.out.printf("%s, You are %d years old!",name, age);
		} else {
			System.out.printf("%s,YOU ARE OLD", name);
		}
	}
}
