import java.util.Scanner;

public class Echo {

	public static void main(String[] args) {
		
		Scanner scn;
		scn = new Scanner(System.in);
		String line;
		int age;
		double temp;
		
		
		System.out.println("What is your name?");
		line = scn.nextLine();
		System.out.println("Your name is " + line);
		
		System.out.println("How old are you?");
		age = scn.nextInt();
		System.out.println("you are " + age + " years old.");

		System.out.println("what tempurature is it today?");
		temp = scn.nextDouble();
		System.out.println("The tempurature is " + temp);
	}

}
