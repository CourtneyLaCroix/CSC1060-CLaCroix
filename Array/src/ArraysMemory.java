import java.util.Scanner;

public class ArraysMemory {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("How many numbers should the program remember?");
		int userNumbers = scn.nextInt();

		int[] numbers = new int [userNumbers]; // array is created *new* key word
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.printf("Please enter a value for the %d box\n", i);
			int num = scn.nextInt();
			numbers[i] = num;	
		}
		
		System.out.println("Length of Array:" + numbers.length);
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		int num1 = 5;
		int num2 = 5;
		int answer = addIt(num1, num2);
		
		int[] scores = new int[4];
		
		answer = add(scores);
	}

	public static int addIt(int num1, int num2) {
		return num1 + num2;
	}
	public static int add(int[] scr) { //expects array of ints// 
		int total =0;
		for(int i = 0; i< scr.length; i++) {
			total += scr[i];
		}
	}
}
