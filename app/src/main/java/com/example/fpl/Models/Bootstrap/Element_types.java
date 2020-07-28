package com.example.fpl.Models.Bootstrap;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Element_types implements Serializable {
    @Expose
    @SerializedName("element_count")
    private int element_count;
    @Expose
    @SerializedName("sub_positions_locked")
    private List<Integer> sub_positions_locked;
    @Expose
    @SerializedName("ui_shirt_specific")
    private boolean ui_shirt_specific;
    @Expose
    @SerializedName("squad_max_play")
    private int squad_max_play;
    @Expose
    @SerializedName("squad_min_play")
    private int squad_min_play;
    @Expose
    @SerializedName("squad_select")
    private int squad_select;
    @Expose
    @SerializedName("singular_name_short")
    private String singular_name_short;
    @Expose
    @SerializedName("singular_name")
    private String singular_name;
    @Expose
    @SerializedName("plural_name_short")
    private String plural_name_short;
    @Expose
    @SerializedName("plural_name")
    private String plural_name;
    @Expose
    @SerializedName("id")
    private int id;

    public int getElement_count() {
        return element_count;
    }

    public void setElement_count(int element_count) {
        this.element_count = element_count;
    }

    public List<Integer> getSub_positions_locked() {
        return sub_positions_locked;
    }

    public void setSub_positions_locked(List<Integer> sub_positions_locked) {
        this.sub_positions_locked = sub_positions_locked;
    }

    public boolean getUi_shirt_specific() {
        return ui_shirt_specific;
    }

    public void setUi_shirt_specific(boolean ui_shirt_specific) {
        this.ui_shirt_specific = ui_shirt_specific;
    }

    public int getSquad_max_play() {
        return squad_max_play;
    }

    public void setSquad_max_play(int squad_max_play) {
        this.squad_max_play = squad_max_play;
    }

    public int getSquad_min_play() {
        return squad_min_play;
    }

    public void setSquad_min_play(int squad_min_play) {
        this.squad_min_play = squad_min_play;
    }

    public int getSquad_select() {
        return squad_select;
    }

    public void setSquad_select(int squad_select) {
        this.squad_select = squad_select;
    }

    public String getSingular_name_short() {
        return singular_name_short;
    }

    public void setSingular_name_short(String singular_name_short) {
        this.singular_name_short = singular_name_short;
    }

    public String getSingular_name() {
        return singular_name;
    }

    public void setSingular_name(String singular_name) {
        this.singular_name = singular_name;
    }

    public String getPlural_name_short() {
        return plural_name_short;
    }

    public void setPlural_name_short(String plural_name_short) {
        this.plural_name_short = plural_name_short;
    }

    public String getPlural_name() {
        return plural_name;
    }

    public void setPlural_name(String plural_name) {
        this.plural_name = plural_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
