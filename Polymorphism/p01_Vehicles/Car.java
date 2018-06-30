package p01_Vehicles;

import java.text.DecimalFormat;

public class Car extends Vehicle {

    @Override
    void refuel(Double fuel) {
        this.setFuelQuantity(this.getFuelQuantity() + fuel);
    }

    @Override
    String drive(Double distance) {
        if (this.getConsumptionFuel()*distance > this.getFuelQuantity()) {
            return "Car needs refueling";
        }

        this.setFuelQuantity(this.getFuelQuantity() - this.getConsumptionFuel()*distance);

        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        String result = decimalFormat.format(Double.valueOf(distance));

        return "Car travelled "+ result +" km";
    }

    @Override
    void summerConsupmtion(Double consumptionFuel) {
        this.setConsumptionFuel(consumptionFuel);
        this.setConsumptionFuel(this.getConsumptionFuel() + 0.9);
    }

    public Car(Double fuelQuantity, Double consumptionFuel) {
        this.summerConsupmtion(consumptionFuel);
        this.setFuelQuantity(fuelQuantity);
    }
}
