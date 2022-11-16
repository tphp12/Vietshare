package com.example.vietcetara.model;

import java.io.Serializable;
import java.util.Date;

public class Post implements Serializable {
    private String image;
    private String title;
    private String description;
    private String author;
    private String content;
    private String like;
    private String link;
    private String topic;
    private String date;
    public Post(){
    }

    public Post(String image, String title, String description, String author, String link, String topic) {
        this.image = image;
        this.title = title;
        this.description = description;
        this.author = author;
        this.link = link;
        this.topic = topic;
    }

    public Post(String image, String title, String description, String author, String topic) {
        this.image = image;
        this.title = title;
        this.description = description;
        this.author = author;
        this.topic = topic;
    }

    public Post(String image, String title, String description, String author, String content, String like, String link, String topic, String date) {
        this.image = image;
        this.title = title;
        this.description = description;
        this.author = author;
        this.content = content;
        this.like = like;
        this.link = link;
        this.topic = topic;
        this.date = date;
    }

    public Post(String image, String title, String description, String author, String content, String like, String topic, String date) {
        this.image = image;
        this.title = title;
        this.description = description;
        this.author = author;
        this.content = content;
        this.like = like;
        this.topic = topic;
        this.date = date;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
