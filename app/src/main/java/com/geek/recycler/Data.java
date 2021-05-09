package com.geek.recycler;

public class Data {
    private String title, description;
    private long date;

    public Data(String title, String description, long date) {
        this.title = title;
        this.description = description;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public long getDate() {
        return date;
    }
}
