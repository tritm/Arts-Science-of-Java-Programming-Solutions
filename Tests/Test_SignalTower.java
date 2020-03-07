public class Test_SignalTower {
    public static void main (String[] args) {
        SignalTower st1 = new SignalTower("Rohan", null);
        SignalTower st2 = new SignalTower("Halifirien", st1);
        SignalTower st3 = new SignalTower("Calenhad", st2);
        SignalTower st4 = new SignalTower("Min-Rimmon", st3);
        SignalTower st5 = new SignalTower("Erelas", st4);
        SignalTower st6 = new SignalTower("Nardol", st5);
        SignalTower st7 = new SignalTower("Eileanach", st6);
        SignalTower st8 = new SignalTower("Amon Din", st7);
        SignalTower st9 = new SignalTower("Minas Tirish", st8);
        st9.signal();
    }
}
