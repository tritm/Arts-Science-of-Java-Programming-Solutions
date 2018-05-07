/*File:CircleRadiusCalculator
 *-----------------------------------
 *This program calculate the Area
 *of a given radius of a circle.
 */

//imports
import acm.program.*;

public class CircleRadiusCalculator extends ConsoleProgram {
	public void run () {
		println("This program calculates the Area of a circle. Given the radius of it.");
		int radius = readInt ("What is the radius of the Circle: ");
		double circle_area = PI * (radius*radius);
		println("The area of the circle is: " + circle_area);
	}
private static final double PI = 3.1415926535;
}
