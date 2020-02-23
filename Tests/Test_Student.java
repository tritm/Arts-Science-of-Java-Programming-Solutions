public class Test_Student {
    public static void main(String[] args){
        Student myStudent = new Student("Tri Trinh", 100);
        System.out.println("Number of credits required to graduate = " + Student.CREDITS_TO_GRADUATE);
        System.out.println("Name of this student = " + myStudent.getName());
        myStudent.setCredits(15);
        System.out.println("The number of credits earned = " + myStudent.getCredits());
        myStudent.setPaidUp(true);
        System.out.println("Paid up status of this student is: " + myStudent.getPaidUp());
        System.out.println("Description of this student: " + myStudent.toString());
    }
}
