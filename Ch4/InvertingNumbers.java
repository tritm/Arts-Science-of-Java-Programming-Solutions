/* File: DigitSum.java
 * --------------------------
 * This program inverts the numbers of a positive integer.
 * The program depends on the fact that the last digit of
 * a integer n is given by n % 10 and the number consisting
 * of all but the last digit is given by the expression n / 10.
 */

//imports
import acm.program.*;


public class InvertingNumbers extends ConsoleProgram {


	public void run() {

	
		println("This program inverts the digits in an integer.");
		int n = readInt("Enter a positive integer: ");
		
		
		/*If you are following the book, you'll see you are
		 * going to need that extra lastd value to make the
		 * inversion of integers work */
		
		int inverting = 0;
		int lastd = 0;
		
		while (n > 0) {
			
			//use of remainder to extract the last number
			lastd = n % 10;
			
			//the calculation that inverts the numbers
			inverting = inverting * 10 + lastd;
			n /= 10;
		}
		
		
		/*The process above will make the "inverting" value
		 * come out with the n inverted*/
		
		println("The sum of the digits is " + inverting);
	}
}

