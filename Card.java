

public class Card {

	private final int CLUBS = 0;
	private final int HEARTS = 1;
	private final int SPADES = 2;
	private final int DIAMONDS = 3;
	
	private final int JACK = 11;
	private final int QUEEN = 12;
	private final int KING = 13;
	private final int ACE = 14;
	
	private int suit;
	private int rank;
	private int value;
	
	public Card(int suit, int rank)
	{
		this.suit = suit;
		this.rank = rank;
		
		if ((rank == JACK) ||
			(rank == QUEEN) ||
			(rank == KING) ||
			(rank == ACE))
		{
			this.value = 10;
		}
		else
		{
			this.value = rank;
		}
	}
	
	public String toString()
	{
		String result;
		
		switch (rank)
		{
		case JACK:
			result = "Jack ";
			break;
		case QUEEN:
			result = "Queen ";
			break;
		case KING:
			result = "King ";
			break;
		case ACE:
			result = "Ace ";
			break;
		default:
			result = rank + " ";
		}
		
		switch (suit)
		{
		case CLUBS:
			result += "of clubs";
			break;
		case HEARTS:
			result += "of hearts";
			break;
		case SPADES:
			result += "of spades";
			break;
		case DIAMONDS:
			result += "of diamonds";
			break;
		}
		
		return result + " (value: " + value + ")";
	}
	
}
