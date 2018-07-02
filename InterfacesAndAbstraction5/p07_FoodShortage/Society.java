package p07_FoodShortage;

public abstract class Society implements IControl, IBuyer{
    private String id;
    private String birthDate;
    private Integer food;
    private Integer age;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }


    public String getBirthDate() {
        return birthDate;
    }


    public void setId(String id) {
        this.id = id;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getFood() {
        return food;
    }

    public void setFood(Integer food) {
        this.food = food;
    }

    @Override
    public boolean idControl(String endingNums) {
        if (this.getId().endsWith(endingNums)) {
            System.out.println(this.getId());
            return true;
        }

        return false;
    }

    @Override
    public boolean birthDateControl(String year) {
        String[] birthYear = this.getBirthDate().split("/");

        if (birthYear[2].equals(year)) {
            System.out.println(this.getBirthDate());
        }

        return false;
    }


}
