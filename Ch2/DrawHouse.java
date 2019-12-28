import acm.graphics.*;
import acm.program.GraphicsProgram;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;

/**
 * Draw a house
 */
public class DrawHouse extends GraphicsProgram {
    public void run() {
        int w = getWidth();
        int h = getHeight();
        int X0 = (w - H_WIDTH)/2;
        int Y0 = (h - H_HEIGHT)/2;
        Logger log = LoggerFactory.getLogger(getClass());
        log.info("Width = {} Height = {}", w, h);

        GRect r1 = new GRect(X0,  Y0, H_WIDTH, H_HEIGHT);
        GRect r2 = new GRect(X0 + WH,  Y0 + WH, D_WIDTH, D_WIDTH);
        GRect r3 = new GRect(X0 + H_WIDTH - D_WIDTH - WH,  Y0 + WH, D_WIDTH, D_WIDTH);
        GRect r4 = new GRect((w - D_WIDTH)/2.0 ,  Y0 + H_HEIGHT - D_HEIGHT, D_WIDTH, D_HEIGHT);
        GPoint p1 = new GPoint(X0,  Y0);
        GPoint p2 = new GPoint(X0 + H_WIDTH/2.0, Y0 - R_HEIGHT);
        GPoint p3 = new GPoint(X0 + H_WIDTH, Y0);
        GPoint[] points = new GPoint[] {p1, p2, p3};
        GPolygon r5 = new GPolygon(points);
        GOval r6 = new GOval((w - D_WIDTH)/2.0 + D_WIDTH - 10 ,  Y0 + H_HEIGHT - D_HEIGHT/2.0, D_KNOB, D_KNOB);

        add (r1); add (r2); add (r3); add(r4); add(r5); add(r6);
    }
    private static final int H_WIDTH = 226; // House width;
    private static final int H_HEIGHT = 114; // House height including roof;
    private static final int R_HEIGHT = 54; // Roof height;
    private static final int D_WIDTH = 42; // Door width = windows width = windows height;
    private static final int D_HEIGHT = 80; // Door height;
    private static final int WH = 20; // Door width = windows width = windows height;
    private static final int D_KNOB = 5; // Diameter of Knob;
}
    