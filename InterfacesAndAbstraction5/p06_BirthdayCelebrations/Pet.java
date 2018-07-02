package p06_BirthdayCelebrations;

public class Pet extends Society{
    private String name;

    public Pet(String name, String birthDate) {
        this.name = name;
        this.setBirthDate(birthDate);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
