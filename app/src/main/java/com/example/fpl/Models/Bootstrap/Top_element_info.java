package com.example.fpl.Models.Bootstrap;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Top_element_info implements Serializable {
    @Expose
    @SerializedName("points")
    private int points;
    @Expose
    @SerializedName("id")
    private int id;

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
