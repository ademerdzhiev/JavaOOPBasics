package p04_MordorCrueltyPlan;

import java.util.HashMap;
import java.util.Map;

public class FavouriteFoods {
    private String foodName;
    private Integer happinessPoints;
    private static Map<String, Integer> favouriteFoodsMap;

    public static void setFoods() {
        favouriteFoodsMap = new HashMap<>();

        favouriteFoodsMap.put("cram", 2);
        favouriteFoodsMap.put("lembas", 3);
        favouriteFoodsMap.put("apple", 1);
        favouriteFoodsMap.put("melon", 1);
        favouriteFoodsMap.put("honeycake", 5);
        favouriteFoodsMap.put("mushrooms", -10);
    }

    public FavouriteFoods(String foodName) {
        this.setFoodName(foodName);
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        testFoodName(foodName);

        this.foodName = foodName;
    }

    public Integer getHappinessPoints() {
        return happinessPoints;
    }

    public void setHappinessPoints() {
        this.happinessPoints = favouriteFoodsMap.get(this.foodName);
    }

    protected static Map<String, Integer> getFavouriteFoodsMap() {
        return favouriteFoodsMap;
    }

    protected void testFoodName (String foodName) {
        if (!favouriteFoodsMap.containsKey(foodName.toLowerCase())) {
            throw new IllegalArgumentException();
        }
    }

}
