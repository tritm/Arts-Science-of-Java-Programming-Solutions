
/*File: DrawSnowMan.java
 *This file contains the drawing of a Snowman
 *in Java using acm graphics and program imports.
 *This is an exercise proposed by Eric S Roberts
 *According to his book Arts and Science of Java
 *in page 37.
 */

//imports

import acm.graphics.*;
import acm.program.GraphicsProgram;
import java.awt.*;

public class DrawRainbow extends GraphicsProgram {
	public void run () {
		this.setBackground(Color.cyan);

		GOval strip1 = new GOval(-325, 50, 1400, 1400); //strip 1
		strip1.setFillColor(Color.red);
		strip1.setFilled(true);
		add(strip1);

		GOval strip2 = new GOval(-275, 100, 1300, 1300); // strip 2
		strip2.setFillColor(Color.orange);
		strip2.setFilled(true);
		add(strip2);

		GOval strip3 = new GOval(-225, 150, 1200, 1200); // strip 3
		strip3.setFillColor(Color.yellow);
		strip3.setFilled(true);
		add(strip3);

		GOval strip4 = new GOval(-175, 200, 1100, 1100); // strip 4
		strip4.setFillColor(Color.green);
		strip4.setFilled(true);
		add(strip4);

		GOval strip5 = new GOval(-125, 250, 1000, 1000); // strip 5
		strip5.setFillColor(Color.blue);
		strip5.setFilled(true);
		add(strip5);

		GOval strip6 = new GOval(-75, 300, 900, 900); //first arc
		strip6.setFillColor(Color.magenta);
		strip6.setFilled(true);
		add(strip6);

		GOval strip7 = new GOval(-25, 350, 800, 800); //first arc
		strip7.setFillColor(Color.cyan);
		strip7.setFilled(true);
		add(strip7);
	}
}
