import acm.program.ConsoleProgram;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Count digit
 * File: CountDigits.java
 */

public class CountDigits extends ConsoleProgram {
	Logger log = LoggerFactory.getLogger(getClass());
	public void run() {
		int n;
		n = readInt("Enter base n: ");
		println("number of Digits of " + n + " = " + countDigits(n));
	}
	// Calculate the nth fibonacci as recursive method
	private double countDigits(int n) {
		int i = 0;
		while (true)
			if (n/Math.pow(10,i) >= 1 && n/Math.pow(10,i) < 10) return ++i ;
			else i++;
	}
}

