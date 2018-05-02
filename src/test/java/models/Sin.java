package models;

import enumerators.SinType;

import java.util.List;

public class Sin {

    private String title;
    private String author;
    private String message;
    private List<SinType> tags;
    private boolean forgiven;

    public Sin(String title, String author, String message) {
        this.title = title;
        this.author = author;
        this.message = message;
        this.forgiven = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getMessage() {
        return message;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<SinType> getTags() {
        return tags;
    }

    public void setTags(List<SinType> tags) {
        this.tags = tags;
    }

    public boolean isForgiven() {
        return forgiven;
    }

    public void setForgiven(boolean forgiven) {
        this.forgiven = forgiven;
    }


}
