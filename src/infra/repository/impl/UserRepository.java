package infra.repository.impl;

import domain.User.User;
import fileSystem.FileInterpreter;
import fileSystem.FileManagement;
import infra.repository.IRepository;
import infra.fileConverse.UserFileConverse;

import java.util.Collection;

public class UserRepository implements IRepository<User, Long> {

    private final FileManagement fileManagement;
    private final FileInterpreter fileInterpreter;
    private final UserFileConverse userFileConverse;

    public UserRepository() {
        this.fileManagement = new FileManagement("./csv/user.csv");
        this.fileInterpreter = new FileInterpreter();
        this.userFileConverse = new UserFileConverse();
    }

    @Override
    public void save(User user) {
        delete(user.getId());
        fileManagement.write(user);
    }

    @Override
    public void saveAll(Collection<User> collection) {
        for (User user : collection) {
            save(user);
        }
    }

    @Override
    public User find(Long identifier) {
        Collection<User> users = findAll();
        for (User user : users) {
            if(user.getId().equals(identifier)){
                return user;
            }
        }
        return null;
    }

    @Override
    public Collection<User> findAll() {
        return userFileConverse.all(fileInterpreter.interpret(fileManagement.read(), User.class));
    }

    @Override
    public void delete(Long identifier) {
        Collection<User> users = findAll();
        fileManagement.clear();
        users.removeIf(user -> user.getId().equals(identifier));
        saveAll(users);
    }

}
