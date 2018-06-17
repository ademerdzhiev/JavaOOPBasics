package ex8;

import java.util.LinkedList;
import java.util.List;

public class Trainer {
    private String trainerName;
    private List<Pokemon> pokemons;
    private Integer badges;

    public Trainer(String trainerName) {
        this.trainerName = trainerName;
        this.pokemons = new LinkedList<>();
        this.badges = 0;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(Pokemon pokemon) {
        this.pokemons.add(pokemon);
    }

    public int getBadges() {
        return badges;
    }

    public void setBadges() {
        this.badges = this.badges + 1;
    }

    public void removePokemons() {
        if (pokemons.size()> 0) {
            for (Pokemon pokemon : pokemons) {
                if (pokemon.getHealth() <= 0) {
                    pokemons.remove(pokemon);
                }
            }
        }
    }

    public boolean checkElement(String element) {
        for (Pokemon pokemon: pokemons) {
            if (pokemon.getElement().equals(element)) {
                return true;
            }
        }

        return false;
    }

//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append(this.getTrainerName()).append(" ").append(this.getBadges()).append(" ").append(this.getPokemons().size());
//        return sb.toString();
//    }
}
