package p01_Problem;

public class Child extends Person {

    public Child() {
        super();
    }

    public Child(String name, int age) {
        super(name);
        testAge(age);
        this.age = age;
    }


    @Override
    public void setAge(int age) {
        testAge(age);
        super.setAge(age);
    }



    public static void testAge(int age) {
        Person.testAge(age);
        if (age > 15) {
            throw new IllegalArgumentException("Child's age must be lesser than 15!");
        }
    }

}
