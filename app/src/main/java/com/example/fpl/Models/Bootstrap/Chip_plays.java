package com.example.fpl.Models.Bootstrap;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Chip_plays  implements Serializable {
    @Expose
    @SerializedName("num_played")
    private int num_played;
    @Expose
    @SerializedName("chip_name")
    private String chip_name;

    public int getNum_played() {
        return num_played;
    }

    public void setNum_played(int num_played) {
        this.num_played = num_played;
    }

    public String getChip_name() {
        return chip_name;
    }

    public void setChip_name(String chip_name) {
        this.chip_name = chip_name;
    }
}
