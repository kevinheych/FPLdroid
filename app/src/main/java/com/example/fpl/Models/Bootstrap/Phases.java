package com.example.fpl.Models.Bootstrap;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Phases implements Serializable {
    @Expose
    @SerializedName("stop_event")
    private int stop_event;
    @Expose
    @SerializedName("start_event")
    private int start_event;
    @Expose
    @SerializedName("name")
    private String name;
    @Expose
    @SerializedName("id")
    private int id;

    public int getStop_event() {
        return stop_event;
    }

    public void setStop_event(int stop_event) {
        this.stop_event = stop_event;
    }

    public int getStart_event() {
        return start_event;
    }

    public void setStart_event(int start_event) {
        this.start_event = start_event;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
