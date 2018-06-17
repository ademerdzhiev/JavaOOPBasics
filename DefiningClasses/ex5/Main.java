package ex5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Car> cars = new LinkedHashMap<>();

        int n = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < n; i++) {
            String[] input = bufferedReader.readLine().split("\\s+");

            Car car = new Car(input[0], Double.parseDouble(input[1]), Double.parseDouble(input[2]));
            cars.putIfAbsent(input[0], car);
        }

        while (true) {
            String[] drive = bufferedReader.readLine().split("\\s+");

            if (drive[0].equals("End")) {
                break;
            }

            cars.get(drive[1]).drive(Double.parseDouble(drive[2]));
        }

        cars.entrySet().stream().forEach(car -> {
            System.out.printf("%s %.2f %.0f%n"
                    ,car.getValue().getMaodel(), car.getValue().getFuelAmount(), car.getValue().getDistanceTravelled());
        });

    }

    public static boolean isNumeric(String text) {
        try {
            Double d = Double.parseDouble(text);
        } catch (NumberFormatException nmf) {
            return false;
        }
        return true;
    }
}
