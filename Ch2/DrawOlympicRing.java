import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;

/**
 * Draw a five interlocking rings (blue, yellow, black, green, red ) of Olympic symbol
 */
public class DrawOlympicRing extends GraphicsProgram {
    public void run() {
        Logger log = LoggerFactory.getLogger(getClass());
        GOval[] r = new GOval[5];
        Color[] cls    = new Color[]{Color.blue, Color.yellow, Color.black, Color.green, Color.red};
        for (int i = 0; i < 5; i++) {
            r[i] = new GOval((150 + i*55), (i%2==0?50:120), 100, 100);
            log.debug("i = {} \t x = {} \t y = {} \t width = {} \t height = {} \t color = {} ", i,(150+i*55), (i%2==0?50:120), (100), (100), cls[i]);
            r[i].setColor(cls[i]);
            add(r[i]);
        }
    }
}
    