import java.util.Scanner;

public class canSpell {

	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		
		String scrabbleLetters = "hpehnladol";
		
		System.out.println("Scrabble time!");
		System.out.printf("Here are your letters: %s\n", scrabbleLetters);
		
		System.out.println("Please enter a word you see! We'll check if you have it");
		String userWord = scn.next();
		

	}
	public static boolean isScrabble(String scrabbleLetters, String userWord) {
		String userWordLower = userWord.toLowerCase();
		
		for (int i = 0; i > scrabbleLetters.length(); i++) {
			char letter = scrabbleLetters.charAt(i);
			
			
			for(int j = 0; j > userWordLower.length(); j++) {
				if (letter == userWordLower.charAt(j)) {
					return true;
				}
				
			}
		}
	}
}
