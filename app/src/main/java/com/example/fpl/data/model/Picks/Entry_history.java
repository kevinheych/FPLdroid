package com.example.fpl.data.model.Picks;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Entry_history {
    @Expose
    @SerializedName("points_on_bench")
    private int points_on_bench;
    @Expose
    @SerializedName("event_transfers_cost")
    private int event_transfers_cost;
    @Expose
    @SerializedName("event_transfers")
    private int event_transfers;
    @Expose
    @SerializedName("value")
    private int value;
    @Expose
    @SerializedName("bank")
    private int bank;
    @Expose
    @SerializedName("overall_rank")
    private int overall_rank;
    @Expose
    @SerializedName("rank_sort")
    private int rank_sort;
    @Expose
    @SerializedName("rank")
    private int rank;
    @Expose
    @SerializedName("total_points")
    private int total_points;
    @Expose
    @SerializedName("points")
    private int points;
    @Expose
    @SerializedName("event")
    private int event;

    public int getPoints_on_bench() {
        return points_on_bench;
    }

    public void setPoints_on_bench(int points_on_bench) {
        this.points_on_bench = points_on_bench;
    }

    public int getEvent_transfers_cost() {
        return event_transfers_cost;
    }

    public void setEvent_transfers_cost(int event_transfers_cost) {
        this.event_transfers_cost = event_transfers_cost;
    }

    public int getEvent_transfers() {
        return event_transfers;
    }

    public void setEvent_transfers(int event_transfers) {
        this.event_transfers = event_transfers;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getBank() {
        return bank;
    }

    public void setBank(int bank) {
        this.bank = bank;
    }

    public int getOverall_rank() {
        return overall_rank;
    }

    public void setOverall_rank(int overall_rank) {
        this.overall_rank = overall_rank;
    }

    public int getRank_sort() {
        return rank_sort;
    }

    public void setRank_sort(int rank_sort) {
        this.rank_sort = rank_sort;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getTotal_points() {
        return total_points;
    }

    public void setTotal_points(int total_points) {
        this.total_points = total_points;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getEvent() {
        return event;
    }

    public void setEvent(int event) {
        this.event = event;
    }


}
