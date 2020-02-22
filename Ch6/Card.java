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
	private int cardRank;
	private int cardSuit;

}