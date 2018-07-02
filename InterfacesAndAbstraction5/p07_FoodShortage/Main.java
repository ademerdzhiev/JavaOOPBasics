package p07_FoodShortage;

import java.io.BufferedReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer n = Integer.valueOf(scanner.nextLine());
        Integer allFood = 0;

        Map<String, Society> societySet = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");

            Society society;

            if (input.length ==3) {
                society = new Rebel(input[0], Integer.parseInt(input[1]), input[2]);
                societySet.put(input[0],society);
            } else if (input.length == 4) {
                society = new Citizen(input[0], Integer.parseInt(input[1]), input[2], input[3]);
                societySet.put(input[0],society);
            }
        }

        while (true) {
            String name = scanner.nextLine();

            if (name.equals("End")) {
                break;
            }

            if (societySet.containsKey(name)) {
                societySet.get(name).buyFood();
            }
        }

        for (Map.Entry<String, Society> societyEntry: societySet.entrySet()) {
            allFood += societyEntry.getValue().getFood();
        }

        System.out.println(allFood);
    }
}
