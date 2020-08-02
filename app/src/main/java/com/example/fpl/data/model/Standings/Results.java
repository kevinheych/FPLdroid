package com.example.fpl.data.model.Standings;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Results {
    @Expose
    @SerializedName("entry_name")
    private String entry_name;
    @Expose
    @SerializedName("entry")
    private int entry;
    @Expose
    @SerializedName("total")
    private int total;
    @Expose
    @SerializedName("rank_sort")
    private int rank_sort;
    @Expose
    @SerializedName("last_rank")
    private int last_rank;
    @Expose
    @SerializedName("rank")
    private int rank;
    @Expose
    @SerializedName("player_name")
    private String player_name;
    @Expose
    @SerializedName("event_total")
    private int event_total;
    @Expose
    @SerializedName("id")
    private int id;

    public String getEntry_name() {
        return entry_name;
    }

    public void setEntry_name(String entry_name) {
        this.entry_name = entry_name;
    }

    public int getEntry() {
        return entry;
    }

    public void setEntry(int entry) {
        this.entry = entry;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getRank_sort() {
        return rank_sort;
    }

    public void setRank_sort(int rank_sort) {
        this.rank_sort = rank_sort;
    }

    public int getLast_rank() {
        return last_rank;
    }

    public void setLast_rank(int last_rank) {
        this.last_rank = last_rank;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getPlayer_name() {
        return player_name;
    }

    public void setPlayer_name(String player_name) {
        this.player_name = player_name;
    }

    public int getEvent_total() {
        return event_total;
    }

    public void setEvent_total(int event_total) {
        this.event_total = event_total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "\nResults{" +
                "\nentry_name='" + entry_name + '\'' +
                ", \nentry=" + entry +
                ", \ntotal=" + total +
                ", \nrank_sort=" + rank_sort +
                ", \nlast_rank=" + last_rank +
                ", \nrank=" + rank +
                ", \nplayer_name='" + player_name + '\'' +
                ", \nevent_total=" + event_total +
                ", \nid=" + id +
                '}';
    }
}
