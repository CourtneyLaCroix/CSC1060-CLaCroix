import java.util.Arrays;

public class ArrayExercises {

	public static void main(String[] args) {
		int[] numbers = {5, 7, 8, 3, 1};
		int[] numbers2 = {7, 1, 10, 2};
		
		//int value = 1;
		
		//if (FindValue(numbers, value)) {
		//	System.out.printf("the value: %d is in the array", value);
		//}
		//else {
			//System.out.printf("the value: %d is NOT in the array", value);
		//}
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		ArraySwap(numbers);
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		System.out.println(Arrays.toString(findCommon(numbers, numbers2)));
		

	}
	public static boolean FindValue(int[] scr, int value) {
		int check = 0;
	
		for(int i = 0; i< scr.length; i++) {
			if (value == scr[i]) {
				return true;
			}
		}
		return false;
	
	}
	
	public static int[] ArrayReverse(int[] scr) {
		int[] newNumbers = new int[scr.length]; 
		
		for(int i = scr.length; i >= scr.length / 2; i--) {
			
			
			newNumbers[0] = scr[i];
		}
	return newNumbers;
	}
	
	public static int[] ArraySwap(int[] scr) {
		
		for (int i = 0; i < scr.length / 2 ; i++) {
			int temp = scr[i];
			scr[i] = scr[scr.length -i -1];
			scr[scr.length -i -1] = temp; 
		}
		
	return scr;
	}
	
	public static int[] findCommon(int[] array1, int[] array2) {
		int min = Math.min(array1.length, array2.length);
		int max =Math.max(array1.length, array2.length);
		int[] thirdArray = new int [min];
		int[] matches;
		
		int count = 0;
		for (int i = 0; i < min; i++) {
			int numberInArray1 = 0;
			
			if (array1.length > array2.length) {
				numberInArray1 = array1[i];
			}
			else {
				numberInArray1 = array2[i];
			}
			
			for (int j = 0; j < max; j++) {
				if(numberInArray1 == array2[j]) {
					thirdArray[count] = numberInArray1;
					count++;
				}
			}
		}
		matches = new int[count];
		for (int i = 0; i < count; i++) {
			matches[i] = thirdArray[i];
		}
		return matches;
	}

}

