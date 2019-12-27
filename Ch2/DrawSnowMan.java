/*File: DrawSnowMan.java
 *This file contains the drawing of a Snowman
 *in Java using acm graphics and program imports.
 *This is an exercise proposed by Eric S Roberts
 *According to his book Arts and Science of Java
 *in page 37.
 */

//imports
import acm.graphics.*;
import acm.program.*;

public class DrawSnowMan extends GraphicsProgram {
	public void run () {
		
		//head
		
		add(new GOval(120, 20, 40, 40)); //head
		add(new GOval(127, 30, 9, 9));   //left eye
		add(new GOval(143, 30, 9, 9));   //right eye
		add(new GLabel("v", 138, 47));	 //Nose
		add(new GOval(136.5, 47, 8, 8)); //mouth
		
		//body 1
		
		add(new GOval(102, 60, 77, 77)); //body
		add(new GRect (137, 70, 9, 9));  //upper square
		add(new GRect (137, 92, 9, 9));  //middle square
		add(new GRect (137, 119, 9, 9));  //bottom square
		
		//body 2
		
		add(new GOval(87, 139, 110, 110 ));
		System.out.println();
	}
}
