package p03_Mankind;

public class Worker extends Human{
    private double weekSalary;
    private double workingHours;

    public Worker(String firstName, String lastName, double weekSalary, double workingHours) {
        super(firstName, lastName);
        this.setWeekSalary(weekSalary);
        this.testWorkingHours(workingHours);
    }

    public double getWeekSalary() {
        return weekSalary;
    }

    private void setWeekSalary(double weekSalary) {
        this.testWeekSalary(weekSalary);
        this.weekSalary = weekSalary;
    }

    public double getWorkingHours() {
        return workingHours;
    }

    private void setWorkingHours(double workingHours) {
        this.testWorkingHours(workingHours);
        this.workingHours = workingHours;
    }


    private void testWorkingHours(double workingHours) {
        if (workingHours < 1 || workingHours > 12) {
            throw new IllegalArgumentException("Expected value mismatch!Argument: workHoursPerDay");
        }
    }

    private void testWeekSalary (double weekSalary) {
        if (weekSalary < 10) {
            throw new IllegalArgumentException("Expected value mismatch!Argument: weekSalary");
        }
    }

    private double calculateSalaryPerHour () {
        return this.weekSalary/(workingHours*7);
    }

    @Override
    public void testLastName(String lastName){
        Character firstLetter = lastName.charAt(0);
        if (Character.isLowerCase(firstLetter)) {
            throw new IllegalArgumentException("Expected upper case letter!Argument: lastName");
        }

        if (lastName.length() < 3) {
            throw new IllegalArgumentException("Expected length more than 3 symbols!Argument: lastName");
        }
    }

    @Override
    public String toString() {
        super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("Week Salary: ").append(this.getWeekSalary()).append(System.lineSeparator());
        sb.append("Hours per day: ").append(this.getWorkingHours()).append(System.lineSeparator());
        sb.append("Salary per hour: ").append(this.calculateSalaryPerHour()).append(System.lineSeparator());
        return sb.toString();
    }

}
