package entities.garage;

import entities.cars.Car;

import java.util.LinkedHashMap;
import java.util.Map;

public class Garage {
    private Map<Integer,Car> parkedCars;

    protected Garage(Map<Integer ,Car> parkedCars) {
        this.parkedCars = parkedCars;
    }

    public Garage() {
        this.parkedCars = new LinkedHashMap<>();
    }

}
