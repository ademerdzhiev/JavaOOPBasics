package p03_AnimalFarm;

public class Chicken {
    public String name;
    public int age;

    Chicken (String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public void setName(String name) {
        if (name.equals(null) || name.equals(" ") || name.equals("")) {
            throw new IllegalArgumentException("Name cannot be empty.");
        } else {
            this.name = name;
        }
    }

    public void setAge(int age) {
        if(age < 0 || age > 15) {
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        } else {
            this.age = age;
        }
    }


    private String calculateProductPerDay() {
        if (this.age >=0 && this.age <= 5) {
            return "2";
        } else if (this.age >= 6 && this.age <= 11) {
            return "1";
        } else {
            return "0.75";
        }
    }


    public void producePerDay() {
        System.out.printf("Chicken %s (age %d) can produce %s eggs per day.", this.name, this.age, this.calculateProductPerDay());
    }
}
