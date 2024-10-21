import java.util.Arrays;
import java.util.Random;

public class Deck {
	private Card[] cards;
	
	public Deck() {
		this.cards = new Card[52];
		int cardIndex = 0;
		
		for (int j = 0; j < 4; j++) { //num of suits SUITS
			for (int i = 1; i < 14; i++) { //Aces to kings RANK
				cards[cardIndex] = new Card(i,j);
				cardIndex++;
			}
		}
	}

	public Card[] getCards() {
		return cards;
	}

	public void setCards(Card[] cards) {
		this.cards = cards;
	}
	
	public void shuffle() {
		Random random = new Random();
		
		for (int i = 0; i < cards.length; i++) {
			Card temp = cards[i];
			int randomIndex = random.nextInt(0, cards.length);
			cards[i] = cards[randomIndex];
			cards[randomIndex] = temp;
		}
	}

	public String toString() {
		return "Deck: " + Arrays.toString(cards);
	}
	
	
	
}
