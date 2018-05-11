/*File:SnowMan.java
 * --------------------------
 * The intent of this project is to build
 * a drawing based on algorithms that
 * resembles a snowman 
 */
  
// imports
import acm.graphics.*;
import acm.program.*;
import java.awt.*;


public class SnowMan extends GraphicsProgram  {
	public void run() {
		GRect rect = new GRect(100, 50, 125, 60);
		rect.setFilled(true);
		rect.setColor(Color.RED);
		add(rect);
		GOval oval = new GOval(100, 50, 125, 60);
		oval.setFilled(true);
		oval.setColor(Color.GREEN);
		add(oval);
	}
}

//output not as expected lol XD
