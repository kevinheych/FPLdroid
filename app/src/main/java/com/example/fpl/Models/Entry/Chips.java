package com.example.fpl.Models.Entry;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Chips implements Serializable {
    @Expose
    @SerializedName("event")
    private int event;
    @Expose
    @SerializedName("time")
    private String time;
    @Expose
    @SerializedName("name")
    private String name;

    public int getEvent() {
        return event;
    }

    public void setEvent(int event) {
        this.event = event;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
