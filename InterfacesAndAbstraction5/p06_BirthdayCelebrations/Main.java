package p06_BirthdayCelebrations;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Society> societyList = new LinkedList<>();

        while (true) {
            String[] input = bufferedReader.readLine().split("\\s+");

            if (input[0].equals("End")) {
                break;
            }

            Society society;

            switch (input[0]) {
                case "Citizen":
                    society = new Citizen(input[1], Integer.parseInt(input[2]), input[3], input[4]);
                    societyList.add(society);
                    break;
                case "Pet":
                    society = new Pet(input[1], input[2]);
                    societyList.add(society);
                    break;
                case "Robot":
                    society = new Robot(input[1], input[2]);
                    societyList.add(society);
            }
        }

        String year = bufferedReader.readLine();

        for (Society society: societyList) {
            if (!society.getClass().getSimpleName().equals("Robot")) {
                society.birthDateControl(year);
            }
        }
    }
}
