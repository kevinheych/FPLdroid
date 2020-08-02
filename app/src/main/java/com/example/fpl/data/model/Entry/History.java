package com.example.fpl.data.model.Entry;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class History implements Serializable {


    @Expose
    @SerializedName("chips")
    private List<Chips> chips;

    @Expose
    @SerializedName("current")
    private List<Current> current;

    public List<Chips> getChips() {
        return chips;
    }

    public void setChips(List<Chips> chips) {
        this.chips = chips;
    }



    public List<Current> getCurrent() {
        return current;
    }

    public void setCurrent(List<Current> current) {
        this.current = current;
    }
}
