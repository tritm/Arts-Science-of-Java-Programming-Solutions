/*
 * File:Quadratic.java
 * -------------------------------
 * This program calculates the Quadratic equation.
 * Also known as The Bhaskara Formula.
 */

package ChFive;

import acm.program.*;

public class Quadratic extends ConsoleProgram{
	
	public void run () {
		println("This program calculates the Quadratic equation.\n" 
				+ "\nax^2 + bx + cx = 0");
		double a = readDouble ("\nCan not be equal to zero a: ");
		double b = readDouble ("b: ");
		double c = readDouble ("c: ");
		
		/*The quadratic equation is: x  = –b ±√b^2 – 4ac
		 *							      ---------------
		 *									   2a
		 * step 1: calculate the value under the square root.
		 * step 2: calculate the value above the under score.
		 * step 3: divide the above value with the value below. 
		 */
		
		//calculates the value below the root and the root
		double calculateUnderRoot = Math.pow(b, 2) - (4 * a * c);
		double calculateRoot = Math.sqrt(calculateUnderRoot);
		
		//if value under the square is 0 show that it has no real solution.
		if (calculateRoot < 0) {
			println("\nThis equation has no real solultion, since the value under the root is negative.\n"
					+ "However the continuation of the calculus is demonstrated below.");
		}
		
		//calculates the rest of the values above the score
		double calculateAboveScorePlus = -b + calculateRoot;
		double calculateAboveScoreMinus = -b - calculateRoot;
		
		//calculate the value below the score.
		double calculateUnderScore = 2 * a;
		
		//finishes the calculation by dividing the upper value with the below value.
		double quadratic_plus = calculateAboveScorePlus/calculateUnderScore;
		double quadratic_minus = calculateAboveScoreMinus/calculateUnderScore;
		
					
		println("\nFirst solution is " + quadratic_plus);
		println("\nSecond solution is " + quadratic_minus);
	}
	
	
	
	
	
	
	
	
	
	
/*	
	//calculate the values under the root
	private void calculateUnderScore (double a) {
		double calculateUnderScore = 2 * a;
	}
	
	//calculate the positive result above the score
	private void positiveAboveScore(double b, double calculateRoot) {
		double positiveAboveScore = -b + calculateRoot;
	}
	
	//calculate the negative value above the score
	private void negativeAboveScore (double calculateRoot, double b) {
		double negativeAboveScore = -b - calculateRoot;
	}
	
	//calculate the root
	private void calculateRoot (double calculateUnderRoot) {
		double calculateRoot = Math.sqrt(calculateUnderRoot);
	}
	
	//Provides the answer under the root.
	private void calculateUnderRoot (double a, double b, double c) {
		double calculateUnderRoot = Math.pow(b, 2) - (4 * a * c);
	}
	
	//unused println's when I understand how to make this damn private thing work.
	double quadratic_plus = positiveAboveScore/calculateUnderScore;
	double quadratic_minus = negativeAboveScore/calculateUnderScore;
*/
}
