package p02_VehiclesExtension;

import java.text.DecimalFormat;

public class Bus extends Vehicle{

    public Bus(Double fuelQuantity, Double consumptionFuel, Double tankCapacity) {
        super(fuelQuantity, consumptionFuel, tankCapacity);
    }


    public void drive(Double distance, boolean isBusEmpty) {
        if (isBusEmpty) {
            super.drive(distance);
        } else {

            if (this.summerConsupmtion()*distance > this.getFuelQuantity()) {
                throw new IllegalArgumentException(this.getClass().getSimpleName()+ " needs refueling");
            }

            this.setFuelQuantity(this.getFuelQuantity() - this.summerConsupmtion()*distance);

            DecimalFormat decimalFormat = new DecimalFormat("0.##");
            String result = decimalFormat.format(Double.valueOf(distance));

            System.out.println(this.getClass().getSimpleName() + " travelled "+ result +" km");
        }


    }





    @Override
    Double summerConsupmtion() {
        return this.getConsumptionFuel() + 1.4;
    }
}
