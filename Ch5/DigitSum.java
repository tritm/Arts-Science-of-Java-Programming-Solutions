import acm.program.ConsoleProgram;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Sum digit
 * File: DigitSum.java
 */

public class DigitSum extends ConsoleProgram {
	Logger log = LoggerFactory.getLogger(getClass());
	public void run() {
		println("This program sums the digits in an integer ");
		int n = readInt("Enter a positive integer: ");
		int dsum = 0;
		while (n > 0) {
			dsum += n % 10;
			n /= 10;
		}
		println("The sum of digits is " + dsum);
	}
}

