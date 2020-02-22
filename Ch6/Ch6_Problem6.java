import acm.program.*;
import acm.util.*;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.lang.Math;
import static org.junit.Assert.assertEquals;

/*
Exercise 6:
  1. Ask 5 questions with constants that can be changed
  2. Each question randomly adds or subtracts numbers
  3. Answers can't be less than 0 or greater 20
  4. Program allows 3 tries, if they fail then proceed to next question
  5. Offer 5 different encouragement types for correct answers
 */
public class Ch6_Problem6 extends ConsoleProgram {
	/* Solution
	Number Generation:
		Generate 2 random numbers within Interval CONSTANT1 & CONSTANT2
		Choose greater number
			use ivars highNum = higher number lowNum = lower number.
		Convert lowNum randomly into negative or positive
	Student Calculation:
		x = highNum + lowNum
		Student enters Answer = answer;
		Iterate 3 times for correct answer
		If 3 iterations incorrect then print correct answer and move to next question
		If correct, choose from 1 of 5 congratulatory messages.
	Correct Answer:
		Using random Switch method.
	Run program 5 times.*/

	//Static variables that give the range of the addition/subtraction.
	Logger log = LoggerFactory.getLogger(getClass());
	public static final int LOW_RANGE = 1;
	public static final int HIGH_RANGE = 20;
	//rgen is a new object and it calls a method.
	RandomGenerator rgen = new RandomGenerator();
	//ivars.
	private int highNum;
	private int lowNum;

	public void run() {
		setFont("Helvetica-40");
		println("Welcome to the MathSim!");
		int i = 0;
		while (i < 5) {
			numGen();
			studentCalculation();
			i++;
		}
	}

	private void studentCalculation(){
		String symbol = "";
		if (lowNum >= 0) symbol = " + ";
		else symbol = " - ";
		int answer = highNum + lowNum;
		int studentAnswer = readInt("What is " + highNum + symbol + Math.abs(lowNum) + "? ");
		int c = 0;
		if (studentAnswer == answer) {
			println(correctAnswer());
		}
		while (studentAnswer != answer && c < 3) {
			c++;
			studentAnswer = readInt("Incorrect - Try again: ");
			if (c == 3) { //condition to exit white loop
				println("The correct answer was: " + answer);
				log.debug("Trial times c = {} \t anouncement = The correct answer was: {} ", c, answer);
			} else if(studentAnswer == answer) { //condition to exit while loop
				println(correctAnswer());
				log.debug("Trial times c = {} \t anouncement = {} ", c, correctAnswer());
			}
			else
			log.debug("Trial times c = {} \t Incorrect - Try again: ", c);
		}
	}

	private String correctAnswer() {
		int correct = rgen.nextInt(1,5);
		switch (correct) {
			case 1: return ("That's right, great job!");
			case 2: return ("Good work, you are right!");
			case 3: return ("Good Answer!");
			case 4: return ("Keep up the good work!");
			case 5: return ("Perfect answer!");
			default: return ("Correct!");
		}
	}

	//Method numGen
	private void numGen() {
		int n1 = rgen.nextInt(LOW_RANGE,HIGH_RANGE);
		int n2 = rgen.nextInt(LOW_RANGE,HIGH_RANGE);

		if (n1 >= n2) {
			highNum = n1;
			lowNum  = n2;
		} else {
			highNum = n2;
			lowNum = n1;
		}
		if (subtract()) {
			lowNum = -1 * lowNum;
		}
	}

	//Predicate method subtract:
	private boolean subtract() {
		return rgen.nextBoolean(0.5);
	}
//	@Test
//	private void test_numGen()
//	{
//		int x  = 1 ; int y = 1;
//		assertEquals(2, myClass.add(x,y));
//	}

}