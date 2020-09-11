
import java.util.*;

public class Deck {
	
	public final int NUM_SUITS = 4;
	
	// 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King, Ace
	public final int NUM_RANKS = 14;
	public final int START_RANK = 2;
	
	private List<Card> deck;
	
	public Deck()
	{
		deck = new ArrayList<Card>(NUM_SUITS * NUM_RANKS);
		
		for (int i = 0; i < NUM_SUITS; i++)
		{
			for (int j = START_RANK; j <= NUM_RANKS; j++)
			{
				deck.add(new Card(i, j));
			}
		}
	}
	
	public String toString()
	{
		String result = "Deck:" + "\n";
		
		for (Card card : deck) 
		{ 
			result += card.toString() + "\n";
		}
		
		return result;
	}
	
	public Card GetCard()
	{
		// TODO: using random number generator to get the index
		return (deck.remove(0));
	}

}
