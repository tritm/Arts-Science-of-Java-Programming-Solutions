import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Implement a class name Card:
 *	1. Named constant for four suits: CLUBS, DIAMONDS, HEARTS, SPADES
 *  2. Named constant for four ranks: ACE: 1, JACK: 11, QUEEN: 12, KING:13
 *  3. Card(rank, suit) = constructor(rank, suit)
 *  4. getRank retrieves the Card's rank component
 *  5. getSuit retrieves the Card's suit component
 *  6. toString returns the complete name of the Card
 */
public class Card{
	public Card(int rank, int suit){
		cardRank = rank;
		cardSuit = suit;
	}
	public int getRank(){
		return this.cardRank;
	}
	public int getSuit(){
		return this.cardSuit;
	}
	public String toString() {
		String cardName;
		if (this.getRank() == 1) {
			cardName = "This card has (rank, suit) = (" + rankList[cardRank - 1] + "," + suitList[cardSuit - 1] + ")";
		}
		else {
			cardName = "This card has (rank, suit) = (" + rankList[cardRank - 10] + "," + suitList[cardSuit - 1] + ")";
		}
		return cardName;
	}

	private int cardRank;
	private int cardSuit;
	//List of ranks
	public static final int ACE = 1;
	public static final int JACK = 11;
	public static final int QUEEN = 12;
	public static final int KING = 13;
	// List of suits
	public static final int CLUB = 1;
	public static final int DIAMONDS = 2;
	public static final int HEART = 3;
	public static final int SPADES = 4;
	// List of rank name and suit name
	public static String[] rankList = {"ACE", "JACK", "QUEEN", "KING"};
	public static String[] suitList = {"CLUB", "DIAMONDS", "HEARTS", "SPADES"};
}