package p03_AnimalFarm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String name = bufferedReader.readLine();
        Integer age = Integer.valueOf(bufferedReader.readLine());

        try {
            Chicken chicken = new Chicken(name, age);
            chicken.producePerDay();
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }

    }
}
