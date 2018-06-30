package p02_VehiclesExtension;

import java.text.DecimalFormat;

public abstract class Vehicle {
    private Double fuelQuantity; //litres
    private Double consumptionFuel; //litres/km
    private Double tankCapacity; //litres

    abstract Double summerConsupmtion();

    public Vehicle() {
        this.fuelQuantity = -1.;
        this.consumptionFuel = -1.;
        this.tankCapacity = -1.;

    }

    public Vehicle(Double fuelQuantity, Double consumptionFuel, Double tankCapacity) {
        testFuelQuantity(fuelQuantity);

        this.fuelQuantity = fuelQuantity;
        this.setConsumptionFuel(consumptionFuel);
        this.setTankCapacity(tankCapacity);
    }

    public Double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(Double fuelQuantity) {
        this.testFuelQuantity(fuelQuantity);
        this.fuelQuantity = fuelQuantity;
    }

    public void drive(Double distance) {

        this.emptyTankTest(distance);
        this.consumeFuel(distance);

        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        String result = decimalFormat.format(Double.valueOf(distance));

        System.out.println(this.getClass().getSimpleName() + " travelled "+ result +" km");
    }


    public Double getConsumptionFuel() {
        return consumptionFuel;
    }

    public void setConsumptionFuel(Double consumptionFuel) {
        this.consumptionFuel = consumptionFuel;
    }

    public Double getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(Double tankCapacity) {

        this.tankCapacity = tankCapacity;
    }

    public void refuel(Double fuel) {
        this.testFuelQuantity(fuel);
        this.testRefuel(fuel);

        this.setFuelQuantity(this.getFuelQuantity() + fuel);
    }

    public void testFuelQuantity(double fuelQuantity) {
        if(fuelQuantity < 0 || fuelQuantity == 0) {
            throw new IllegalArgumentException("Fuel must be a positive number");
        }
    }

    public  void testRefuel (Double fuel) {
        if (this.getFuelQuantity() + fuel > this.getTankCapacity()) {
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
    }

    public void emptyTankTest (Double distance) {
        if (this.getConsumptionFuel()*distance > this.getFuelQuantity()) {
            throw new IllegalArgumentException(this.getClass().getSimpleName()+ " needs refueling");
        }
    }

    public void consumeFuel(Double distance) {
        this.setFuelQuantity(this.getFuelQuantity() - this.getConsumptionFuel()*distance);
    }

    @Override
    public String toString() {
        DecimalFormat formatter = new DecimalFormat("#0.000");
        String childClassName = this.getClass().getSimpleName();
        return (childClassName + ": " + String.format("%.2f",this.getFuelQuantity())).toString();
    }
}
