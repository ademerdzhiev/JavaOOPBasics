package p08_MilitaryElite;

import java.util.LinkedList;
import java.util.List;

public abstract class SpecialisedSoldier extends Soldier implements ISpecialisedSoldier{
    private String corps;




    public SpecialisedSoldier(Integer id, String fisrtName, String lastName, Double salary, String corps) {
        super(id, fisrtName, lastName, salary);
        this.setCorps(corps);
    }

    public String getCorps() {
        return corps;
    }

    public void setCorps(String corps) {

            this.checkCorpsValidity(corps);
            this.corps = corps;
        }

    @Override
    public void checkCorpsValidity(String corps) {
        if (!corpsList.contains(corps)) {
            throw new IllegalArgumentException("");
        }
    }
}
