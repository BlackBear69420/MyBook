package com.example.mybook.models;

public class Books {
    String title,content,type,cover;

    public Books(String title, String cover, String content, String type){
        this.title=title;
        this.cover=cover;
        this.content=content;
        this.type=type;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getType() {
        return type;
    }

    public String getCover() {
        return cover;
    }
}
