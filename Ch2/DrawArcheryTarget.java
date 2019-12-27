import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;

/**
 * Draw an archery target with 3 rings
 */
public class DrawArcheryTarget extends GraphicsProgram {

    private static final int DELTA = 50; // Step size of diameter of the rings
    private static final int D0 = 150; //Diameter of outer most ring
    private static final int D1 = D0 - DELTA;
    private static final int D2 = D0 -2*DELTA;
    private static final int X0 = 350; // x original of outer most ring
    private static final int Y0 = 250; // y original of outer most ring

    public void run() {

        Logger log = LoggerFactory.getLogger(getClass());
        log.info("Width = {} Height = {}", getWidth(), getHeight());
        GOval r1 = new GOval(X0 - D0/2, Y0 - D0/2, D0, D0);
        GOval r2 = new GOval(X0 - D1/2, Y0 - D1/2, D1, D1);
        GOval r3 = new GOval(X0 - D2/2, Y0 - D2/2, D2, D2);
        r1.setFilled(true); r1.setFillColor(Color.red); r1.setColor(Color.red);
        r2.setFilled(true); r2.setFillColor(Color.white); r2.setColor(Color.white);
        r3.setFilled(true); r3.setFillColor(Color.red); r3.setColor(Color.red);
        add (r1); add (r2); add(r3);
    }
}
    