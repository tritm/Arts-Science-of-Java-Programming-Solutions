import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;

/**
 * Draw target
 */
public class DrawTarget extends GraphicsProgram {

    public void run() {

        Logger log = LoggerFactory.getLogger(getClass());
        log.info("Width = {} Height = {}", getWidth(), getHeight());

        int X0 = getWidth() / 2; //center of graphic window
        int Y0 = getHeight() / 2; //center of graphic window

        add(createFilledCircle(X0, Y0, D0, Color.red));
        add(createFilledCircle(X0, Y0, D1, Color.white));
        add(createFilledCircle(X0, Y0, D2, Color.red));
        add(createFilledCircle(X0, Y0, D3, Color.white));
        add(createFilledCircle(X0, Y0, D4, Color.red));

    }
    private GOval createFilledCircle(double x, double y, double r, Color color) {
        GOval circle = new GOval(x - r, y - r, 2 * r, 2 * r);
        circle.setColor(color);
        circle.setFilled(true);
        return circle;
    }
    private static final int DELTA = 30; // Step size of diameter of the rings
    private static final int D0 = 150; //Diameter of outer most ring
    private static final int D1 = D0 - DELTA;
    private static final int D2 = D1 - DELTA;
    private static final int D3 = D2 - DELTA;
    private static final int D4 = D3 - DELTA;

}
    