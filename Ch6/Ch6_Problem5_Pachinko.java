import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Ch6_Problem5_Pachinko extends ConsoleProgram {
    RandomGenerator rgen = new RandomGenerator();
    private static final int BAR = 1;
    private static final int BELL = 2;
    private static final int PLUM = 3;
    private static final int ORANGE = 4;
    private static final int LEMON = 5;
    private static final int CHERRY = 6;
    String[] strList = {"BAR", "BELL", "PLUM", "ORANGE","LEMON", "CHERRY"};

    public void run() {
        String instr = readLine("Would you like instruction (y/n)? ");
        if (instr.equals("y") | instr.equals("yes") ) printInstruction();

        String play = readLine("You have $50. Would you like to play? ");
        if (play.equals("n") | play.equals("no")) exit();


        int M1, M2, M3;
        int budget = 50;
        while (budget >= 0) {
            M1 = dice();
            M2 = dice();
            M3 = dice();
//            M1 = 6; M2 = 2; M3 = 1;
            budget = calculatePrize(budget, M1, M2, M3);
//            pause(500);
        }
    }
    private int dice() { return rgen.nextInt(BAR, CHERRY); }
    private void printInstruction() {
        println("BAR \t BAR \t BAR \t\t pays \t $250");
        println("BELL \t BELL \t BELL/BAR \t\t pays \t $20");
        println("PLUM \t PLUM \t PLUM/BAR \t\t pays \t $14");
        println("ORANGE \t ORANGE \t ORANGE/BAR \t pays \t $10");
        println("CHERRY \t CHERRY \t CHERRY \t\t pays \t $7");
        println("CHERRY \t CHERRY \t - \t\t pays \t $5");
        println("CHERRY \t - \t - \t\t pays \t $2");

    }
    private int calculatePrize(int budget, int m1, int m2, int m3){

        boolean c1 = m1 == BAR && m2 == BAR && m3 == BAR;
        boolean c2 = m1 == BELL && m2 == BELL && ((m3 == BELL) || (m3 == BAR));
        boolean c3 = m1 == PLUM && m2 == PLUM && ((m3 == PLUM) || (m3 == BAR));
        boolean c4 = m1 == ORANGE && m2 == ORANGE && ((m3 == ORANGE) || (m3 == BAR));
        boolean c5 = m1 == CHERRY && m2 == CHERRY && m3 == CHERRY;
        boolean c6 = m1 == CHERRY && m2 == CHERRY && ((m3 == BAR)  || (m3 == BELL) || (m3 == PLUM) || (m3 == ORANGE) || (m3 == LEMON) || (m3 == CHERRY));
        boolean c7 = m1 == CHERRY && ((m2 == BAR)  || (m2 == BELL) || (m2 == PLUM) || (m2 == ORANGE) || (m2 == LEMON) || (m3 == CHERRY) ) && ((m3 == BAR)  || (m3 == BELL) || (m3 == PLUM) || (m3 == ORANGE) || (m3 == LEMON) || (m3 == CHERRY));

        if (c1) {
            budget += 249;
            printResult(1, budget, m1, m2, m3);
        }
        else if (c2) {
            budget += 19;
            printResult(2, budget, m1, m2, m3);
        }
        else if (c3) {
            budget += 13;
            printResult(3, budget, m1, m2, m3);
        }
        else if (c4) {
            budget += 9;
            printResult(4, budget, m1, m2, m3);
        }
        else if (c5 ) {
            budget += 6;
            printResult(5, budget, m1, m2, m3);
        }
        else if (c6) {
            budget += 4;
            printResult(6, budget, m1, m2, m3);
        }
        else if (c7) {
            budget += 1;
            printResult(7, budget, m1, m2, m3);
        }
        else {
            budget--;
            printResult(8, budget, m1, m2, m3);
        }
        return budget;
    }
    private void printResult(int c, int budget, int m1, int m2, int m3) {
        switch (c){
            case 1: println("BAR \t BAR \t BAR -- You win $250 -- Your budget is " + budget); break;
            case 2: println("BELL \t BELL \t" + strList[m3-1] + "-- You win $20 -- Your budget is $" + budget); break;
            case 3: println("PLUM \t PLUM \t" + strList[m3-1] + " -- You win $14 -- Your budget is $" + budget); break;
            case 4: println("ORANGE \t ORANGE \t" + strList[m3-1] + "-- You win $10 -- Your budget is $" + budget); break;
            case 5: println("ORANGE \t ORANGE \t" + strList[m3-1] + " -- You win $7 -- Your budget is $" + budget); break;
            case 6: println("CHERRY \t CHERRY \t" + strList[m3-1] + " -- You win $5 -- Your budget is $" + budget); break;
            case 7: println("CHERRY \t" + strList[m2-1] + "\t" + strList[m3-1] + " -- You win $2 -- Your budget is $" + budget); break;
            case 8: println(""+ strList[m1-1] + "\t" + strList[m2-1] + "\t" + strList[m3-1] + " -- You loose -- Your budget is $" + budget); break;
        }
        String play = readLine("Would you like to play? ");
        if (play.equals("n") | play.equals("no")) exit();
    }
}

