/*File:AddThreeInteger.java*
 This file will add a third integer according to the
 exercise propose by Eric S Roberts in the book
 Arts and Science of Java Adding a third integer
 on the code proposed on image 2.2.
 */


//imports
import acm.program.*;

/*Pre-condition: This program adds only 2 integers
 * 
 *Post-Condition: This program adds now 3 integers
 * according to the proposed exercise, as mentioned
 * above, and the first print line was changed to 
 * "This program adds three integers".
 */


public class AddThreeInteger extends ConsoleProgram {
	public void run() {
		println("This program adds three integers.");
		int n1 = readInt("Enter number 1: ");
		int n2 = readInt("Enter number 2: ");
		int n3 = readInt("Enter number 3 ");
		int total = n1 + n2 + n3;
		println("The total is " + total + ".");
	}
}
