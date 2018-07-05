package entities.races;

import entities.cars.Car;

import java.util.List;

public class Race {
    private Integer length;
    private String route;
    private Integer prizePool;
    private List<Car> participants;

    protected Race(Integer length, String route, Integer prizePool, List<Car> participants) {
        this.length = length;
        this.route = route;
        this.prizePool = prizePool;
        this.participants = participants;
    }

//    public Integer getLength() {
//        return length;
//    }
//
//    public void setLength(Integer length) {
//        this.length = length;
//    }
//
//    public String getRoute() {
//        return route;
//    }
//
//    public void setRoute(String route) {
//        this.route = route;
//    }
//
//    public Integer getPrizePool() {
//        return prizePool;
//    }
//
//    public void setPrizePool(Integer prizePool) {
//        this.prizePool = prizePool;
//    }
//
//    public List<Car> getParticipants() {
//        return participants;
//    }
//
//    public void setParticipants(List<Car> participants) {
//        this.participants = participants;
//    }
//
//    public void setParticipants(Car participant) {
//
//        this.participants.add(participant);
//    }

    @Override
    public String toString() {
        return super.toString();
    }
}


