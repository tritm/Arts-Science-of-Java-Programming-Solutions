/*File:ForTheWhileLoop.java
 * -----------------------------
 * This program will use a while loop in the place
 * of a for loop.
 * modified from: Arts and Science by Eric S Roberts code 
 * as asked by the same in the exercise.
 */

//imports
import acm.program.*;


public class ForTheWhileLoop extends ConsoleProgram{
	

	/* Specifies the value from which to start counting down */
	private static final int START = 10;
	
	
	/* Runs the program */
	public void run() {
		
		/*This wile loop is suppose to replicate the same 
		 * function as a for loop.
		 * for (initial ; test; steps){body}*/
		
		int t = START; //"initial" value.
		
		while (t >= 0) { //"test" value.
	
			println(t); //"body" statement of a for loop..
			t--; //the "steps" needed for the desired iteration.
		}
	
		println("Liftoff!");
	}
	

}
