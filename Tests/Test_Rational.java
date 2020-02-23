public class Test_Rational {
    public static void main(String[] args){
        Rational myRational = new Rational(2,3);
        System.out.println("Name = " + myRational.toString());
        System.out.println("Add 3/2 = " + myRational.add(new Rational(3,2)));
        System.out.println("Subtract 2/5 = " + myRational.subtract(new Rational(2,5)));
        System.out.println("Multiply 3/5 = " + myRational.multiply((new Rational(3,5))));
        System.out.println("Divide 5/7 = " + myRational.divide(new Rational(5,7)));

    }
}
