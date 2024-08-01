package infra.repository.fileConverse;

import domain.User.User;
import fileSystem.FileConverse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class UserFileConverse implements FileConverse<User> {

    @Override
    public User generate(String... args) {
        return new User(args);
    }

    @Override
    public Collection<User> all(Collection<String[]> dataset) {
        Collection<User> users = new ArrayList<>();
        dataset.forEach(user -> users.add(new User(user)));
        return users;
    }
}
