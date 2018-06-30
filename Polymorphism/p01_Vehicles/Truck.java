package p01_Vehicles;

import java.text.DecimalFormat;

public class Truck extends Vehicle{
    @Override
    void refuel(Double fuel) {
        this.setFuelQuantity(this.getFuelQuantity() + 0.95*fuel);
    }

    @Override
    String drive(Double distance) {
        if (this.getConsumptionFuel()*distance > this.getFuelQuantity()) {
            return "Truck needs refueling";
        }

        this.setFuelQuantity(this.getFuelQuantity() - this.getConsumptionFuel()*distance);

        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        String result = decimalFormat.format(Double.valueOf(distance));

        return "Truck travelled "+ result +" km";
    }

    @Override
    void summerConsupmtion(Double consumptionFuel) {
        this.setConsumptionFuel(consumptionFuel);
        this.setConsumptionFuel(this.getConsumptionFuel() + 1.6);
    }

    public Truck(Double fuelQuantity, Double consumptionFuel) {
        this.summerConsupmtion(consumptionFuel);
        this.setFuelQuantity(fuelQuantity);
    }
}
