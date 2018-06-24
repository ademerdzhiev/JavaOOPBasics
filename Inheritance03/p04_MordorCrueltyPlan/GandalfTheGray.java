package p04_MordorCrueltyPlan;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class GandalfTheGray {
    private String mood;
    private int happinessPoints;

    private List<FavouriteFoods> favouriteFoods;
    private List<OtherFoods> otherFoods;

    public GandalfTheGray() {
        this.mood = "";
        this.happinessPoints = -1;
        this.favouriteFoods = new LinkedList<>();
        this.otherFoods = new LinkedList<>();

    }

    public int getHappinessPoints() {
        return happinessPoints;
    }

    public void setHappinessPoints() {
        happinessPoints = 0;

        for (FavouriteFoods favoutiteFood : favouriteFoods) {
            happinessPoints += FavouriteFoods.getFavouriteFoodsMap().get(favoutiteFood.getFoodName());
        }

        for  (OtherFoods otherFood : otherFoods) {
            happinessPoints += otherFood.getHappinessPoints();
        }

        this.happinessPoints = happinessPoints;
    }

    public List<FavouriteFoods> getFavouriteFoods() {
        return favouriteFoods;
    }

    public void setFavouriteFoods(FavouriteFoods favouriteFoods) {
        this.favouriteFoods.add(favouriteFoods);
    }

    public List<OtherFoods> getOtherFoods() {
        return otherFoods;
    }

    public void setOtherFoods(OtherFoods otherFoods) {
        this.otherFoods.add(otherFoods);
    }

    public String getMood() {
        return mood;
    }

    public void setMood() {
        if (this.getHappinessPoints() < -5) {
            this.mood = "Angry";
        }

        if (this.getHappinessPoints() >= -5 && this.getHappinessPoints() <= 0) {
            this.mood = "Sad";
        }

        if (this.getHappinessPoints() > 0 && this.getHappinessPoints() <= 15) {
            this.mood = "Happy";
        }
        if (this.getHappinessPoints() > 15) {
            this.mood = "JavaScript";
        }
    }
}
