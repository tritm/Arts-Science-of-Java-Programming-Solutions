import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import acm.program.ConsoleProgram;

/**
 * Recursive Fibonacci
 * File: FibonacciMethod.java
 */

public class FibonacciMethod extends ConsoleProgram {
	Logger log = LoggerFactory.getLogger(getClass());
	public void run() {
		int n;
		n = readInt("Enter the number to calculate fibonacci from 1 to n: ");
		for (int i = 0; i < n; i++){
			println("fibonacci " + i + " = " + fibonacci(i));
		}
	}
	// Calculate the nth fibonacci as recursive method
	private int fibonacci(int n){
		if (n == 0) return 1;
		if (n == 1) return 1;
		return fibonacci(n-1) + fibonacci(n-2);
	}
}


