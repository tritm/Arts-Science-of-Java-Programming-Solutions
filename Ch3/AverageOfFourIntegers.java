/*File:AverageOfFourIntegers
 *-----------------------------------
 *This program calculate average of 4 input integer.
 */

//imports

import acm.program.ConsoleProgram;

public class AverageOfFourIntegers extends ConsoleProgram {
	public void run () {
		println("This program calculates average of four integers");
		int[] intArray = new int[4];
		for (int i = 0; i < 4; i++) {
			intArray[i]  = readInt ("What is the integer " + i + ": ");
		}
		double avg = average(intArray);
		println("The average of 4 Integer number is " + avg);
	}
	private double average(int[] intArray){
		int total = 0;
		for (int i = 0; i < intArray.length; i++) {
			total += intArray[i];
		}
		double avg = total/4.0;
		return avg;
	}
}
