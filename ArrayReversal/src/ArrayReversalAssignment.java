import java.util.Scanner;

public class ArrayReversalAssignment {

	public static void main(String[] args) {
//		you are to write a program that reads in a number of positive integers 
//		from the user, stores them in an array, and prints them out in the reverse order. 
//		The user will enter the numbers one on each line and will use -1 to mark the end.
//		The user will never enter more than 100 numbers.
//		  1)  You should create an array to hold the numbers.
//		  2)  You should read in the numbers using a Scanner inside of a loop.
//		  3)  You should stop the loop when the user enters a value of -1.
//		  4)  You should loop through the array backwards printing each value.
//		  5)  Do not print the -1 value or any unused areas of the array.

		
		Scanner scn = new Scanner(System.in);
		
		
		System.out.println("Enter in the size of your array"); //takes in size of the array
		int arraySize = scn.nextInt();
		
		while (arraySize > 100 || arraySize < 0) { //cannot be negative or be over 100
			System.out.println("Invalid array size. Enter new number");
			arraySize = scn.nextInt();
		}
		
		int[] userNums = new int[arraySize]; //sets arraySize
		int userVal = 0;
		
		System.out.println("Please enter numbers for your array!\n"
				+ "I will reverse it after you hit the array size\n"
				+ "or hit -1 to exit ");
		
		for (int i = 0; i < userNums.length; i++) { //filling array with values
			System.out.println("Enter a number:");
			userVal = scn.nextInt();
			userNums[i] = userVal;
			if (userVal == -1 ) {
				break; // if negative 1 is entered, break from loop
			}
		}	
		
		AdjustArray(userNums); // SHOULD remove -1 and 0's
			
		System.out.println("Your entered array:");
		for (int i = 0; i < userNums.length; i++) {
			System.out.print(userNums[i] + " ");
		}
		System.out.println();
		
		ArrayReverse(userNums); 
		
		System.out.println("Your array reversed:\n");
		for (int i = 0; i < userNums.length; i++) {
			System.out.print(userNums[i] + " ");
		}
	}
	public static int[] ArrayReverse(int[] scr) { // reverses array
		
		for(int i = 0; i < scr.length / 2; i++) {
			int temp = scr[i];
			scr[i] = scr[scr.length -i -1];
			scr[scr.length -i -1] = temp;
		}
	return scr;
	}
	
	public static int[] AdjustArray(int[] scr) { //finds the value of -1, removes it and 0's after it
		int newArrayLength = 0;
		
		for (int i = 0; i < scr.length; i++) {
			if (scr[i] == -1) {
				int remainder = scr.length - i;
				newArrayLength = scr.length - remainder;
			}
		}
		int []returnArray = new int[newArrayLength];
		
		for (int i = 0; i < returnArray.length; i++) {
			returnArray[i] = scr[i];
		}
		return returnArray;
	}

}
