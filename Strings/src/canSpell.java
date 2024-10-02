import java.util.Scanner;

public class canSpell {

	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		
		String scrabbleLetters = "hpehnladol";
		
		System.out.println("Scrabble time!");
		System.out.printf("Here are your letters: %s\n", scrabbleLetters);
		
		System.out.println("Please enter a word you see! We'll check if it's there!");
		String userWord = scn.next();
		
		if (isScrabble(scrabbleLetters,userWord)) {
			System.out.println("Your word IS in the tiles");
		}
		else {
			System.out.println("You're word is NOT in the tiles");
		}
		

	}
	public static boolean isScrabble(String scrabbleLetters, String userWord) {
		String userWordLower = userWord.toLowerCase();
		
		
		for (int i = 0; i < userWordLower.length(); i++) {
			String letter = userWordLower.substring(i,i+1);
			boolean found = false;
			
			for(int j = 0; j < scrabbleLetters.length(); j++) {
				if (letter.charAt(0) == scrabbleLetters.charAt(j)) {
					scrabbleLetters = scrabbleLetters.replaceFirst(letter, " ");
					found = true;
					break;
				}
			}
			if (!found) {
				return false;
			}
		}
		return true;
	}
}
