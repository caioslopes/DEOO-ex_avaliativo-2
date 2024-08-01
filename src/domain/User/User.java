package domain.User;

public class User {

    private Long id;
    private String name;
    private String email;
    private String password;

    public User(String[] string) {
        this.id = Long.parseLong(string[0]);
        this.name = string[1];
        this.email = string[2];
        this.password = string[3];
    }

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
}
