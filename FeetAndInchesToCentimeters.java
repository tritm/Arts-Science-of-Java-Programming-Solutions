/*File:FeetAndInchestoCentimeters.java
 * ------------------------------------
 * This program transforms feet and inches
 * to centimeters. 
 */

//imports
import acm.program.*;

public class FeetAndInchesToCentimeters extends DialogProgram {
	public void run () {
		println("This program transforms feet and inches to centimenters.");
		int ft = readInt ("Enter the value of feet: ");
		int inches = readInt ("Enter the value of inches: ");
		double FeetToInches = ft*INCHES_PER_FOOT; //transforms Feet to Inches
		double TotalInches = inches + FeetToInches; // Add transformed Feet into Inches and add to the Inches
		double FeetInchesToCentimeter = TotalInches*CENTIMETERS_PER_INCH; // Transform the total of Inches to Centimeters
		println("The total of centimenters is: " + FeetInchesToCentimeter);
		
	}
private static final int INCHES_PER_FOOT = 12;
private static final double CENTIMETERS_PER_INCH = 2.54;
}
