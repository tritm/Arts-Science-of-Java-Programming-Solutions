package ChFive;
/*
 * File:GoldenRatio.java
 * ----------------------------------
 * This program demonstrate the value of the Golden Ratio.
 * ex: φ = 1 +√5
 *         ------
 *           2
 */

import acm.program.*;

public class GoldenRatio extends ConsoleProgram{
	
	public void run() {
		println("This program represents the Golden Ratio"
				+ "\n" + "φ = 1 + √5 / 2");
		
		/*We put "1 + Math.sqrt(5)" in curly brackets
		 * in order to make the precedence of the golden ratio work.
		 */
		double gr = (1 + Math.sqrt(5))/2;
		println("\n" + "The φ is ->" + gr);
	}

}
