/*File:Interest.java
 * -----------------------------------
 * This program calculates the interest
 * in a bank account.
 */

//import
import acm.program.*;

public class Interest extends DialogProgram {
	public void run () {
		println("Interest calculation program");
		double balance = readDouble ("Enter starting balance: ");
		double annual_interest = readDouble ("Enter annual interest rate: ");
		double total_annual_ammount = balance * (annual_interest/PERCENTAGE);
		double total_balance = balance + total_annual_ammount;
		println("Balance after one year: " + total_balance);
		
	}
private static final double PERCENTAGE = 100;
}
