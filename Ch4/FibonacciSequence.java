/*File: FibonacciSequence.java
 * --------------------------------
 * This program will print a Fibonacci's Sequence
 * starting from F0 - F15.
 * modified from:beginnersbook.com
 */

//imports
import acm.program.*;


public class FibonacciSequence extends ConsoleProgram{
	

	//The SENTINEL to stop when desired by the programmer.
	private static final int SENTINEL = 16;
	
	
	public void run () {
		
	
		println("This program will demonstrate the first " + SENTINEL + " numbers"
				+ " (starting from 0 [F0 - F15]) to 610) of a Fibonacci Sequence");
		
		
		int start = 0; //Start of the Fibonacci Sequence. 
		int sequence = 1; //Continuation of the latter.
		
		
		for (int i = 1; i <= SENTINEL; i++) {
			
		
			println("-> " + start + ""); //This way println starts with 0 and the F.S continues after value is looped.
			
			
			int addValuesAbove = start + sequence; // adds the subsequent values.
			start = sequence; // than equalizes with the previous values.
			sequence = addValuesAbove; //generates the Fibonacci Sequence with the loop.
			
		}
		
	}
}
