package p05_BorderControl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Society> societyList = new LinkedList<>();

        while (true) {
            String[] input = bufferedReader.readLine().split("\\s+");

            if (input[0].equals("End")) {
                break;
            }

            Society society;

            if (input.length == 3) {
                society = new Citizen(input[2], input[0], Integer.parseInt(input[1]));
                societyList.add(society);
            } else if (input.length == 2) {
                society = new Robot(input[1], input[0]);
                societyList.add(society);
            }
        }

        String endNums = bufferedReader.readLine();

        for (Society society: societyList) {
            society.idControl(endNums);
        }
    }
}
