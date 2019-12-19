/**
 * This file demonstrates the interface and implement. We create an interface Animal
 * with 2 methods animalSound() and sleep(). Then we create a class Pig to implements Animal Interface
 * Infact, there are many interfaces available, we can use it
 */
interface Animal {
    public void animalSound(); // interface method (does not have a body)
    public void sleep(); // interface method (does not have a body)
}

class Pig implements Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
    public void sleep() {
        System.out.println("The pig sleep: Zzz");
    }
}

public class testInterface {
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
    }
}

