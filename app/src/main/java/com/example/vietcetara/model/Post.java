package com.example.vietcetara.model;

import java.io.Serializable;

public class Post implements Serializable {
    private String image;
    private String content;
    private String description;
    private String author;

    public Post(String image, String content, String description, String author, String topic) {
        this.image = image;
        this.content = content;
        this.description = description;
        this.author = author;
        this.topic = topic;
    }

    public Post() {
    }

    private String topic;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
