package com.example.fpl.Models.Picks;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Picks {
    @Expose
    @SerializedName("is_vice_captain")
    private boolean is_vice_captain;
    @Expose
    @SerializedName("is_captain")
    private boolean is_captain;
    @Expose
    @SerializedName("multiplier")
    private int multiplier;
    @Expose
    @SerializedName("position")
    private int position;
    @Expose
    @SerializedName("element")
    private int element;

    public boolean getIs_vice_captain() {
        return is_vice_captain;
    }

    public void setIs_vice_captain(boolean is_vice_captain) {
        this.is_vice_captain = is_vice_captain;
    }

    public boolean getIs_captain() {
        return is_captain;
    }

    public void setIs_captain(boolean is_captain) {
        this.is_captain = is_captain;
    }

    public int getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(int multiplier) {
        this.multiplier = multiplier;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getElement() {
        return element;
    }

    public void setElement(int element) {
        this.element = element;
    }
}
