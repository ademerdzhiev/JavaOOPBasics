package ex5;

import java.util.function.DoubleBinaryOperator;

public class Car {
    private String maodel;
    private Double fuelAmount;
    private Double fuelCost;
    private Double distanceTravelled;

    public Car(String maodel, Double fuelAmount, Double fuelCost) {
        this.maodel = maodel;
        this.fuelAmount = fuelAmount;
        this.fuelCost = fuelCost;
        this.distanceTravelled = 0.0;
    }

    public String getMaodel() {
        return maodel;
    }

    public void setMaodel(String maodel) {
        this.maodel = maodel;
    }

    public Double getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(Double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public Double getFuelCost() {
        return fuelCost;
    }

    public void setFuelCost(Double fuelCost) {
        this.fuelCost = fuelCost;
    }

    public void setDistanceTravelled(Double distanceTravelled) {
        this.distanceTravelled += distanceTravelled;
    }

    public Double getDistanceTravelled() {
        return distanceTravelled;
    }

    public boolean drive(Double distanceToTravel) {

        if (this.getFuelAmount()  >= distanceToTravel* this.getFuelCost()) {
            this.setFuelAmount(this.getFuelAmount() - distanceToTravel*this.getFuelCost());
            this.setDistanceTravelled(distanceToTravel);
            return true;
        }

        System.out.println("Insufficient fuel for the drive");
        return false;
    }
}
