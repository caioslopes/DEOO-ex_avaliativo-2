import domain.Game.Game;
import domain.User.User;
import infra.repository.impl.GameRepository;
import infra.repository.impl.UserRepository;

import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Storage User
        UserRepository userRepository = new UserRepository();
        User user1 = new User(1L, "Ednilson", "ednilson@gmail.com", "bersaneti");
        User user2 = new User(3L, "Nunes", "ednilson@gmail.com", "servlet");
        User user3 = new User(5L, "Furquim", "ednilson@gmail.com", "linux");
        User user4 = new User(7L, "Ricardo", "ednilson@gmail.com", "trycath");
        User user5 = new User(9L, "Marcelo", "ednilson@gmail.com", "treads");

        userRepository.saveAll(List.of(user1, user2, user3, user4, user5));

        System.out.println(userRepository.find(1L));

        //Storage Game
        GameRepository gameRepository = new GameRepository();
        Game game1 = new Game(11L, "Super Mario Bros", "Nintendo", LocalDateTime.of(1987, 5, 13, 0,0,0), "Plataforma");
        Game game2 = new Game(13L, "Sonic the Hedgehog", "Sega", LocalDateTime.of(1991, 6, 23, 0,0,0), "Plataforma");
        Game game3 = new Game(15L, "Mega Man", "Capcom", LocalDateTime.of(1987, 12, 17, 0,0,0), "Plataforma");
        Game game4 = new Game(17L, "Castlevania", "Konami", LocalDateTime.of(1986, 9, 26, 0,0,0), "Plataforma");
        Game game5 = new Game(19L, "Mortal Kombat", "Midway", LocalDateTime.of(1992, 5, 13, 0,0,0), "Luta");

        gameRepository.saveAll(List.of(game1, game2, game3, game4, game5));

        System.out.println(gameRepository.find(19L));
    }
}