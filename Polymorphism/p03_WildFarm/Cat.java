package p03_WildFarm;

import java.text.DecimalFormat;

public class Cat extends Felime {
    private String catBreed;

    public Cat(String animalName, Double animalWeight, String livingRegion) {
        super(animalName, animalWeight, livingRegion);
    }

    public String getCatBreed() {
        return catBreed;
    }

    public void setCatBreed(String catBreed) {
        this.catBreed = catBreed;
    }


    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public void eat(Food food) {
        this.setFoodEaten(food.getQuantity());
    }

    @Override
    public String toString(){
        DecimalFormat df = new DecimalFormat("#.##");
        return this.getClass().getSimpleName() + "[" + this.getAnimalName() + ", " + this.getCatBreed() + ", " +  df.format(this.getAnimalWeight())
                + ", " + this.getLivingRegion() + ", " + (this.getFoodEaten()) + "]";
    }
}

