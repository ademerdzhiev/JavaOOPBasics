package p08_MilitaryElite;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public interface ISpecialisedSoldier {
    List<String> corpsList = new LinkedList<>(Arrays.asList("Airforces", "Marines"));

    public void checkCorpsValidity(String corps);

}
