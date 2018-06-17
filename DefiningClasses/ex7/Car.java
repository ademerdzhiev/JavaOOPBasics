package ex7;

public class Car {
    private String model;
    private Engine engine;
    private String weight;
    private String color;

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
        this.weight = "n/a";
        this.color = "n/a";
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public String  getWeight() {
        return weight;
    }

    public String getColor() {

        if (this.color.equals("")) {
            return "n/a";
        }

        return color;
    }

    @Override
    public String toString() {

            return this.getModel() + ":\n" + this.getEngine().getModel() + ":\n" + "Power: " + this.getEngine().getPower() + "\n" + "Displacement: " + this.getEngine().getDisplacement() + "\n" + "Efficiency: " + this.getEngine().getEfficiency() + "\n" + "Weight: " + this.getWeight() + "\n" + "Color: " + this.getColor();
    }
}
