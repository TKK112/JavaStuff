
import java.util.List;

public class Blackjack 
{	
	List<Card> playersCards;
	List<Card> houseCards;
	List<Deck> deckList;
	
	
	public static void main(String[] args) 
	{
		// "How many decks do you want to use?"
		//deckList = new ArrayList<Deck>(numDecks);
		
		// "How many players?"
		
		Deck myDeck = new Deck();		
		
		System.out.println("Deck start: " + myDeck.toString());
		
		// TODO: sort the deck after creation
		
		// TODO: prompt user if they want to play -> enter game loop
		
		// TODO: update hit logic -> remove Card from deck, add Card to playersCards or houseCards
		//			and check the sum of their cards;
		
		
		// testing out card removal
		Card pulledCard = myDeck.GetCard();
		System.out.println("You have pulled: " + pulledCard.toString());
		
		System.out.println("Deck start: " + myDeck.toString());
	}
}
