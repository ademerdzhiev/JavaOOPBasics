package entities.races;

import entities.cars.Car;

import java.util.List;

public class CasualRace extends Race {

    public CasualRace(Integer length, String route, Integer prizePool, List<Car> participants) {
        super(length, route, prizePool, participants);
    }
}
