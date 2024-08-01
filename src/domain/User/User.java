package domain.User;

import fileSystem.ObjectConvert;

public class User implements ObjectConvert<User> {

    private Long id;
    private String name;
    private String email;
    private String password;

    public User(){}

    public User(Long id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return String.format("%d;%s;%s;%s", id, name, email, password);
    }

    @Override
    public User fromString(String... args) {
        return new User(Long.parseLong(args[0]), args[1], args[2], args[3]);
    }
}
