/*File:BeersOnTheWallSong.java
 * ---------------------------------------
 * This file generates the next part of the 
 * popular song till zero Bottle is reached.
 */

//imports
import acm.program.*;


public class BeersOnTheWallSong extends ConsoleProgram {

	public void run () {
	
		println("This program will post the lyrics of Bottles on the "
				+ "Wall till it reaches zero");
		
		int n = readInt ("Place the number you wish to start: ");
		
		
		for (int i = n ; i > 0; i--) {
				
			println(i +" bottles of beer on the Wall, " + i + " bottles of beer"
			+ " on the wall. You take one down, pass it around. ");
		
			
			/* It was necessary to make minus i, so the song would continue
			 * in a proper way. That means that in the middle of the lyrics
			 * i will be subtracted and keep the idea of the song intacted
			 * by the code, and yet chosen by the cliet.*/
			
			println( i-1 + " bottles of beer on the wall.");
			
		}
	
		println("There are no more beers to throw! You drunk! LOL.");
	
	}
}