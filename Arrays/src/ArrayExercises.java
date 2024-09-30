
public class ArrayExercises {

	public static void main(String[] args) {
		int[] numbers = {5, 7, 8, 3, 1};
		
		int value = 1;
		
		if (FindValue(numbers, value)) {
			System.out.printf("the value: %d is in the array", value);
		}
		else {
			System.out.printf("the value: %d is NOT in the array", value);
		}

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

}
