/*File:OppositeToStIves.java
 * --------------------------------------
 * This program finds out how many people
 * were going the opposite direction to 
 * St. Ives. 
 */

//import Stanford Library
import acm.program.*;

public class OppositeToStIves extends DialogProgram {
	public void run () {
		println ("I was going to St. Ives and I want to know.\n"+
				"What is the total number of people, animals and things going the opposite direction?");
		
		println ("As I was going to St. Ives,\n" + 
				"I met a man with seven wives,\n" + 
				"Each wife had seven sacks,\n" + 
				"Each sack had seven cats,\n" + 
				"Each cat had seven kits:\n" + 
				"Kits, cats, sacks, and wives,\n" + 
				"How many were going to St. Ives?\n");
		
		//people 8 + sacks 49 +  cats 343 + kittens 2401
		
		int people = readInt ("How many people were not going to St. Ives? ");
		int sack = readInt ("How many sacks in total were all wives caring? ");
		int cats = readInt ("How many cats were in all sacks? ");
		int kits = readInt ("How many kits had all the cats? ");
		int sumofallthings = people + sack + cats + kits;
		
		println("Sum of all things " + sumofallthings + ".");
		
		if (sumofallthings == EVERYTHING) { // check if the calculation is correct.
			
			println("You got it right");
			
		}else {
		
		println("Sorry. Incorrect number. Try to sum everything!\n" + 
		
		"(Hint) Pay attention to the man in case you forgot him.");
		}
		
		
	}
private static final int EVERYTHING = 2801;  
}
