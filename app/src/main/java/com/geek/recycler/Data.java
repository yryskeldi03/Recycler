package com.geek.recycler;

public class Data {
    private String title, description;
    private long date;

    public Data(){}

    public Data(String title, String description, long date) {
        this.title = title;
        this.description = description;
        this.date = date;
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

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }
}
