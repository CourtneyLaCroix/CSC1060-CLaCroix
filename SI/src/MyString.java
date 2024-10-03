import java.util.Scanner;

public class MyString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("please enter your string");
		String userString1 = input.nextLine();
		
		System.out.println("please enter your string");
		String userString2 = input.nextLine();
		
		char[] myString1 = makeMyString(userString1);
		char[] myString2 = makeMyString(userString2);
		
		System.out.println(isEqual(myString1, myString2));
		
	}
	// returns string into an array of chars
	public static char[] makeMyString(String str) {
		return str.toCharArray();
	}
	
	public static boolean isEqual(char[] chars1, char[] chars2) {
		if(chars1.length != chars2.length) {
			return false;
		}
		
		for(int i = 0; i < chars1.length; i++) {
			if(chars1[i] != chars2[i]) {
				return false;
			}
		}
		return true;
	}

	public static int length(char[] char1) {
		return char1.length;
	}
	
	public static String toString(char[] char1) {
		String completeString = "";
		
		for (int i = 0; i < length(char1); i++) {
			completeString += char1[i];
		}
		
		return completeString;
	}
}
