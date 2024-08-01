package infra.repository.fileConverse;

import domain.Game.Game;
import fileSystem.FileConverse;

import java.util.ArrayList;
import java.util.Collection;

public class GameFileConverse implements FileConverse<Game> {

    @Override
    public Game generate(String... args) {
        return new Game(args);
    }

    @Override
    public Collection<Game> all(Collection<String[]> dataset) {
        Collection<Game> games = new ArrayList<>();
        dataset.forEach(game -> games.add(generate(game)));
        return games;
    }
}
