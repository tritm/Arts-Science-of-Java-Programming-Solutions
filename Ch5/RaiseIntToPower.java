/**File: FibonacciMethod.java
 * --------------------------------
 * Recursive Fibonacci
 */

import acm.program.ConsoleProgram;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RaiseIntToPower extends ConsoleProgram {
	Logger log = LoggerFactory.getLogger(getClass());
	public void run() {
		int n, k;
		n = readInt("Enter base n: ");
		k = readInt("Enter exponential k: ");
		println("Calculated " + n + "^" + k + " = " + raceIntToPower(n,k));
	}
	// Calculate the nth fibonacci as recursive method
	private double raceIntToPower(int n, int k){
		return Math.pow(n,k);
	}
}




