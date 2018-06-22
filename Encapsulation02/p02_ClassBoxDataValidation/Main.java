package p02_ClassBoxDataValidation;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            Double length = Double.parseDouble(bufferedReader.readLine());
            Double width = Double.parseDouble(bufferedReader.readLine());
            Double height = Double.parseDouble(bufferedReader.readLine());

            Box box = new Box(length, width, height);

            System.out.printf("%.2f%n", box.surfaceArea());
            System.out.printf("%.2f%n", box.lateralArea());
            System.out.printf("%.2f%n", box.volume());

        } catch (IllegalArgumentException are) {
            System.out.println(are.getMessage());
        }

    }
}
