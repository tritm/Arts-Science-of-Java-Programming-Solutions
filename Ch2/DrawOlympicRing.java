import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;

/**
 * Draw a five interlocking rings (blue, yellow, black, green, red ) of Olympic symbol
 */
public class DrawOlympicRing extends GraphicsProgram {

    private static final int HEIGHT = 100;
    private static final int WIDTH = 100;
    private static final int X0 = 150; // x of left most ring
    private static final int YL = 50; // y of lower ring
    private static final int YH = 120; // y of higher ring
    @Override
    public void run() {
        this.setBackground(Color.white);
        Logger log = LoggerFactory.getLogger(getClass());
        GOval[] r = new GOval[5];
        Color[] cls    = new Color[]{Color.blue, Color.yellow, Color.black, Color.green, Color.red};
        for (int i = 0; i < 5; i++) {
            r[i] = new GOval((X0 + i*55), (i%2==0?YL:YH), WIDTH, HEIGHT);
            log.debug("i = {} \t x = {} \t y = {} \t width = {} \t height = {} \t color = {} ", i,(X0+i*55), (i%2==0?YL:YH), WIDTH, HEIGHT, cls[i]);
            r[i].setColor(cls[i]);
            add(r[i]);
        }
    }
}
    