
public class War {

	public static void main(String[] args) {
		Card card = new Card(5, 2);
		
		Deck deck = new Deck();
		
		Deck deckTest = new Deck();
		
		deck.shuffle();
		
		System.out.println(deck);
		
		deck.sort();
		
		System.out.println(deck);
		
		deckTest.sortBySuit();
		
		System.out.println(deckTest);
		
//		Pile p1 = new Pile();
//		Deck sub1 = deck.subdeck(0, 25);
//		p1.addDeck(sub1);
//		
//		Pile p2 = new Pile();
//		Deck sub2 = deck.subdeck(26, 51);
//		p2.addDeck(sub2);
//		
//		Pile winP1 = new Pile();
//		Pile winP2 = new Pile();
//		
//		
//		
//		Pile playPile = new Pile();
//		
//		while(!p1.isEmpty() && !p2.isEmpty()) {
//		
//			Card c1 = p1.popCard();	
//			Card c2 = p2.popCard();
//			playPile.addCard(c1);
//			playPile.addCard(c2);
//					
//			int result = c1.compareTo(c2);
//			
//			if (result > 0) {
//				winP1.addPile(playPile);
//			}
//			else if (result < 0) {
//				winP2.addPile(playPile);
//			}
//		}
//		if (winP1.size() > winP2.size()) {
//			System.out.println("Player One wins");
//		}
//		else if (winP1.size() < winP2.size()) {
//			System.out.println("Player 2 wins");
//		}
//		else {
//			System.out.println("It's a tie!");
//		}
	}

}
