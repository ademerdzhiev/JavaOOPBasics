package p08_MilitaryElite;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Formatter;
import java.util.LinkedList;
import java.util.List;

public class LeutenantGeneral extends Soldier implements ILeutenantGeneral{
    List<Private> privates;

    public LeutenantGeneral(Integer id, String fisrtName, String lastName, Double salary) {
        super(id, fisrtName, lastName, salary);
        this.privates = new LinkedList<>();
    }

    public List<Private> getPrivates() {
        return privates;
    }

    public void setPrivates(Private privates) {

        this.privates.add(privates);

        this.privates.sort((pr1, pr2) -> pr2.getId().compareTo(pr1.getId()));
    }


    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");

        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(this.getFisrtName()).append(" ").append(this.getLastName()).append(" ")
                .append("Id: ").append(this.getId()).append(" ").append("Salary: ").append(String.format("%.2f",this.getSalary()))
                .append("\n");

        sb.append("Privates:").append("\n");
        for (Private privateSoldier: privates) {
            sb.append("  ").append(privateSoldier.toString());
        }

        return sb.toString();
    }
}
