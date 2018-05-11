/*File:FarenheitToCelsius.java
 * -------------------------------
 * This program converts Farenheit
 * to Celsius 
 */

//import Stanford Library
import acm.program.*;

public class FarenheitToCelsius extends DialogProgram {
	public void run () {
		println ("This program converst Farenheit to Celsius");
		int Farenheit = readInt ("Place your Farenheit degree: ");
		int Farenheit_To_Celsius = Farenheit - ICE_CELSIUS;
		double Celsius = Farenheit_To_Celsius/1.8;
		println ("The temperature in Celsius is " + Celsius);
	}
private static final int ICE_CELSIUS = 32;
}
