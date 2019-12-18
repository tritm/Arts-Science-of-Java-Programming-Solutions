
import acm.graphics.*;
import acm.program.GraphicsProgram;
import java.awt.*;

/**
 * Draw a colorful rainbow on a window. This class inheritance
 * the class GraphicsProgram to draw on window. This class can
 * run as standalone by edit configuration/ main class: DrawRainbow
 * or used by other class
 */
public class DrawRainbow extends GraphicsProgram {
    public void run() {
//		index of list is from 0 to 6, index of Color.red is cls[0], use [] but not () to get an object from list
        GOval[] strips = new GOval[7];
        Color[] cls    = new Color[]{Color.red, Color.orange, Color.yellow, Color.green, Color.blue, Color.magenta, Color.cyan};
        this.setBackground(Color.cyan);
        for (int i = 0; i < 7; i++) {
            strips[i] = new GOval((i*50 - 325), ((i+1)*50), (1400 - i*100), (1400 - i*100));
            strips[i].setFillColor(cls[i]);
            strips[i].setFilled(true);
            add(strips[i]);
        }
    }
}
