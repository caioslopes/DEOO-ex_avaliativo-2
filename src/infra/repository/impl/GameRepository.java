package infra.repository.impl;

import domain.Game.Game;
import fileSystem.FileInterpreter;
import fileSystem.FileManagement;
import infra.repository.IRepository;
import infra.fileConverse.GameFileConverse;

import java.util.Collection;

public class GameRepository implements IRepository<Game, Long> {

    private final FileManagement fileManagement;
    private final FileInterpreter fileInterpreter;
    private final GameFileConverse gameFileConverse;

    public GameRepository() {
        this.fileManagement = new FileManagement("./csv/game.csv");
        this.fileInterpreter = new FileInterpreter();
        this.gameFileConverse = new GameFileConverse();
    }

    @Override
    public void save(Game game) {
        delete(game.getId());
        fileManagement.write(game);
    }

    @Override
    public void saveAll(Collection<Game> collection) {
        for (Game game : collection) {
            save(game);
        }
    }

    @Override
    public Game find(Long identifier) {
        Collection<Game> games = findAll();
        for (Game game : games) {
            if (game.getId().equals(identifier)) {
                return game;
            }
        }
        return null;
    }

    @Override
    public Collection<Game> findAll() {
        return gameFileConverse.all(fileInterpreter.interpret(fileManagement.read(), Game.class));
    }

    @Override
    public void delete(Long identifier) {
        Collection<Game> games = findAll();
        fileManagement.clear();
        games.removeIf(user -> user.getId().equals(identifier));
        saveAll(games);
    }
}
