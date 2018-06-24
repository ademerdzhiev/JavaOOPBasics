package p04_MordorCrueltyPlan;

public class OtherFoods extends FavouriteFoods{
    private Integer happinessPoints = -1;

    public OtherFoods(String foodName) {
        super(foodName);
    }

    @Override
    public Integer getHappinessPoints() {
        return happinessPoints;
    }


    @Override
    protected void testFoodName(String foodName) {
        if (getFavouriteFoodsMap().containsKey(foodName.toLowerCase())) {
            throw new IllegalArgumentException();
        }
    }
}
