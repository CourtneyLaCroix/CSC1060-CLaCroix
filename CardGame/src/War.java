
public class War {

	public static void main(String[] args) {
		Card card = new Card(5, 2);
		
		Deck deck = new Deck();
		
		deck.shuffle();
		
		System.out.println(card.toString());
		System.out.print(deck);
	}

}
