public class Test_EmbeddedInteger {
    public static void main(String[] args){
        EmbeddedInteger myInteger = new EmbeddedInteger(5);
        System.out.println("Value of myInteger = " + myInteger.getValue());
        myInteger.setValue(8);
        System.out.println("Value of myInteger = " + myInteger.getValue());
        System.out.println("Name of toString = " + myInteger.toString());



    }
}
