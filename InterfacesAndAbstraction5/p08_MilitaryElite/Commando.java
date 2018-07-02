package p08_MilitaryElite;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public class Commando extends SpecialisedSoldier implements ICommando {
    Map<String ,Mission> missionList;

    public Commando(Integer id, String fisrtName, String lastName, Double salary, String corps) {
        super(id, fisrtName, lastName, salary, corps);
        this.missionList = new HashMap<>();
    }


    public Map<String ,Mission> getMissionList() {
        return missionList;
    }

    public void setMissionList(String missionName, String missionStatus) {
        Mission mission = new Mission(missionName, missionStatus);
        this.missionList.put(mission.getMissionName(), mission);
    }

    class  Mission {
        private String missionName;
        private String misisonStatus;

        public Mission(String missionName, String misisonStatus) {
            this.missionName = missionName;
            this.setMisisonStatus(misisonStatus);
        }

        public String getMissionName() {
            return missionName;
        }

        public void setMissionName(String missionName) {
            this.missionName = missionName;
        }

        public String getMisisonStatus() {
            return misisonStatus;
        }

        public void setMisisonStatus(String misisonStatus) {
            if (!missionStates.contains(misisonStatus)) {
                throw new IllegalArgumentException("");

            }
            this.misisonStatus = misisonStatus;
        }
    }

    public Mission getCurrentMission(String missionName) {
        return this.getMissionList().get(missionName);
    }

    @Override
    public void CompleteMission(Mission mission) {
        if(mission.getMisisonStatus().equals("inProgress")) {
            mission.setMisisonStatus("Finished");
        }
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");

        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(this.getFisrtName()).append(" ").append(this.getLastName()).append(" ")
                .append("Id: ").append(this.getId()).append(" ").append("Salary: ").append(String.format("%.2f",this.getSalary()))
                .append("\n");

        sb.append("Corps: ").append(this.getCorps()).append("\n");
        sb.append("Missions:").append("\n");
        for (Map.Entry<String, Mission> mission : missionList.entrySet()) {
            sb.append("  ").append("Code Name: ").append(mission.getValue().getMissionName())
                    .append(" State: ").append(mission.getValue().misisonStatus).append("\n");
        }

        return sb.toString();
    }
}
