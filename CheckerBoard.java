/*File:CheckerBoard.java
 * ------------------------------
 * This program is supposed to show a
 * Checkerboard with the height of eight squares,
 * and width of eight squares as well.
 */


//imports
import acm.graphics.*;
import acm.program.*;



public class CheckerBoard extends GraphicsProgram {
	
	private static final int SQUARES = 40; //Pixels of the squares
	
	private static final int CIRCLES = 35; //Pixels of the circles
	
	public void run () {
		
		//number of rows and columns
		int rows = 8;
		int columns = 8;

		
		for (int i = 1; i <= rows; i++){ //creates the rows
			
			for (int j = 1; j <= columns; j++) { //and for each row a column
				
				//it creates the squares according to the loop
				GRect squares = new GRect((SQUARES * i), (SQUARES * j), SQUARES, SQUARES);
				add(squares);
				
				//it creates the circles positioning to the squares
				if ((i % 2 + 1) == (j % 2) || (i % 2) == (j % 2 + 1)) {
					
					GOval pieces = new GOval((SQUARES * i + 1), (SQUARES * j), CIRCLES, CIRCLES);
					add(pieces);}
				}
			}
		}
	}