package week06;

public class Card {
	private int value;
	private String name;
	
	/**
	 * Initializes the card object with the values 
	 * passed
	 * @param value		Number of the card
	 * @param name		Suit of the card
	 */
	public Card(int value, String name) {
		this.value = value;
		this.name = name;
	}
	
	/**
	 * Returns the value of the card
	 * @return	value
	 */
	public int getValue() {
		return value;
	}
	
	/**
	 * Returns the name of the card
	 * @return	name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Determines the value of the card and concatenates it with with the suite
	 * and prints it to the console
	 */
	public void describe() {
		// Holds the value of the card
		String description = "";
		
		// Checks to see if the card is a number between 2 and 10,
		// If the value is greater, then we determine if it is a Jack,
		// Queen, King or Ace
		if (value <= 10) {
			description += value;
		} else {
			if (value == 11)
				description += "Jack";
			else if (value == 12)
				description += "Queen";
			else if (value == 13)
				description += "King";
			else 
				description += "Ace";
		}
		
		// Prints out the value of the card and the suit
		System.out.println(description + " of " + name);
			
	}
}
