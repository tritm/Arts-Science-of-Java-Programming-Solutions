/*File:KilogramsToPoundAndOunces.java
 * ----------------------------------------
 * This program converts Kilograms to Pounds
 * and Ounces 
 */

//import Stanford Library
import acm.program.*;

public class KilogramsToPoundsAndOunces extends ConsoleProgram{
	public void run () {
		println ("This program converts Kilograms into Pounds and Ounces.");
		int Kilogram = readInt ("Place your Kilograms: ");
		double Pounds = Kilogram * KILOGRAMS_TO_POUNDS; //Transform Kilograms into Pounds
		double Ounces = Pounds * POUNDS_TO_OUNCES; //Transform Kilograms into Ounces
		println("The total of Pounds is " + Pounds + ". And the total of Ounces is " + Ounces);
	}
private static final double KILOGRAMS_TO_POUNDS = 2.2;
private static final int POUNDS_TO_OUNCES = 16; 
}
