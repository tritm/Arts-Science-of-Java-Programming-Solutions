/*File:Interest2.java
 * -------------------------------
 * This program calculates the interest
 * of two years of annual balance.
 */

//imports
import acm.program.*;

public class Interes2 extends DialogProgram {
	public void run () {
		println("Interest Calculation Program for two years: ");
		double balance = readDouble ("Enter starting balance: ");
		double annual_interest = readDouble ("Enter annual interest rate: ");
		double total_annual_ammount = balance * (annual_interest/PERCENTAGE);
		double first_year_balance = balance + total_annual_ammount;
		double second_year_balance = first_year_balance + first_year_balance * (annual_interest/PERCENTAGE);
		println("Balance after one year: " + first_year_balance);
		println("Balance after two years: " + second_year_balance);
	}
	private static final double PERCENTAGE = 100;
}
