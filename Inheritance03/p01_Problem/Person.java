package p01_Problem;

public class Person {
    protected String name;
    protected int age;

    public Person() {
        this.name = "";
        this.age = -1;
    }

    public Person(String name) {
        testName(name);
        this.name = name;
        this.age = -1;
    }

    public Person(String name, int age) {
        testName(name);
        testAge(age);


        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        testName(name);
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        testAge(age);
        this.age = age;
    }

    public static void testName(String name) {
        if (name.length() < 3 || name.contains("\\s+")) {
            throw new IllegalArgumentException("Name's length should not be less than 3 symbols!");
        }
    }

    public static void testAge(int age) {

        if (age < 0) {
            throw new IllegalArgumentException("Age must be positive!");
        }
    }

    @Override
    public String toString() {

        return ("Name: " + this.name + ", Age: " + this.age).toString();
    }
}
