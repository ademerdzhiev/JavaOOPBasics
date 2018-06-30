package p01_Vehicles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] carInfo = scanner.nextLine().split("\\s+");
        String[] truckInfo = scanner.nextLine().split("\\s+");

        Vehicle car = new Car(Double.parseDouble(carInfo[1]), Double.parseDouble(carInfo[2]));
        Vehicle truck = new Truck(Double.parseDouble(truckInfo[1]), Double.parseDouble(truckInfo[2]));

        Integer n = Integer.valueOf(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s");

            switch (input[0]) {
                case "Drive":
                    if (input[1].equals("Car")) {
                        System.out.println(car.drive(Double.parseDouble(input[2])));
                    } else if (input[1].equals("Truck")) {
                        System.out.println(truck.drive(Double.parseDouble(input[2])));
                    }
                    break;
                case "Refuel":

                        if (input[1].equals("Car")) {

                                car.refuel(Double.parseDouble(input[2]));

                        } else if (input[1].equals("Truck")) {
                            truck.refuel(Double.parseDouble(input[2]));
                        }

                    break;
            }
        }

        System.out.println(car.toString());
        System.out.println(truck.toString());

    }
}
