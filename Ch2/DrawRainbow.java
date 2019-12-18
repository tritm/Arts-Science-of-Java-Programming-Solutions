/*File: DrawSnowMan.java
 *This file contains the drawing of a Snowman
 *in Java using acm graphics and program imports.
 *This is an exercise proposed by Eric S Roberts
 *According to his book Arts and Science of Java
 *in page 37.
 */

//imports

import acm.graphics.GLabel;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class DrawRainbow extends GraphicsProgram {
	public void run () {
		add(new GOval(-375, 50, 1500, 1500)); //  strip 0
		add(new GOval(-325, 100, 1400, 1400)); // strip 1
		add(new GOval(-275, 150, 1300, 1300)); // strip 2
		add(new GOval(-225, 200, 1200, 1200)); // strip 3
		add(new GOval(-175, 250, 1100, 1100)); // strip 4
		add(new GOval(-125, 300, 1000, 1000)); // strip 5
		add(new GOval(-75, 350, 900, 900)); //first arc
	}
}
