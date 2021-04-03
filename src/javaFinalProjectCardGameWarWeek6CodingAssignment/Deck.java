package javaFinalProjectCardGameWarWeek6CodingAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Part 1b. Created a Class named Deck

public class Deck {

	//Fields:
	
	
	List<Card> cards = new ArrayList<Card>();// This Creates a List of cards
	
	private static final String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"}; // This creates the SUITS of the cards using an array 
	private static final String[] CARDNAME = {"2","3","4","5","6","7","8","9","10", "Jack","Queen","King","Ace"}; // this is the CARDNAMES of the cards in the array
	
	//Constructor
	public Deck() {
		for(String s : SUITS) { // This instantiates a new deck and populates the cards
			for(int i =2; i< CARDNAME.length + 2; i++) {
				String name = CARDNAME[i-2] + " of " + s;
				int cv = i;
	         Card c = new Card(name,i);
	         cards.add(c);
			}
		}
		
	}
	
	//Methods:
	
	public void shuffle() { // This Method is the shuffling method
		Collections.shuffle(cards);
	}
	
	public Card draw() {  // This Method Draws the cards which Removes and returns the top card of the Cards Field
		return cards.remove(0);
		
	}
	
	
	
	
	
	
	
	
	
	
}
