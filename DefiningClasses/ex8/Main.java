package ex8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Trainer> trainers = new LinkedHashMap<>();

        while (true) {
            String[] trainerAndPokemonInfo = bufferedReader.readLine().split("\\s+");

            if (trainerAndPokemonInfo[0].equals("Tournament")) {
                break;
            }

            String trainerName = trainerAndPokemonInfo[0];
            String pokemonName = trainerAndPokemonInfo[1];
            String pokemonElement = trainerAndPokemonInfo[2];
            Integer pokemonHealth = Integer.parseInt(trainerAndPokemonInfo[3]);

            Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);

            Trainer trainer = new Trainer(trainerName);

            trainers.putIfAbsent(trainerName, trainer);
            trainers.get(trainerName).setPokemons(pokemon);

        }

        while (true) {
            String element = bufferedReader.readLine();

            if (element.equals("End")) {
                break;
            }

            trainers.entrySet().stream().forEach(trainer -> {
                if(trainer.getValue().checkElement(element)) {
                    trainer.getValue().setBadges();
                } else {
                    trainer.getValue().getPokemons().stream().forEach(pokemon -> pokemon.setHealth());
                    trainer.getValue().removePokemons();
                }
            });
        }

       trainers.entrySet().stream().sorted((tr1, tr2) -> Integer.compare(tr2.getValue().getBadges(), tr1.getValue().getBadges()))
               .forEach(trainer -> System.out.println(trainer.getValue().getTrainerName() + " "
                       + trainer.getValue().getBadges() + " " + trainer.getValue().getPokemons().size()));

    }
}
