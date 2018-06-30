package p03_WildFarm;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Animal> animals = new LinkedList<>();

        String[] animalInfo = scanner.nextLine().split("\\s+");


        while (!animalInfo[0].equals("End")) {
            String[] foodInfo = scanner.nextLine().split("\\s+");

            String animalType = animalInfo[0];
            String animalName = animalInfo[1];
            Double weightAnimal = Double.parseDouble(animalInfo[2]);
            String area = animalInfo[3];

            Food food = null;
            String foodType = foodInfo[0];
            Integer foodQuantity = Integer.valueOf(foodInfo[1]);

            if (foodType.equals("Vegetable")) {
                food = new Vegetable(foodQuantity);
            } else if (foodType.equals("Meat")) {
                food = new Meat(foodQuantity);

            }

            switch (animalType.toLowerCase()) {
                case "cat":
                    try {
                        Cat cat = new Cat(animalName, weightAnimal, area);
                        cat.setCatBreed(animalInfo[4]);
                        cat.makeSound();
                        cat.eat(food);
                        animals.add(cat);
                    } catch (IllegalArgumentException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;

                case "tiger":
                    try {
                        Tiger tiger = new Tiger(animalName, weightAnimal, area);
                        animals.add(tiger);
                        tiger.makeSound();
                        tiger.eat(food);
                    } catch (IllegalArgumentException iae) {
                        System.out.println(iae.getMessage());
                    }

                    break;
                case "zebra":
                    try {
                    Zebra zebra = new Zebra(animalName, weightAnimal, area);
                        animals.add(zebra);
                        zebra.makeSound();
                        zebra.eat(food);
                    } catch (IllegalArgumentException iae) {
                        System.out.println(iae.getMessage());
                    }
                    break;
                case "mouse":
                    try {
                        Mouse mouse = new Mouse(animalName, weightAnimal, area);
                        mouse.makeSound();
                        animals.add(mouse);

                        mouse.eat(food);
                    } catch (IllegalArgumentException iae) {
                        System.out.println(iae.getMessage());
                    }
                    break;
            }

            animalInfo = scanner.nextLine().split("\\s+");
        }


        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}
