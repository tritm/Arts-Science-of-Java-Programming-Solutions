import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;

/**
 * Draw an archery target with 3 rings
 */
public class DrawTrafficLight extends GraphicsProgram {

    public void run() {
        Logger log = LoggerFactory.getLogger(getClass());

        double cx = getWidth() / 2;
        double cy = getHeight() / 2;
        double dy = FRAME_HEIGHT / 4 + LAMP_RADIUS / 2;

        add(createFilledRect(cx, cy, FRAME_WIDTH, FRAME_HEIGHT, Color.blue));
        add(createFilledCircle(cx, cy - dy, LAMP_RADIUS, Color.red));
        add(createFilledCircle(cx, cy, LAMP_RADIUS, Color.yellow));
        add(createFilledCircle(cx, cy + dy, LAMP_RADIUS, Color.green));
    }
    private GOval createFilledCircle(double x, double y, double r, Color color) {
        GOval circle = new GOval(x - r, y - r, 2 * r, 2 * r);
        circle.setColor(color);
        circle.setFilled(true);
        return circle;
    }
    private GRect createFilledRect(double x, double y, double w, double h, Color color) {
        GRect rect = new GRect(x - w/2.0, y - h/2.0, w, h);
        rect.setColor(color);
        rect.setFilled(true);
        return rect;
    }
    private static final double FRAME_WIDTH = 50;
    private static final double FRAME_HEIGHT = 100;
    private static final double LAMP_RADIUS = 10;
}
    