package ex6;

public class Cargo {
    private String cargoType;
    private Double cargoWeight;

    public Cargo(String cargoType, Double cargoWeight) {
        this.cargoType = cargoType;
        this.cargoWeight = cargoWeight;
    }

    public String getCargoType() {
        return cargoType;
    }

    public void setCargoType(String cargoType) {
        this.cargoType = cargoType;
    }

    public Double getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(Double cargoWeight) {
        this.cargoWeight = cargoWeight;
    }
}
