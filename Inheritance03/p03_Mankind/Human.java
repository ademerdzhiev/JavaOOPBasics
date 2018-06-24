package p03_Mankind;

public class Human {
    private String firstName;
    protected String lastName;

    public Human(String firstName, String lastName) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    private void setFirstName(String firstName) {
        testFirstName(firstName);
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    private void setLastName(String lastName) {
        testLastName(lastName);
        this.lastName = lastName;
    }

    private static void testFirstName (String firstName) {
        Character firstLetter = firstName.charAt(0);
        if (Character.isLowerCase(firstLetter)) {
            throw new IllegalArgumentException("Expected upper case letter!Argument: firstName");
        }

        if (firstName.length() < 4) {
            throw new IllegalArgumentException("Expected length at least 4 symbols!Argument: firstName");
        }
    }


    public void testLastName (String lastName) {
        Character firstLetter = lastName.charAt(0);
        if (Character.isLowerCase(firstLetter)) {
            throw new IllegalArgumentException("Expected upper case letter!Argument: lastName");
        }

        if (lastName.length() < 3) {
            throw new IllegalArgumentException("Expected length at least 3 symbols!Argument: lastName");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("First Name: ").append(this.getFirstName()).append(System.lineSeparator());
        sb.append("Last Name: ").append(this.getLastName()).append(System.lineSeparator());
        return sb.toString();
    }

}
