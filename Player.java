package week06;

import java.util.ArrayList;

public class Player {
	private ArrayList<Card> hand;
	private int score;
	private String name;
	
	/**
	 * Initializes Player with a name passed in
	 * @param name
	 */
	public Player(String name) {
		hand = new ArrayList<Card>();
		
		score = 0;
		this.name = name;
	}
	
	/**
	 * Returns the score of the player
	 * @return	Number of points the player has received
	 */
	public int getScore() {
		return score;
	}	
	
	/**
	 * Prints out the name of the player and the score they have
	 */
	public void describe() {
		System.out.println(name + ": " + score);
	}
	
	/**
	 * Player flips the last card on their deck
	 * @return	Last card that was flipped
	 */
	public Card flip() {
		return hand.remove(hand.size() - 1);
	}
	
	/**
	 * Player draws a card from the deck and adds it to their hand
	 * @param deck
	 */
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	/**
	 * Increments the score counter when the player wins
	 */
	public void incrementScore() {
		score++;
	}
}
