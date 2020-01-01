import acm.graphics.GLine;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;

/**
 * Draw an archery target with 3 rings
 */
public class DrawTrain extends GraphicsProgram {
    public void run() {
        Logger log = LoggerFactory.getLogger(getClass());
        log.info("Width = {} Height = {}", getWidth(), getHeight());
        double trainWidth = 3 * CAR_WIDTH + 4 * CONNECTOR;
        double x = (getWidth() - trainWidth) / 2;
        double y = getHeight();
        double dx = CAR_WIDTH + CONNECTOR;
        drawEngine(x,y);
        drawBoxcar(x + dx, y, Color.green);
        drawCaboose(x + 2 * dx, y);
    }
    private void drawEngine(double x, double y) {
        double x0 = x + CONNECTOR + CAR_WIDTH - CAB_WIDTH;
        double y0 = y - CAR_BASELINE - CAR_HEIGHT - CAB_HEIGHT;
        drawCarFrame(x, y, Color.black);
        drawSmokestack(x, y);
        drawCab(x0, y0, Color.black);
        drawCowcatcher(x, y);
    }
    private void drawBoxcar(double x, double y, Color color) {
        drawCarFrame(x, y, color);
        double xRight = x + CONNECTOR + CAR_WIDTH / 2;
        double xLeft = xRight - DOOR_WIDTH;
        double yDoor = y - CAR_BASELINE - DOOR_HEIGHT;
        add(new GRect(xLeft, yDoor, DOOR_WIDTH, DOOR_HEIGHT));
        add(new GRect(xRight, yDoor, DOOR_WIDTH, DOOR_HEIGHT));
    }
    private void drawCaboose(double x, double y) {
        double x0 = x + CONNECTOR + CAR_WIDTH / 2.0 - CAB_WIDTH / 2.0;
        double y0 = y - CAR_BASELINE - CAR_HEIGHT - CAB_HEIGHT;
        drawCarFrame(x, y, Color.red);
        drawCab(x0, y0, Color.red);
    }
    private void drawSmokestack(double x, double y) {
        double x0 = x + CONNECTOR + SMOKESTACK_INSET;
        double y0 = y - CAR_BASELINE - CAR_HEIGHT - SMOKESTACK_HEIGHT;
        GRect r = new GRect(x0, y0, SMOKESTACK_WIDTH, SMOKESTACK_HEIGHT);
        r.setFilled(true);
        r.setFillColor(Color.black);
        add(r);
    }
    private void drawCab(double x, double y, Color color) {
        GRect r = new GRect(x, y, CAB_WIDTH, CAB_HEIGHT);
        r.setFilled(true);
        r.setFillColor(color);
        add(r);
    }
    private void drawCowcatcher(double x, double y) {
        double x0 = x;
        double x1 = x + CONNECTOR;
        double y0 = y - CAR_BASELINE;
        double y1 = y - CAR_BASELINE - CAR_HEIGHT/2.0;
        GLine l1 = new GLine(x0, y0, x1, y1);
        GLine l2 = new GLine(x0 + CONNECTOR/2.0, y0, x1, y1);
        add(l1); add(l2);
    }
    private void drawCarFrame(double x, double y, Color color) {
        double x0 = x + CONNECTOR;
        double y0 = y - CAR_BASELINE;
        double top = y0 - CAR_HEIGHT;
        add(new GLine(x, y0, x + CAR_WIDTH + 2 * CONNECTOR, y0));
        drawWheel(x0 + WHEEL_INSET, y - WHEEL_RADIUS);
        drawWheel(x0 + CAR_WIDTH - WHEEL_INSET, y - WHEEL_RADIUS);
        GRect r = new GRect(x0, top, CAR_WIDTH, CAR_HEIGHT);
        r.setFilled(true);
        r.setFillColor(color);
        add(r);
    }
    private void drawWheel(double x, double y) {
        double r = WHEEL_RADIUS;
        GOval wheel = new GOval(x -r, y - r, 2 * r, 2 * r);
        wheel.setFilled(true);
        wheel.setFillColor(Color.gray);
        add(wheel);
    }

    /* Dimensions of the frame of a train car*/
    private static final double CAR_WIDTH = 75*2;
    private static final double CAR_HEIGHT = 36*2;

    /* Distance from the bottom of a train car to the track below it*/
    private static final double CAR_BASELINE = 10*2;

    /*Width of connectors, which overlaps between successive car*/
    private static final double CONNECTOR = 6*2;

    /*Radius of the wheel on each car*/
    private static final double WHEEL_RADIUS = 8*2;

    /*Distance from the edge of the frame to the center of the wheel*/
    private static final double WHEEL_INSET = 16*2;

    /*Dimensions of the cab on the engine*/
    private static final double CAB_WIDTH = 35*2;
    private static final double CAB_HEIGHT = 8*2;

    /*Dimensions of the smoke stack and its distance from the front*/
    private static final double SMOKESTACK_WIDTH = 8*2;
    private static final double SMOKESTACK_HEIGHT = 8*2;
    private static final double SMOKESTACK_INSET = 8*2;

    /*Dimensions of the door panel on the box car */
    private static final double DOOR_WIDTH = 18*2;
    private static final double DOOR_HEIGHT = 32*2;

    /*Dimensions of the cupola on the carboose */
    private static final double CUPOLA_WIDTH = 35*2;
    private static final double CUPOLA_HEIGHT = 8*2;
}
    