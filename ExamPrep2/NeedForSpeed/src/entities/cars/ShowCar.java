package entities.cars;

public class ShowCar extends Car {
    private Integer stars;

    public ShowCar(String brand, String model, int yearOfProduction, int horsePower, int acceleration,
                   int suspension, int durability) {
        super(brand, model, yearOfProduction, horsePower, acceleration, suspension, durability);
        this.stars = 0;
    }

    public Integer getStars() {
        return stars;
    }

    public void setStars(Integer stars) {
        this.stars = stars;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());

        sb.append(this.getStars()).append(" *");
        sb.append("/n");

        return sb.toString();
    }
}
