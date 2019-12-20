import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.awt.*;

/**
 * Draw a five interlocking rings (blue, yellow, black, green, red ) of Olympic symbol
 */
public class DrawThickOlympicRing extends GraphicsProgram {
    public void run() {
        Logger log = LoggerFactory.getLogger(getClass());
        log.info("window width = {} \t windows height = {}",getWidth(), getHeight());
        GOval r1 = new GOval(150,50,100,100);
        r1.setColor(Color.blue);
        r1.setFillColor(Color.blue);
        r1.setFilled(true);
        GOval rr1 = new GOval(151.5, 51.5, 97, 97);
        rr1.setFillColor(Color.white);
        rr1.setFilled(true);
        rr1.setColor(Color.blue);
        add(r1);
        add(rr1);
        GOval r2 = new GOval(205,120,100,100);
        r2.setColor(Color.yellow);
        r2.setFillColor(Color.yellow);
        r2.setFilled(true);
        GOval rr2 = new GOval(206.5, 121.5, 97, 97);
        rr2.setFillColor(Color.white);
        rr2.setFilled(true);
        rr2.setColor(Color.yellow);
        add(r2);
        add(rr2);
        GOval r3 = new GOval(260,50,100,100);
        r3.setFilled(true);
        r3.setFillColor(Color.black);
        r3.setColor(Color.black);
        add(r3);
        GOval rr3 = new GOval(261.5, 51.5, 97, 97);
        rr3.setFillColor(Color.white);
        rr3.setFilled(true);
        rr3.setColor(Color.black);
        rr3.sendToBack();
        add(rr3);
        GOval r4 = new GOval(315,120,100,100);
        r4.setFilled(true);
        r4.setFillColor(Color.green);
        r4.setColor(Color.green);
        add(r4);
        GOval rr4 = new GOval(316.5, 121.5, 97, 97);
        rr4.setFillColor(Color.white);
        rr4.setFilled(true);
        rr4.setColor(Color.green);
        rr4.sendToBack();
        add(rr4);
        GOval r5 = new GOval(370,50,100,100);
        r5.setFilled(true);
        r5.setFillColor(Color.red);
        r5.setColor(Color.red);
        add(r5);
        GOval rr5 = new GOval(371.5, 51.5, 97, 97);
        rr5.setFillColor(Color.white);
        rr5.setFilled(true);
        rr5.setColor(Color.red);
        rr5.sendToBack();
        add(rr5);
    }
}
    