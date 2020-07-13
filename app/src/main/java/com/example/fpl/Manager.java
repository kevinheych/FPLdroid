package com.example.fpl;

public class Manager {


    String player_first_name;
    String player_last_name;
    String name;
    int id;
    int summary_overall_points;
    int summary_overall_rank;
    int summary_event_points;
    int summary_event_rank;
    int current_event; //gameweek no.
    int last_deadline_bank;
    int last_deadline_value;
    int last_deadline_total_transfers;

    public Manager() {
    }

    public String getPlayer_first_name() {
        return player_first_name;
    }

    public void setPlayer_first_name(String player_first_name) {
        this.player_first_name = player_first_name;
    }

    public String getPlayer_last_name() {
        return player_last_name;
    }

    public void setPlayer_last_name(String player_last_name) {
        this.player_last_name = player_last_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSummary_overall_points() {
        return summary_overall_points;
    }

    public void setSummary_overall_points(int summary_overall_points) {
        this.summary_overall_points = summary_overall_points;
    }

    public int getSummary_overall_rank() {
        return summary_overall_rank;
    }

    public void setSummary_overall_rank(int summary_overall_rank) {
        this.summary_overall_rank = summary_overall_rank;
    }

    public int getSummary_event_points() {
        return summary_event_points;
    }

    public void setSummary_event_points(int summary_event_points) {
        this.summary_event_points = summary_event_points;
    }

    public int getSummary_event_rank() {
        return summary_event_rank;
    }

    public void setSummary_event_rank(int summary_event_rank) {
        this.summary_event_rank = summary_event_rank;
    }

    public int getCurrent_event() {
        return current_event;
    }

    public void setCurrent_event(int current_event) {
        this.current_event = current_event;
    }

    public int getLast_deadline_bank() {
        return last_deadline_bank;
    }

    public void setLast_deadline_bank(int last_deadline_bank) {
        this.last_deadline_bank = last_deadline_bank;
    }

    public int getLast_deadline_value() {
        return last_deadline_value;
    }

    public void setLast_deadline_value(int last_deadline_value) {
        this.last_deadline_value = last_deadline_value;
    }

    public int getLast_deadline_total_transfers() {
        return last_deadline_total_transfers;
    }

    public void setLast_deadline_total_transfers(int last_deadline_total_transfers) {
        this.last_deadline_total_transfers = last_deadline_total_transfers;
    }
}
