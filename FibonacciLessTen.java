/*File: FibonacciSequence.java
 * --------------------------------
 * This program will print a Fibonacci's Sequence
 * below 10,000.
 * modified from:beginnersbook.com
 */

//imports
import acm.program.*;


public class FibonacciLessTen extends ConsoleProgram{
	

	//The SENTINEL to stop when desired.
	private static final int SENTINEL = 10000;
	
	
	public void run () {
		
	
		println("This program will demonstrate the numbers from the Fibonacci"
				+ " Sequence below 10,000");
		
		int start = 0;
		int sequence = 1;
				
		
		/*This tests whatever value necessary to tell the Fibonacci Sequence to continue.
		 * It was necessary to use a while loop instead of a for loop.*/
		int i = 1;
		while (start < SENTINEL) {
			
		
			println("-> " + start + ""); //This way println starts with 0 and the F.S continues after value is looped.
						
			
			int addValuesAbove = start + sequence;// adds the subsequent values.
			start = sequence; // than equalizes with the previous values.
			sequence = addValuesAbove; //generates the Fibonacci Sequence with the loop.
			
			i++;
		}
		
	}
}




