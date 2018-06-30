package p03_WildFarm;

public abstract class Animal {
    private String animalName;
    private Double animalWeight;
    private Integer foodEaten;

    abstract void makeSound();
    abstract void eat(Food food);

    public Animal(String animalName, Double animalWeight) {
        this.setAnimalName(animalName);
        this.setAnimalWeight(animalWeight);
        this.foodEaten = 0;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public Double getAnimalWeight() {
        return animalWeight;
    }

    public void setAnimalWeight(Double animalWeight) {
        this.animalWeight = animalWeight;
    }

    public Integer getFoodEaten() {
        return foodEaten;
    }

    public void setFoodEaten(Integer foodEaten) {
        this.foodEaten = foodEaten;
    }


}
