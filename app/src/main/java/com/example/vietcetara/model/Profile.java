package com.example.vietcetara.model;

public class Profile {
    String image;
    String title;
    String description;
    String numberOfPost;

    public Profile(String image, String title, String description, String numberOfPost) {
        this.image = image;
        this.title = title;
        this.description = description;
        this.numberOfPost = numberOfPost;
    }

    public Profile(String image, String title, String numberOfPost) {
        this.image = image;
        this.title = title;
        this.numberOfPost = numberOfPost;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNumberOfPost() {
        return numberOfPost;
    }

    public void setNumberOfPost(String numberOfPost) {
        this.numberOfPost = numberOfPost;
    }
}
