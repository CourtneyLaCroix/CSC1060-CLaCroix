import java.util.Arrays;
import java.util.Random;

public class Deck {
	private Card[] cards;
	private Random random = new Random();
	
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

	public Deck(int numCards) {
		this.cards = new Card[numCards];
	}

	public Card[] getCards() {
		return cards;
	}

	public void setCards(Card[] cards) {
		this.cards = cards;
	}
	
	public void shuffle() {
		
		for (int i = 0; i < cards.length; i++) {
			Card temp = cards[i];
			int randomIndex = random.nextInt(0, cards.length);
			cards[i] = cards[randomIndex];
			cards[randomIndex] = temp;
		}
	}

	public Deck subdeck(int start, int end) {
		Deck subdeck = new Deck(end - start + 1);
		int j = 0;
		for(int i = start; i <= end; i++) {
			subdeck.cards[j] = this.cards[i];
			j++;
		}
		return subdeck;
	}
	
	
	public String toString() {
		return "Deck: " + Arrays.toString(cards);
	}
	
	
	
}
