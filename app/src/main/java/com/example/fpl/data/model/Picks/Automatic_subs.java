package com.example.fpl.data.model.Picks;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Automatic_subs {
    @Expose
    @SerializedName("event")
    private int event;
    @Expose
    @SerializedName("element_out")
    private int element_out;
    @Expose
    @SerializedName("element_in")
    private int element_in;
    @Expose
    @SerializedName("entry")
    private int entry;

    public int getEvent() {
        return event;
    }

    public void setEvent(int event) {
        this.event = event;
    }

    public int getElement_out() {
        return element_out;
    }

    public void setElement_out(int element_out) {
        this.element_out = element_out;
    }

    public int getElement_in() {
        return element_in;
    }

    public void setElement_in(int element_in) {
        this.element_in = element_in;
    }

    public int getEntry() {
        return entry;
    }

    public void setEntry(int entry) {
        this.entry = entry;
    }
}
