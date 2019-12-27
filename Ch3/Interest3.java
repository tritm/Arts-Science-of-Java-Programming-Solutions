/*File:Interest.java
 * -----------------------------------
 * This program calculates the interest
 * in a bank account.
 */

//import

import acm.program.DialogProgram;

public class Interest3 extends DialogProgram {
	public void run () {
		println("Interest calculation program");
		double balance = readDouble ("Enter starting balance: ");
		double annual_interest = readDouble ("Enter annual interest rate: ");
		double total_balance;
		StringBuilder to_print = new StringBuilder();
		for (int i = 0; i < 10; i++){
			total_balance = balance * Math.pow(1 + annual_interest/PERCENTAGE, i);
			to_print.append("Total balance at year ").append(i).append(" is").append(total_balance).append("\n");
		}
		println(to_print.toString());
	}
private static final double PERCENTAGE = 100;
}
