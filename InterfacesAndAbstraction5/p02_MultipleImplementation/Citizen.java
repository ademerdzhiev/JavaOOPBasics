package p02_MultipleImplementation;

public class Citizen implements I_Person, I_Identifiable, I_Birthable {
    private String name;
    private int age;
    private String id;
    private String birthdate;


    public Citizen(String name, int age, String id, String birthdate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthdate = birthdate;
    }

    @Override
    public String getName() {
        return this.name;
    }

//    @Override
//    public void setName(String name) {
//        this.name = name;
//    }

    @Override
    public int getAge() {
        return age;
    }

//    @Override
//    public void setAge(int age) {
//        this.age = age;
//    }


    @Override
    public String getBirthdate() {
        return this.birthdate;
    }

//    @Override
//    public void setBirthdate(String birthdate) {
//
//    }

    @Override
    public String getId() {
        return this.id;
    }

//    @Override
//    public void setId(String id) {
//
//    }
}
