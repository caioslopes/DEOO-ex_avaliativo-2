package domain.Game;

import java.time.LocalDateTime;

public class Game {

    private Long id;
    private String title;
    private String publisher;
    private LocalDateTime release;
    private String category;

    public Game(String ...arg) {
        this.id = Long.parseLong(arg[0]);
        this.title = arg[1];
        this.publisher = arg[2];
        this.release = LocalDateTime.parse(arg[3]);
        this.category = arg[4];
    }

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
}
