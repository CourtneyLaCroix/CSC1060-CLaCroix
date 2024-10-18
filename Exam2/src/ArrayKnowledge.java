import java.util.Arrays;

public class ArrayKnowledge {

	public static void main(String[] args) {
		char[] test1 = {'x'}; //false
		char[] test2 = {'x','x'}; //true
		char[] test3 = {'a', 'x', 'a','b','x'}; //false
		char[] test4 = {'a', 'x', 'a','b','x', 'x'}; //true
		char[] test5 = {};

		System.out.println(hasxx(test4));

		int test1Q2 = 5;
		int test2Q2 = 10;
		int test3Q2 = 11;
		int test4Q2 = 18;
		int test5Q2 = 0;


		System.out.println(Arrays.toString(fromToArray(1, 3)));

	}
	public static boolean hasxx(char[] characters) {
		for (int i = 1; i < characters.length; i++) {
			if (characters[i] == 'x' && characters[i - 1] == 'x') {
				return true;
			}
		}
		return false;
	}

	public static int[] fromToArray(int start, int end) {
		//assuming end is always larger then start

		int arrayLength = Math.max(start, end) - Math.min(start, end);



		int[] myArray = new int[arrayLength];

		for (int i = 0; i < arrayLength; i++) {
			myArray[i] = start + i;
		}

		return myArray;
	}
}
