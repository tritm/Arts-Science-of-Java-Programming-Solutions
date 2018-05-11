/*File:AvarageList.java
 * ------------------------------
 * This program calculates the avarage of students scores.
 * This is also a practice to use the break - into a while loop.
 */

//imports
import acm.program.*;


public class AvarageList extends ConsoleProgram{
	
	/*A Sentinel to make the while loop value 
	 * stop in case of a negative number
	 */
	private static final int SENTINEL = -1;
	
	public void run() {
		println("This program adds the avarage of grades.");
		println("Enter values, one per line, using " + SENTINEL);
		println("to signal the end of the list.");
		int total = 0;
		int value = readInt(" grade: ");
			while (value != SENTINEL) {
				total += value;
				value = readInt(" grade: ");
			}
		println("The total is " + total + ".");
	}	
}


