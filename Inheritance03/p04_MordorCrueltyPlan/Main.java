package p04_MordorCrueltyPlan;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] foods = bufferedReader.readLine().split("\\s+");
            FavouriteFoods.setFoods();

            GandalfTheGray gandalf = new GandalfTheGray();

            for (String food :  foods) {
                if (FavouriteFoods.getFavouriteFoodsMap().containsKey(food.toLowerCase())) {
                    FavouriteFoods favouriteFood = new FavouriteFoods(food.toLowerCase());
                    favouriteFood.setHappinessPoints();
                    gandalf.setFavouriteFoods(favouriteFood);
                } else if (!FavouriteFoods.getFavouriteFoodsMap().containsKey(food.toLowerCase())) {
                    OtherFoods otherFood = new OtherFoods(food.toLowerCase());
                    gandalf.setOtherFoods(otherFood);
                }
            }

            gandalf.setHappinessPoints();
            gandalf.setMood();
            System.out.println(gandalf.getHappinessPoints());

            System.out.println(gandalf.getMood());

        } catch (IllegalArgumentException iae) {

        }
    }
}
