package p08_MilitaryElite;

import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.List;

public class Engineer extends SpecialisedSoldier implements IEngineer {
    private List<Repair> repairs;


    public Engineer(Integer id, String fisrtName, String lastName, Double salary, String corps) {
        super(id, fisrtName, lastName, salary, corps);
        this.repairs = new LinkedList<>();
    }

    public List<Repair> getRepairs() {
        return repairs;
    }

    public void setRepairs(String repairingObject, Double timeToRepair) {
        Repair repair = new Repair(repairingObject, timeToRepair);
        this.repairs.add(repair);
    }

    class Repair {
        private String reparingObject;
        private Double timeToRepair;

        public Repair(String reparingObject, Double timeToRepair) {
            this.reparingObject = reparingObject;
            this.timeToRepair = timeToRepair;
        }

        public String getReparingObject() {
            return reparingObject;
        }

        public void setReparingObject(String reparingObject) {
            this.reparingObject = reparingObject;
        }

        public Double getTimeToRepair() {
            return timeToRepair;
        }

        public void setTimeToRepair(Double timeToRepair) {
            this.timeToRepair = timeToRepair;
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

        sb.append("Repairs:").append("\n");
        for (Repair repair: repairs) {
            sb.append("  ").append("Part Name: ").append(repair.getReparingObject())
                    .append(" Hours Worked: ").append(df.format(repair.getTimeToRepair())).append("\n");
        }

        return sb.toString();
    }
}
