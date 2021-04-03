package javaFinalProjectCardGameWarWeek6CodingAssignment;

import java.util.ArrayList;
import java.util.List;


//Part 1c. Created a Class named Player
public class Player {

	//Fields
	private List<Card> hand = new ArrayList<Card>();  // This created a List of cards in a Array
	
	private int score; // this creates field of integer value named score
	private String name;// this is creating a field named name
	
	
	
	//Constructor for Player Class
	public Player() {
		setScore(0);// this sets the score to 0 inside the constructor
		
	}
	//Methods
	public void describe() {  // This prints out information about the player and calls the describe method for each card in the Hand List
		System.out.println("The player has the following cards : " + name);
		for(Card card : hand) {
			card.describe();
		}
	}
	
	public Card flip() {   //This method removes and returns the top card of the Hand
		return hand.remove(0);
	}
	
	public void draw(Deck deck) {// This method takes a deck as an argument and calls the draw method on the deck adding the returning card to the hand field
		hand.add(deck.draw());
	}
	public void incrementScore() {  // This adds 1 to the players score 
		setScore(getScore() + 1);
	}
	public int getScore() { // this is the Getter
		return score;
	}
	public void setScore(int score) { // this is the Setter
		this.score = score;
	}
	
	
}
