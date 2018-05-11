/*File:DivisableBySixOrSevenHundred.java
 * ----------------------------------------------
 * This program displays all the numbers divisible
 * by six and seven from a list between 1 and 100.
 */

//imports
import acm.program.*;

public class DivisableBySixOrSevenHundred extends ConsoleProgram {
	
	public void run () {
		
		println("This program checks if a list of numbers from 1 to 100 are"
				+ " divisible by 6 and/or 7");
		
		//This makes the loop work between the numbers 1 and 100.
		for (int i = 1; i <= 100; i++) {
			
			//Boollean to check if a number is divisible by 6 or 7;
			boolean isDivisibleBySix = (i % 6 == 0);
			boolean isDivisibleBySeven = (i % 7 == 0);
			
			//checks if whenever a number is divisible by either 6 or 7 to print.
			if (isDivisibleBySix || isDivisibleBySeven) {
				println(i);
			}	
		}
		
	}
}