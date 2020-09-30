package com.example.fpl.data.model.Standings;

import androidx.annotation.Nullable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Comparator;
import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Results results = (Results) o;
        return entry == results.entry &&
                total == results.total &&
                rank_sort == results.rank_sort &&
                last_rank == results.last_rank &&
                rank == results.rank &&
                event_total == results.event_total &&
                id == results.id &&
                entry_name.equals(results.entry_name) &&
                player_name.equals(results.player_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(entry_name, entry, total, rank_sort, last_rank, rank, player_name, event_total, id);
    }

    @Override
    public String toString() {
        return "Results{" +
                "entry_name='" + entry_name + '\'' +
                ", entry=" + entry +
                ", total=" + total +
                ", rank_sort=" + rank_sort +
                ", last_rank=" + last_rank +
                ", rank=" + rank +
                ", player_name='" + player_name + '\'' +
                ", event_total=" + event_total +
                ", id=" + id +
                '}';
    }
}

