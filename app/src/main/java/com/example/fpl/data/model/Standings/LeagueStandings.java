package com.example.fpl.data.model.Standings;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LeagueStandings {


    @Expose
    @SerializedName("standings")
    private Standings standings;
//    @Expose
//    @SerializedName("new_entries")
//    private New_entries new_entries;
    @Expose
    @SerializedName("league")
    private League league;

    public Standings getStandings() {
        return standings;
    }

    public void setStandings(Standings standings) {
        this.standings = standings;
    }

//    public New_entries getNew_entries() {
//        return new_entries;
//    }
//
//    public void setNew_entries(New_entries new_entries) {
//        this.new_entries = new_entries;
//    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }

    @Override
    public String toString() {
        return "LeagueStandings{" +
                "\nstandings=" + standings +
//                ", \nnew_entries=" + new_entries +
                ", \nleague=" + league +
                '}';
    }
}
