package p02_VehiclesExtension;

import java.text.DecimalFormat;

public class Car extends Vehicle {

    public Car(Double fuelQuantity, Double consumptionFuel, Double tankCapacity) {
        super(fuelQuantity, consumptionFuel, tankCapacity);
    }

    @Override
    public void emptyTankTest(Double distance) {
        if (this.summerConsupmtion()*distance > this.getFuelQuantity()) {
            throw new IllegalArgumentException(this.getClass().getSimpleName()+ " needs refueling");
        }
    }

    @Override
    public void consumeFuel(Double distance) {
        this.setFuelQuantity(this.getFuelQuantity() - this.summerConsupmtion()*distance);
    }

    @Override
    public Double summerConsupmtion() {
        return this.getConsumptionFuel() + 0.9;
    }

    @Override
    public void refuel(Double fuel) {
        super.refuel(fuel);
    }

    @Override
    public void drive(Double distance) {
        super.drive(distance);
    }
}
