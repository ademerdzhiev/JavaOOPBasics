package p03_Ferarri;

import java.lang.instrument.IllegalClassFormatException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);




        try {
            String driverName = scanner.nextLine();
            Ferrari ferrari = new Ferrari_488_Spider(new Driver(driverName));
            System.out.println(ferrari.toString());
            String ferrariName = Ferrari.class.getSimpleName();
            String carInterface = I_Car.class.getSimpleName();
            boolean isCreated = I_Car.class.isInterface();

            if (!isCreated) {
                throw new IllegalClassFormatException("No interface created!");
            }

        } catch (IllegalClassFormatException icfe) {
            System.out.println(icfe.getMessage());
        }


    }
}
