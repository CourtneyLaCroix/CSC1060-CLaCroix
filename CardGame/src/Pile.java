import java.util.ArrayList;
import java.util.List;

public class Pile {
	private List<Card> cards;

	public Pile() {
		this.cards = new ArrayList<Card>();
	}

	public void addDeck(Deck deck) {
		//Card[] dcards = deck.getCards();
		//for (int i = 0; i < dcards.length; i++) {
		//	this.cards.add(dcards[i]);
		//}
		Card[] dcards = deck.getCards();
		for (Card card: dcards) {              //for EACH Card (type) card IN decks
			this.cards.add(card);
		}

	}
	public Card popCard() {
		Card card = cards.remove(0);
		return card;
	}
	
	public boolean isEmpty() {
		return cards.isEmpty();
	}
	
	public void addPile(Pile oPile) {
		for (int i = 0; i < oPile.cards.size(); i++) {
		cards.add(oPile.cards.remove(i));
		}

		//for (Card cd: oPile.cards) {              //for EACH Card (type) card IN decks
		//	cards.add(cd);
		
	}

	public void addCard(Card c1) {
		cards.add(c1);
		
	}

	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}


}