import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;

/**
 * Draw an archery target with 3 rings
 */
public class AskYesNoQuestion extends ConsoleProgram {

    public void run() {
        while (true) {
            if (askYesNoQuestion("Would you like instructions? ")) {
                println("Pls answer yes or no");
            } else {
                println("Thank you for good answer");
                pause(1000);
                exit();
            }
        }
    }
    private boolean askYesNoQuestion(String s) {
        String result = readLine(s);
        if (result.equals("yes") || result.equals("no")) return false;
        else return true;
    }
}
    