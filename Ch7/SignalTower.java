/**
 * This class defines a signal tower object that passes  a message to the next tower in a line
 */
public class SignalTower {
    /**
     * Construct a new signal tower with the following parameters:
     * @param name The name of the signal tower
     * @param link A link to the next tower, or null if none exists
     */
    public SignalTower(String name, SignalTower link) {
        towerName = name;
        nextTower = link;
    }

    /**
     * This method represents sending a signal to this tower. The effect is to light the signal fire here and to send an additional signal message to the next tower in the chain, if any.
     */
    public void signal() {
        lightCurrentTower();
        if (nextTower != null) nextTower.signal(); //recursively
    }

    /**
     * This method lights the signal fire for this tower. This version that simply prints the name of the tower to the standard output channel. If you wanted to extend this class to be part of a graphical application, for example, you could override this method to draw an indication of the signal fire on the display.
     */
    public void lightCurrentTower() {
        System.out.println("Lighting " + towerName);
    }
    /* Private instance variables */
    private String towerName; /* The name of this tower */
    private SignalTower nextTower; /* A link to the next tower */

}
