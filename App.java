package week06;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Instantiate Deck
		Deck deck = new Deck();
		
		// Instantiate 2 players
		Player p1 = new Player("Player 1");
		Player p2 = new Player("Player 2");
		
		// Shuffle deck
		deck.shuffle();
		
		// Go through the deck and evenly distribute the cards 
		// between both players
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0)
				p1.draw(deck);
			else
				p2.draw(deck);
		}
		
		// Flip through each deck and see who wins
		for (int i = 0; i < 26; i++) {
			// Simulates gameplay by flipping and showing the cards that were
			// flipped
			System.out.println("------------------------------------------");
			Card temp1 = p1.flip();
			temp1.describe();
			
			Card temp2 = p2.flip();
			temp2.describe();

			
			// Checks to see which player won
			if (temp1.getValue() > temp2.getValue()) {
				p1.incrementScore();
				System.out.println("Player 1 gets a point!");
			} else if (temp2.getValue() > temp1.getValue()) {
				p2.incrementScore();
				System.out.println("Player 2 gets a point!");
			} else {
				System.out.println("Draw! No point awarded.");
			}

			System.out.println("------------------------------------------\n");
		}
		
		// Displays how many points each player has 
		p1.describe();
		p2.describe();
		
		// Displays which player has won
		if(p1.getScore() > p2.getScore()) {
			System.out.println("Player 1 wins!");
		} else if (p2.getScore() > p1.getScore()) {
			System.out.println("Player 2 wins!");
		} else {
			System.out.println("Draw");
		}
		
	}

}
