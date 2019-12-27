import acm.graphics.*;
import acm.program.*;
public class TicTacToe extends GraphicsProgram {
    public void run(){
        int w = getWidth();
        int h = getHeight();
        add(new GLine((w - BOARD_SIZE)/2,(h - 30)/2,(w + BOARD_SIZE)/2,(h - 30)/2));
        add(new GLine((w - BOARD_SIZE)/2,(h + 30)/2,(w + BOARD_SIZE)/2,(h + 30)/2));
        add(new GLine((w - 30)/2,(h - BOARD_SIZE)/2,(w - 30)/2,(h + BOARD_SIZE)/2));
        add(new GLine((w + 30)/2,(h - BOARD_SIZE)/2,(w + 30)/2,(h + BOARD_SIZE)/2));
    }
    private static final int BOARD_SIZE = 90;



}
