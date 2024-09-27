import java.util.Scanner;

public class Doubloon {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("We are going to check if you word is a doubloon!"
				+ " Please enter a word:");
		String userWord = scn.next();
		
		if (isDoubloon(userWord)) {
			System.out.printf("Your word: %s is a Doubloon", userWord);
		}
		else {
			System.out.printf("Your word: %s NOT is a Doubloon", userWord);
		}

	}

	public static boolean isDoubloon(String userWord) {
		String userWordLower = userWord.toLowerCase();


		for (int i = 0; i < userWordLower.length(); i++) {
			char letter = userWordLower.charAt(i);
			int count = 0;

			for (int j = 0; j < userWordLower.length(); j++) {
				if (letter == userWordLower.charAt(j)) {
					count++;
				}
			}
			if (count != 2) {
				return false;
			}
		}
		return true;
	}
}
