package com.example.fpl.data.model.Picks;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class  UserTeam {


    @Expose
    @SerializedName("picks")
    private List<Picks> picks;
    @Expose
    @SerializedName("entry_history")
    private Entry_history entry_history;
    @Expose
    @SerializedName("automatic_subs")
    private List<Automatic_subs> automatic_subs;

    public List<Picks> getPicks() {
        return picks;
    }

    public void setPicks(List<Picks> picks) {
        this.picks = picks;
    }

    public Entry_history getEntry_history() {
        return entry_history;
    }

    public void setEntry_history(Entry_history entry_history) {
        this.entry_history = entry_history;
    }

    public List<Automatic_subs> getAutomatic_subs() {
        return automatic_subs;
    }

    public void setAutomatic_subs(List<Automatic_subs> automatic_subs) {
        this.automatic_subs = automatic_subs;
    }

    @Override
    public String toString() {
        return "UserTeam{" +
                "picks=" + picks +
                ", entry_history=" + entry_history +
                ", automatic_subs=" + automatic_subs +
                '}';
    }
}
