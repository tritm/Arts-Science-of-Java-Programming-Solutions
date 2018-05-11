/*Fil: CalculatingOddIntegers.java
 * ---------------------------------------
 * This program gets a number from the client
 * and throw back the relative odd numbers pertained
 * to to it. After that it calculates the total of those
 * odd numbers. 
 */

//imports
import acm.program.*;


public class CalculatingOddIntegers extends ConsoleProgram {
	
	// This is the initial value in the for loop
	private static final int ODD = 1;
	
	public void run () {
		
		println("This program gets any number and displays the sum of odd integers");
		int N = readInt ("Give me a number;)  "); //the ;) inside the parens is to look as if someone is blinking. XD
		
		/*Though for this program these "test" and "result" values may 
		 * seem unnecessary but for pedagogical purposes I put it here. 
		 * So it can be clear these are values that could be repeated 
		 * throughout an entire program*/
		int test = N*2;
		int result = N*N;
		
		for (int i = ODD; i <= test; i+=2) {
			println(i);
		}
		
		println("Adding these numbers you have " + result);
		
	}

}
