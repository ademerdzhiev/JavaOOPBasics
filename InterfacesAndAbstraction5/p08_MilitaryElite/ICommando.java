package p08_MilitaryElite;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public interface ICommando {
    List<String> missionStates = new LinkedList<>(Arrays.asList("inProgress", "Finished"));

    public void CompleteMission(Commando.Mission mission);
}
