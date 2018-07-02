package p07_FoodShortage;

public class Rebel extends Society implements IBuyer{
   private String group;

    public Rebel(String name, Integer age, String group) {
        this.group = group;
        this.setName(name);
        this.setAge(age);
        this.setFood(0);
    }


    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public void buyFood() {
        this.setFood(this.getFood() + 5);
    }
}
