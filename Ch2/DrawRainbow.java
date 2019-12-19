
import acm.graphics.*;
import acm.program.GraphicsProgram;
import java.awt.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Draw a colorful rainbow on a window. This class inheritance
 * the class GraphicsProgram to draw on window. This class can
 * run as standalone by edit configuration/ main class: DrawRainbow
 * or used by other class.
 * Index of list is from 0 to 6, index of
 * Color.red is cls[0], use [] but not () to get an object from list
 * Log configuration: /Users/tritm/Documents/Codes/ArtScienceofJava/Arts-Science-of-Java-Programming-Solutions/Resources/simplelogger.properties
 * we can config for it to show levels: Debug > Info > Warn > Error
 */
public class DrawRainbow extends GraphicsProgram {
    public void run() {
        Logger log = LoggerFactory.getLogger(getClass());
        GOval[] strips = new GOval[7];
        log.info("strip.lenth = {} ", strips.length);
        assert strips.length == 7 : "Wrong length";
        Color[] cls    = new Color[]{Color.red, Color.orange, Color.yellow, Color.green, Color.blue, Color.magenta, Color.cyan};
        this.setBackground(Color.cyan);
        for (int i = 0; i < 7; i++) {
            strips[i] = new GOval((i*50 - 325), ((i+1)*50), (1400 - i*100), (1400 - i*100));
            log.debug("i = {} \t x = {} \t y = {} \t width = {} \t height = {} \t color = {} ", i,(i*50 - 325), ((i+1)*50), (1400 - i*100), (1400 - i*100), cls[i]);
            strips[i].setFillColor(cls[i]);
            strips[i].setFilled(true);
            add(strips[i]);
        }
    }
}
