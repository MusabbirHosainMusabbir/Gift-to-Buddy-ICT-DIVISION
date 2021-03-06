package com.arena.gifttobuddy.Models;

public class TrendingTopItems {
    int id;
    String image;
    String name,location,time;

    public TrendingTopItems(int id,String image, String name, String location, String time) {
        this.id = id;
        this.image = image;
        this.name = name;
        this.location = location;
        this.time = time;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
