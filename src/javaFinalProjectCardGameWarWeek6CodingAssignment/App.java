package javaFinalProjectCardGameWarWeek6CodingAssignment;


// This is part 2 created a new class named App with a main method
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// This is part 3 of the Assignment	
		Deck deck = new Deck(); // Instantiated a deck and 2 players
		Player player1 = new Player();
		Player player2 = new Player();
		
		deck.shuffle(); // this called the shuffle method
		
		// This is part 4 of the Assignment
		
		for(int i = 0; i < 52; i++) { // This uses a traditional for loop to to iterate through the deck
			if (i % 2 == 0) {
				player1.draw(deck); // this helps compare each cards to each players deck
			}else {
				player2.draw(deck);
			}
		}
		
	// This is part 5 of the Assignment
		for(int i = 0; i < 26 ; i++) {  // This iterates 26 times and calls the flip method for each player
			Card player1Cards = player1.flip(); // this calls the flip method for player 1
			Card player2Cards = player2.flip();// this calls the flip method for player 2 
			
			if (player1Cards.getValue() > player2Cards.getValue()) { // this calls the increment method on the player that has the higher score
				player1.incrementScore();
				
			} if (player1Cards.getValue() < player2Cards.getValue()) {
				player2.incrementScore();
			}
		}
	
		
		// This is part 6 of the Assignment to compare each score for each player
	System.out.println("Player's 1 Score is : " + player1.getScore());
	System.out.println("Player's 2 Score is : " + player2.getScore());
		
	
	// This is part 7 of the Assignment This will print out who has Won or if it is a Draw
		if(player1.getScore() > player2.getScore()) {
			System.out.println("Player 1 has Won this War Game of Cards!!!"); 
		
		}if(player1.getScore() < player2.getScore()) {
			System.out.println("Player 2 has Won this War Game of Cards!!!");
					
		}else {
			System.out.println("It is a Draw Nobody Wins in War!!!");
		}
		
		
		
		
	}

}
