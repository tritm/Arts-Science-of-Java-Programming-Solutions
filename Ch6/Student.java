/**
 * The student class keeps track of the following pieces of data about student: the student's name, ID number, the number of credits the student has earned toward graduation, and whether the student is paid up   with respect to university's bills. All of this information is entirely private to the class. Clients can obtain this information only by using various method defined by the class.
 */
public class Student {
    /**
     * Create a new student object with the specified name and ID.
     * @param name The student's name as a String
     * @param id The student's ID number as int
     */
    public Student(String name, int id) {
        studentName = name;
        studentID = id;
    }

    /**
     * Gets the name of this student.
     * @return studentName;
     */
    public String getName() {
        return studentName;
    }

    /**
     * Gets the ID number of this student
     * @return studentID
     */
    public int getID(){
        return studentID;
    }

    /**
     * Set the number of credits earned
     * @param credits The new number of credits earned
     */
    public void setCredits(double credits){
        creditsEarned = credits;
    }

    /**
     * Get the number of credits earned
     * @return The number of credits this student has earned
     */
    public double getCredits(){
        return creditsEarned;
    }

    /**
     * Sets whether student is paid up.
     * @param flag The value true or false indicating paid-up status
     */
    public void setPaidUp(boolean flag){
        paidUp = flag;
    }

    /**
     * Return whether the student is paid up
     * @return Whether this student is paid up
     */
    public boolean getPaidUp(){
        return paidUp;
    }

    /**
     * Created string identifying this student.
     * @return The string used to display this student
     */
    public String toString(){
        return studentName + " (#" + studentID + ")";
    }
    /* Public constant */

    /* The number of credits required for graduation */
    public static final double CREDITS_TO_GRADUATE = 32.0;

    /* Private instance variable */
    private String studentName;     /* The student's name           */
    private int studentID;          /* The student's ID number      */
    private double creditsEarned;   /* The number of credits earned */
    private boolean paidUp;         /* Whether student is paid up   */

}
