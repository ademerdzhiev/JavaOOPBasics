package ex7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Engine> engines = new HashMap<>();
       // Map<String, Car> cars = new LinkedHashMap<>();

        int n = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < n; i++) {
            String[] engineStr = bufferedReader.readLine().split("\\s+");

            String engineModel = engineStr[0];
            Integer power = Integer.parseInt(engineStr[1]);

            Engine engine = new Engine(engineModel, power);

            if (engineStr.length == 3) {
                if (isNumeric(engineStr[2])) {
                    engine.setDisplacement(engineStr[2]);
                } else {
                    engine.setEfficiency(engineStr[2]);
                }
            }

            if (engineStr.length == 4) {
                engine.setDisplacement(engineStr[2]);
                engine.setEfficiency(engineStr[3]);
            }

            engines.put(engineModel, engine);
        }

        int m = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < m; i++) {
            String[] carStr = bufferedReader.readLine().split("\\s+");

            String model = carStr[0];
            Engine engine = engines.get(carStr[1]);
            Car car = new Car(model, engine);

            if (carStr.length == 3) {
                if (isNumeric(carStr[2])) {
                    car.setWeight(carStr[2]);
                } else {
                    car.setColor(carStr[2]);
                }
            }

            if (carStr.length == 4) {
                car.setWeight(carStr[2]);
                car.setColor(carStr[3]);
            }
            System.out.println(car.toString());
        }
    }

    public static boolean isNumeric(String text) {
        try {
            Integer i = Integer.parseInt(text);
        } catch (NumberFormatException nfe) {
            return false;
        }

        return true;
    }
}
