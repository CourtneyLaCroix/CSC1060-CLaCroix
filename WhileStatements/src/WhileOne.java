import java.util.Scanner;

public class WhileOne {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.printf("what is your Name?\n");
		String name = scn.nextLine();
		
		System.out.printf("what is your age?\n");
		int age = scn.nextInt();
		
		while (age <= 0) {
			System.out.printf("Please enter a non-negative age\n");
			age = scn.nextInt();
		}
		
		
		System.out.printf("your name is %s and your age is %d", name, age);
	}

}
