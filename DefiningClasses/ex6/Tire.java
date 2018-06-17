package ex6;

public class Tire {
    private int tireAge;
    private Double pressure;

    public Tire(int tireAge, Double pressure) {
        this.tireAge = tireAge;
        this.pressure = pressure;
    }

    public int getTireAge() {
        return tireAge;
    }

    public void setTireAge(int tireAge) {
        this.tireAge = tireAge;
    }

    public Double getPressure() {
        return pressure;
    }

    public void setPressure(Double pressure) {
        this.pressure = pressure;
    }
}
