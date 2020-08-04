package com.example.fpl.data.model.EventLive;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Stats {
    @Expose
    @SerializedName("in_dreamteam")
    private boolean in_dreamteam;
    @Expose
    @SerializedName("total_points")
    private int total_points;
    @Expose
    @SerializedName("ict_index")
    private String ict_index;
    @Expose
    @SerializedName("threat")
    private String threat;
    @Expose
    @SerializedName("creativity")
    private String creativity;
    @Expose
    @SerializedName("influence")
    private String influence;
    @Expose
    @SerializedName("bps")
    private int bps;
    @Expose
    @SerializedName("bonus")
    private int bonus;
    @Expose
    @SerializedName("saves")
    private int saves;
    @Expose
    @SerializedName("red_cards")
    private int red_cards;
    @Expose
    @SerializedName("yellow_cards")
    private int yellow_cards;
    @Expose
    @SerializedName("penalties_missed")
    private int penalties_missed;
    @Expose
    @SerializedName("penalties_saved")
    private int penalties_saved;
    @Expose
    @SerializedName("own_goals")
    private int own_goals;
    @Expose
    @SerializedName("goals_conceded")
    private int goals_conceded;
    @Expose
    @SerializedName("clean_sheets")
    private int clean_sheets;
    @Expose
    @SerializedName("assists")
    private int assists;
    @Expose
    @SerializedName("goals_scored")
    private int goals_scored;
    @Expose
    @SerializedName("minutes")
    private int minutes;

    public boolean getIn_dreamteam() {
        return in_dreamteam;
    }

    public void setIn_dreamteam(boolean in_dreamteam) {
        this.in_dreamteam = in_dreamteam;
    }

    public int getTotal_points() {
        return total_points;
    }

    public void setTotal_points(int total_points) {
        this.total_points = total_points;
    }

    public String getIct_index() {
        return ict_index;
    }

    public void setIct_index(String ict_index) {
        this.ict_index = ict_index;
    }

    public String getThreat() {
        return threat;
    }

    public void setThreat(String threat) {
        this.threat = threat;
    }

    public String getCreativity() {
        return creativity;
    }

    public void setCreativity(String creativity) {
        this.creativity = creativity;
    }

    public String getInfluence() {
        return influence;
    }

    public void setInfluence(String influence) {
        this.influence = influence;
    }

    public int getBps() {
        return bps;
    }

    public void setBps(int bps) {
        this.bps = bps;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getSaves() {
        return saves;
    }

    public void setSaves(int saves) {
        this.saves = saves;
    }

    public int getRed_cards() {
        return red_cards;
    }

    public void setRed_cards(int red_cards) {
        this.red_cards = red_cards;
    }

    public int getYellow_cards() {
        return yellow_cards;
    }

    public void setYellow_cards(int yellow_cards) {
        this.yellow_cards = yellow_cards;
    }

    public int getPenalties_missed() {
        return penalties_missed;
    }

    public void setPenalties_missed(int penalties_missed) {
        this.penalties_missed = penalties_missed;
    }

    public int getPenalties_saved() {
        return penalties_saved;
    }

    public void setPenalties_saved(int penalties_saved) {
        this.penalties_saved = penalties_saved;
    }

    public int getOwn_goals() {
        return own_goals;
    }

    public void setOwn_goals(int own_goals) {
        this.own_goals = own_goals;
    }

    public int getGoals_conceded() {
        return goals_conceded;
    }

    public void setGoals_conceded(int goals_conceded) {
        this.goals_conceded = goals_conceded;
    }

    public int getClean_sheets() {
        return clean_sheets;
    }

    public void setClean_sheets(int clean_sheets) {
        this.clean_sheets = clean_sheets;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public int getGoals_scored() {
        return goals_scored;
    }

    public void setGoals_scored(int goals_scored) {
        this.goals_scored = goals_scored;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
}
