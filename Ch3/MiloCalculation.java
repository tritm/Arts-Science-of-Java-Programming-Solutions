/*File:MiloCalculation.java
 * -----------------------------
 * This program makes Milo's calculation
 * in the book, The Phantom Toolbooth
 * proposed by the Mathmagician.
 */

//imports
import acm.program.*;

public class MiloCalculation extends ConsoleProgram {
	public void run () {
		/*Previous condition: Java makes a calculation based on
		 * using the operands from left to right prioritizing
		 * the multiplications and divisions and only after that
		 * the adding and subtraction.
		 * 
		 * Post Condition: Milo's Calculation is based solely
		 * on left to right operation, regardless of the operands.
		 * This program will ignore Java rule to make Milo's
		 * Calculation work here. The result should be ZERO.
		 * 
		 * Milo's Calculation -> 4+9-2*16+1/3*6-67+8*2-3+26-1/34+3/7+2-5 = 0
		 */
		
		println("This program performs Milo's Calculation.");
		println("The Mathmagician asked Milo to perform the following Calculation -> 4+9-2*16+1/3*6-67+8*2-3+26-1/34+3/7+2-5 = 0");
		println("To understand how this was done we have to have in mind one thing.");
		println("Milo disregarded Math rules and used only integers");
		double milo = ((((((((((((((((4+9)-2)*16)+1)/3)*6)-67)+8)*2)-3)+26)-1)/34)+3)/7)+2)-5;
		println ("The result is: " + milo);
	}

}
