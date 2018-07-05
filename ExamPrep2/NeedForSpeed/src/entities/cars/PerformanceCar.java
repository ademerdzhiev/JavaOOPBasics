package entities.cars;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PerformanceCar extends Car {
    private List<String> addOns;

    public PerformanceCar(String brand, String model,
                          int yearOfProduction, int horsePower,
                          int acceleration, int suspension,
                          int durability) {
        super(brand, model, yearOfProduction, horsePower, acceleration, suspension, durability);

        this.addOns = new ArrayList<>();
    }


    public List<String> getAddOns() {
        return addOns;
    }

    public void setAddOns(List<String> addOns) {
        this.addOns = addOns;
    }

    public void setAddOns(String addOns) {
        this.addOns.add(addOns);
    }

//    @Override
//    public void increase() {
//        this.setHorsePower(this.getHorsePower() + this.getHorsePower()/2);
//    }
//
//    @Override
//    public void decrease() {
//        this.setSuspension(this.getSuspension() - this.getSuspension()/4);
//    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());

        if (addOns.isEmpty()) {
            sb.append("None");
        } else {
            for (String addon : addOns) {
                sb.append(addon).append(", ");
            }
            sb.delete(sb.length() - 2, sb.length());
        }

        sb.append("/n");

        return sb.toString();
    }
}
