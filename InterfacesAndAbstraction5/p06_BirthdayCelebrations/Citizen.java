package p06_BirthdayCelebrations;

public class Citizen extends Society {
    private String name;
    private int age;

    public Citizen(String name, int age, String id, String birthDate) {
        this.name = name;
        this.age = age;
        this.setId(id);
        this.setBirthDate(birthDate);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }




}
