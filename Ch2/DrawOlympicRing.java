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
        GOval r1 = new GOval(150,50,100,100);
        r1.setColor(Color.blue);
        add(r1);
        GOval r2 = new GOval(205,120,100,100);
        r2.setColor(Color.yellow);
        add(r2);
        GOval r3 = new GOval(260,50,100,100);
        r3.setColor(Color.black);
        add(r3);
        GOval r4 = new GOval(315,120,100,100);
        r4.setColor(Color.green);
        add(r4);
        GOval r5 = new GOval(370,50,100,100);
        r5.setColor(Color.red);
        add(r5);
    }
}
    