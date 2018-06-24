package p03_Mankind;

public class Student extends Human {
    private String facultyNumber;

    public Student(String firstName, String lastName, String facultyNumber) {
        super(firstName, lastName);
        this.setFacultyNumber(facultyNumber);
    }

    public String getFacultyNumber() {
        return facultyNumber;
    }

    public void setFacultyNumber(String facultyNumber) {
        testFacultyNumber(facultyNumber);
        this.facultyNumber = facultyNumber;
    }

    private static void testFacultyNumber(String facultyNumber){
        if (facultyNumber.length() < 5 || facultyNumber.length() > 10) {
            throw new IllegalArgumentException("Invalid faculty number!");
        }
    }

    @Override
    public String toString(){
        super.toString();
        return ("Faculty number: " + this.getFacultyNumber() + "\n").toString();
    }
}
