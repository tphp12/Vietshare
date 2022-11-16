package com.example.vietcetara.model;

public class Series {
    private String image;
    private String title;
    private String about;
    private String numberOfPost;

    public Series(String image, String title, String about, String numberOfPost) {
        this.image = image;
        this.title = title;
        this.about = about;
        this.numberOfPost = numberOfPost;
    }

    public Series(String image, String title, String numberOfPost) {
        this.image = image;
        this.title = title;
        this.numberOfPost = numberOfPost;
    }

    public Series() {
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

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getNumberOfPost() {
        return numberOfPost;
    }

    public void setNumberOfPost(String numberOfPost) {
        this.numberOfPost = numberOfPost;
    }
}
