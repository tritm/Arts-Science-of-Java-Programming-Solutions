/*File: FibonacciSequence.java
 * --------------------------------
 * This program will print a Fibonacci's Sequence
 * starting from the users desired number.
 * modified from:beginnersbook.com
 */

//imports
import acm.program.*;


public class GetFibonacciNumber extends ConsoleProgram {
	
	
	public void run () {
		
		
		//Allows the user to choose how many numbers of the Fibonacci Sequence S/he wants.
		int repetition = readInt ("Tel me the desired sequence you "
				+ "wish to know from the Fibonacci Sequence: ");
		
		
		int start = 0; //Start of the Fibonacci Sequence.
		int sequence = 1; //Continuation of the latter.
		
		
		for (int i = 0; i < repetition; i++) {
			
		
			println("-> " + start + ""); //This way println starts with 0 and the F.S continues after value is looped.
			
			
			int addValuesAbove = start + sequence; // adds the subsequent values.
			start = sequence; // than equalizes with the previous values.
			sequence = addValuesAbove; //generates the Fibonacci Sequence with the loop.
			
		}
		
	}
}
