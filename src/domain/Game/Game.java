package domain.Game;

import fileSystem.ObjectConvert;

import java.time.LocalDateTime;

public class Game implements ObjectConvert<Game> {

    private Long id;
    private String title;
    private String publisher;
    private LocalDateTime release;
    private String category;

    public Game(){}

    public Game(Long id, String title, String publisher, LocalDateTime release, String category) {
        this.id = id;
        this.title = title;
        this.publisher = publisher;
        this.release = release;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public LocalDateTime getRelease() {
        return release;
    }

    public void setRelease(LocalDateTime release) {
        this.release = release;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return String.format("%d;%s;%s;%s;%s", id, title, publisher, release, category);
    }

    @Override
    public Game fromString(String... args) {
        return new Game(Long.parseLong(args[0]), args[1], args[2], LocalDateTime.parse(args[3]), args[4]);
    }
}
