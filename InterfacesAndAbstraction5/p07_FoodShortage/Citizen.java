package p07_FoodShortage;

public class Citizen extends Society implements IBuyer{

    public Citizen(String name, int age, String id, String birthDate) {
        this.setName(name);
        this.setAge(age);
        this.setId(id);
        this.setBirthDate(birthDate);
        this.setFood(0);
    }


    @Override
    public void buyFood() {
        this.setFood(this.getFood() + 10);
    }
}
