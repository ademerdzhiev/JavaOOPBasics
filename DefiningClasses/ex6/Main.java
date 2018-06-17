package ex6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());

        Map<String, Car> cars = new LinkedHashMap<>();

        for (int i = 0; i < n; i ++) {
            String[] car = bufferedReader.readLine().split("\\s+");

            String model = car[0];
            Integer engineSpeed = Integer.parseInt(car[1]);
            Integer enginePower = Integer.parseInt(car[2]);
            Double cargoWeight = Double.parseDouble(car[3]);
            String cargoType = car[4];

            Double tirePressure1 = Double.parseDouble(car[5]);
            int tireAge1 = Integer.parseInt(car[6]);

            Tire tire1 = new Tire(tireAge1, tirePressure1);

            Double tirePressure2 = Double.parseDouble(car[7]);
            int tireAge2 = Integer.parseInt(car[8]);

            Tire tire2 = new Tire(tireAge2, tirePressure2);

            Double tirePressure3 = Double.parseDouble(car[9]);
            int tireAge3 = Integer.parseInt(car[10]);

            Tire tire3 = new Tire(tireAge3, tirePressure3);


            Double tirePressure4 = Double.parseDouble(car[11]);
            int tireAge4 = Integer.parseInt(car[12]);

            Tire tire4 = new Tire(tireAge4, tirePressure4);

            List<Tire> tires = new LinkedList<>();
            tires.add(tire1);
            tires.add(tire2);
            tires.add(tire3);
            tires.add(tire4);

            Engine engine = new Engine(engineSpeed, enginePower);
            Cargo cargo = new Cargo(cargoType, cargoWeight);

            Car carType = new Car(model, engine, cargo, tires);

            cars.putIfAbsent(model, carType);
        }

        String cargoType = bufferedReader.readLine();
        cars.entrySet().stream()
                .filter(car -> car.getValue().getCargo().getCargoType().equals(cargoType))
                .forEach(filteredCar -> {
                    if (cargoType.equals("flamable") && filteredCar.getValue().getEngine().getEnginePower() > 250) {
                        System.out.println(filteredCar.getValue().getModel());
                    } else if (cargoType.equals("fragile") && filteredCar.getValue()
                            .getTires()
                            .stream()
                            .anyMatch(tire -> tire.getPressure() < 1.0)) {
                        System.out.println(filteredCar.getValue().getModel());
                    }
                });

    }
}
