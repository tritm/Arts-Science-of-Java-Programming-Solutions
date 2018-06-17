package ChFive;
/*
 * File:QuadraticSec.java
 * -------------------------------
 * This program calculates the Quadratic equation.
 */

/*
 * Pre-condition: The previous program made this calculation using bottom to top design.
 * It also used values instead of methods. 
 */

/*
 * Post-Condition: This program tries to implement good style to the resolution
 * of the problem by adopting Top to Bottom design and private methods.
 * Previous program can be seen at Quadratic.java program in this folder.
 */

/*The quadratic equation is: x  = –b ±√b^2 – 4ac
 * 								 ---------------							      
 *									   2a
 * step 1: calculate the value under the square root.
 * step 2: calculate the value above the under score.
 * step 3: divide the above value with the value below. 
 */

import acm.program.*;

public class QuadraticSec extends ConsoleProgram {
	
	public void run () {
		
		println("This program calculates the Quadratic equation.\n" 
				+ "\nax^2 + bx + cx = 0");
		double a = readDouble ("\nCan not be equal to zero a: ");
		double b = readDouble ("b: ");
		double c = readDouble ("c: ");
		
		//It checks if the equation has a real solution.
		while(check(a, b, c) < 0 || (b == 0 || c == 0 && a == 0)  || a == 0) {
	
			if (check(a, b, c) < 0) {
				println("\nSorry! "
						+ "\n\nSince the value under the root is negative. "
						+ "The parabola will never touch the x-axis. "
						+ "Therefore it has no real soluton.\n"
						+ "\nTry another number.");
				println("\nCheck more at https://www.mathsisfun.com/quadratic-equation-solver.html");
		
			}else if (b == 0 || c == 0 && a == 0) {
				println("\nNever too late to learn."
						+ "\n\nA little bit about Quadratic equation at:"
						+"\n\nhttps://en.wikipedia.org/wiki/Quadratic_equation");
		
			} else if (a == 0) {
				println("\nOh oh; \"a\" equals to zero transforms "
						+ "the parabola into a linear infinite line."
						+ "\nWithout a parabola the quadratic equation"
						+ " has no solution. "
						+ "\n\nFor more: https://en.wikipedia.org/wiki/Quadratic_equation");
			}
		
			a = readDouble ("\nCan not be equal to zero a: ");
			b = readDouble ("b: ");
			c = readDouble ("c: ");
		}
		
		println("\nFirst solution is " + quadraticPlus(a, b, c));
		println("\nSecond solution is " + quadraticMinus(a, b, c));
	}
	
	
	//private methods
	private double check (double a, double b, double c) {
		double inside = Math.pow(b, 2) - (4 * a * c);
		return inside;
	}
	
	private double quadraticPlus (double a, double b, double c) {
		double inside = Math.pow(b, 2) - (4 * a * c);
		double root = Math.sqrt(inside);
		double above = -b + root;
		double first = above/(2 * a);
		return first;
	}
	
	private double quadraticMinus(double a, double b, double c) {
		double inside = Math.pow(b, 2) - (4 * a * c);
		double root = Math.sqrt(inside);
		double above = -b - root;
		double second = above/(2 * a);
		return second;
	}
	
}	
	
	
	/*Testing private Method
	  public void run() {
		int x = readInt ("x: ");
		int y = readInt ("y: ");
		
		//x and y are in curly braces to pass the values of the private method
		println(sum(x, y)); //It works.
	}
	
	private int sum(int x, int y) {
		int result = x + y;
		return result;
	}
	*/