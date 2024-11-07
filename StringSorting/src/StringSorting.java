import java.util.Arrays;
import java.util.Scanner;

public class StringSorting {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("How many entries?");
		int arrSize = scn.nextInt();
		

		String[] myArr = getInputs(arrSize);
		
		System.out.println(Arrays.toString(myArr));
		System.out.println();
		
		System.out.println("How would you like to sort your array?" +
							"\n\tPress 1 for A-Z" +
							"\n\tPress 2 for Z-A");
		
		int userInput = scn.nextInt();
		
		if (userInput == 1) {
			bubbleSort(myArr);
			
			System.out.println(Arrays.toString(myArr));
		}
		else if (userInput == 2) {
			bubbleSortReverse(myArr);
			
			System.out.println(Arrays.toString(myArr));
		}
		
		
		
	}
	
	public static String[] getInputs(final int MAXINPUTS) {
		Scanner scn = new Scanner(System.in);
		String[] myArr = new String[MAXINPUTS];
		
		for (int i = 0; i < myArr.length; i++) {
			System.out.println("Please enter next string");
			myArr[i] = scn.next();
		}
		
		return myArr;
	}
	
	public static void bubbleSort(String arr[]){
        int n = arr.length;
       
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

	 public static void bubbleSortReverse(String[] arr) {
	        int n = arr.length;
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (arr[j].compareTo(arr[j + 1]) < 0) {
	                    String temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }
	    }
}
