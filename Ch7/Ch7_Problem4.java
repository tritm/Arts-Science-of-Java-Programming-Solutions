import acm.program.*;
import acm.util.*;
import java.lang.*;
import java.awt.Color;

import acm.graphics.*;

public class Ch7_Problem4 extends ConsoleProgram {
	public static void main(String[] args) {
		int LOW_RANGE = 1;
		int HIGH_RANGE = 20;
		int N = 100;
		Runtime myRuntime = Runtime.getRuntime();
//		RandomGenerator rgen = new RandomGenerator();
//		Rational[] myRational = new Rational[N];
		Integer[] myInteger = new Integer[N];
		System.out.println("Total memory is: " + myRuntime.totalMemory());
		System.out.println("Initial free memory: " + myRuntime.freeMemory());
//		for (int i = 1; i < N; i++) {
//			myRational[i] = new Rational(rgen.nextInt(LOW_RANGE, HIGH_RANGE), rgen.nextInt(LOW_RANGE, HIGH_RANGE));
//			myRational[i] = null;
//		}
		for (int i = 1; i < N; i++) {
			myInteger[i] = Integer.valueOf(i);
			myInteger[i] = null;
		}
		System.out.println("Free memory in JVM before Garbage Collection = " + myRuntime.freeMemory());
		myRuntime.gc();
		System.out.println("Free memory in JVM after Garbage Collection = " + myRuntime.freeMemory());
	}
}