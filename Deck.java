package week06;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	private ArrayList<Card> cards;
	
	/**
	 * Initializes deck and the cards are populated 
	 */
	public Deck() {
		cards = new ArrayList<Card>();
		
		// Iterate through each suite
		for (int i = 0; i < 4; i++) {
			// Initialize every card per each suite
			for (int j = 2; j <=14; j++) {
				if (i == 0) {
					cards.add(new Card(j, "Spades"));
				} else if (i == 1) {
					cards.add(new Card(j, "Clubs"));
				} else if (i == 2) {
					cards.add(new Card(j, "Diamonds"));
				} else {
					cards.add(new Card(j, "Hearts"));
				}
			}
		}
	}
	
	/**
	 * Shuffles the deck of cards
	 */
	public void shuffle() {
		// Collections.shuffle(cards);
		
		// Knuth's algorithm for shuffling an array: 
		for (int i = cards.size() - 1; i > 1; i--) {
			// let j = random number from 0 to i inclusive
			int j = (int) Math.floor(Math.random() * i);
			
			// swap array[j] with array[i]
			Card temp = cards.get(j);
			cards.set(j, cards.get(i));
			cards.set(i, temp);
		}
	}
	
	/**
	 * Returns the top of the card
	 * @return	Card at the top of the deck
	 */
	public Card draw() {
		return cards.remove(cards.size() - 1);
	}
}
