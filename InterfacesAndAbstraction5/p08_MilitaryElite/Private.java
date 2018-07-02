package p08_MilitaryElite;

import java.text.DecimalFormat;

public class Private extends Soldier implements IPrivate {

    public Private(Integer id, String fisrtName, String lastName, Double salary) {
        super(id, fisrtName, lastName, salary);
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");

        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(this.getFisrtName()).append(" ").append(this.getLastName()).append(" ")
                .append("Id: ").append(this.getId()).append(" ").append("Salary: ").append(String.format("%.2f",this.getSalary()))
                .append("\n");
        return sb.toString();
    }
}
