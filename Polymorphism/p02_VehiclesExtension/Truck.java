package p02_VehiclesExtension;

import java.text.DecimalFormat;

public class Truck extends Vehicle {


    public Truck(Double fuelQuantity, Double consumptionFuel, Double tankCapacity) {
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
    public void refuel(Double fuel) {
        super.testFuelQuantity(fuel);

        super.testRefuel(fuel);

        this.setFuelQuantity(this.getFuelQuantity() + 0.95*fuel);
    }


    @Override
    public Double summerConsupmtion() {
        return this.getConsumptionFuel() + 1.6;
    }

}
