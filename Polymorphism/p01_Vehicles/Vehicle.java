package p01_Vehicles;

import java.text.DecimalFormat;

public abstract class Vehicle {
    private Double fuelQuantity;
    private Double consumptionFuel;
    abstract  void refuel(Double fuel);
    abstract String drive(Double distance);
    abstract void summerConsupmtion(Double consumptionFuel);


    public Double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(Double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public Double getConsumptionFuel() {
        return consumptionFuel;
    }

    public void setConsumptionFuel(Double consumptionFuel) {
        this.consumptionFuel = consumptionFuel;
    }

    @Override
    public String toString() {
        DecimalFormat formatter = new DecimalFormat("#0.000");
        String childClassName = this.getClass().getSimpleName();
        return (childClassName + ": " + String.format("%.2f",this.getFuelQuantity())).toString();
    }
}
