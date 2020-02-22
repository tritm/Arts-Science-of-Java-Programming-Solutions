import acm.graphics.GLine;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;

/**
 * Check whether a number is prime
 */
public class IsPrime extends ConsoleProgram {
    public void run() {
        Logger log = LoggerFactory.getLogger(getClass());
        log.info("Width = {} Height = {}", getWidth(), getHeight());
        int num = readInt("Enter an Integer n = ");
        if (isPrime(num)) {
            println("The entered number " + num + " is prime number");
        } else {
            println("The entered number " + num + " is not a prime number");
        }
    }
    private boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
