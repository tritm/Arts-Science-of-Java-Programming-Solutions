/**
 * This class allows its clients to treat an integer as an object. The underlying integer value is set using setValue and returned using getValue.
 */
public class EmbeddedInteger {
    /**
     * Creats an embedded integer with the value n.
     */
    public EmbeddedInteger(int n){
        value =n;
    }

    /**
     * Sets the internal value of this EmbeddedInteger to n.
     */
    public void setValue(int n){
        value = n;
    }

    /**
     * Returns the internal value of this EmbeddedInteger.
     */
    public int getValue(){
        return value;
    }

    /**
     * Overrides the toString method to make it return the string corresponding to the internal value.
     */
    public String toString(){
        return "" + value;
    }
    /* Private instance variable */
    private int value; /* the internal value */
}
