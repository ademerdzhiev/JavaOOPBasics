package p08_MilitaryElite;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer,Soldier> soldiers = new LinkedHashMap<>();

        while (true) {
            String[] soldierInfo = bufferedReader.readLine().split("\\s+");

            if (soldierInfo[0].equals("End")) {
                break;
            }


            switch (soldierInfo[0]) {
                case "Private":
                    Private soldierP = new Private(Integer.parseInt(soldierInfo[1]),
                            soldierInfo[2],
                            soldierInfo[3],
                            Double.parseDouble(soldierInfo[4]));
                    soldiers.put(Integer.parseInt(soldierInfo[1]), soldierP);
                    break;
                case "LeutenantGeneral":
                    LeutenantGeneral soldierLG = new LeutenantGeneral(Integer.parseInt(soldierInfo[1]),
                            soldierInfo[2],
                            soldierInfo[3],
                            Double.parseDouble(soldierInfo[4]));

                    if (soldierInfo.length > 5) {
                        int count = 5;
                        while (count < soldierInfo.length) {

                            Soldier currentSoldier = soldiers.get(Integer.parseInt(soldierInfo[count]));

                            Private getCurrentPrivate = new Private(currentSoldier.getId(), currentSoldier.getFisrtName(), currentSoldier.getLastName(), currentSoldier.getSalary());

                            soldierLG.setPrivates(getCurrentPrivate);
                            count++;
                        }
                    }
                    soldiers.put(Integer.parseInt(soldierInfo[1]),soldierLG);
                    break;
                case "Engineer":
                    try {
                        Engineer soldierE = new Engineer(Integer.parseInt(soldierInfo[1]),
                                soldierInfo[2],
                                soldierInfo[3],
                                Double.parseDouble(soldierInfo[4]),
                                soldierInfo[5]);

                    if (soldierInfo.length > 6) {
                        int count = 6;

                        while (count < soldierInfo.length -1) {
                            soldierE.setRepairs(soldierInfo[count], Double.valueOf(soldierInfo[count +1]));
                            count = count + 2;
                        }
                    }

                    soldiers.put(Integer.parseInt(soldierInfo[1]), soldierE);
                    } catch (IllegalArgumentException iea) {

                    }
                    break;
                case "Commando":
                    try {
                        Commando commando = new Commando(Integer.parseInt(soldierInfo[1]),
                                soldierInfo[2],
                                soldierInfo[3],
                                Double.parseDouble(soldierInfo[4]),
                                soldierInfo[5]);


                        if (soldierInfo.length > 6) {
                            int count = 6;

                            while (count < soldierInfo.length - 1) {
                                try {
                                    commando.setMissionList(soldierInfo[count], soldierInfo[count + 1]);

                                } catch (IllegalArgumentException iae) {}
                                count = count + 2;
                            }
                        }
                        soldiers.put(Integer.parseInt(soldierInfo[1]), commando);
                    } catch (IllegalArgumentException iae) {

                    }
                    break;
                case "Spy":
                    Spy spy = new Spy(Integer.parseInt(soldierInfo[1]),
                            soldierInfo[2],
                            soldierInfo[3],
                            soldierInfo[4]);
                    soldiers.put(Integer.parseInt(soldierInfo[1]), spy);
                    break;
            }
        }

        for (Map.Entry<Integer, Soldier> soldier: soldiers.entrySet()) {
            System.out.print(soldier.getValue().toString());
        }
    }
}

