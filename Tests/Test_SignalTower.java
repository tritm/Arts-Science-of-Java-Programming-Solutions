public class Test_SignalTower {
    public static void main (String[] args) {
        SignalTower st1 = new SignalTower("Signal Tower 1", null);
        SignalTower st2 = new SignalTower("Signal Tower 2", st1);
        SignalTower st3 = new SignalTower("Signal Tower 3", st2);
        st3.signal();



    }
}
