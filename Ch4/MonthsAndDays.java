/*File: MonthsAndDays.java
 * ---------------------------
 * This file is a calendar of months and days.Pertaining 5 weeks.
 */

//import
import acm.graphics.*;
import acm.program.*;


public class MonthsAndDays extends GraphicsProgram {

	private final static int SQUARE_WIDTH = 40;
	private final static int SQUARE_HEIGHT = 40;
	public final static int SQUARES_CALENDAR = 30;

	public void run() {
		int verticals = 7;
		int horitzontals = 5;
		int start = 1;

		for (int i = 0; i < horitzontals; i++) {
			for (int j = 0; j < verticals; j++) {

				GRect square = new GRect((SQUARE_WIDTH * j), SQUARE_HEIGHT * i, SQUARE_WIDTH, SQUARE_HEIGHT);
				add(square);
				GLabel day = new GLabel(("" + start), SQUARE_WIDTH * j + 10, SQUARE_HEIGHT * i + 10);
				if (start <= SQUARES_CALENDAR) {
					add(day);
					start++;
				}
			}
		}
	}
}