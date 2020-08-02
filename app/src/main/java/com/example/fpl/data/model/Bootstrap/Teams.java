package com.example.fpl.data.model.Bootstrap;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Teams implements Serializable {
    @Expose
    @SerializedName("pulse_id")
    private int pulse_id;
    @Expose
    @SerializedName("strength_defence_away")
    private int strength_defence_away;
    @Expose
    @SerializedName("strength_defence_home")
    private int strength_defence_home;
    @Expose
    @SerializedName("strength_attack_away")
    private int strength_attack_away;
    @Expose
    @SerializedName("strength_attack_home")
    private int strength_attack_home;
    @Expose
    @SerializedName("strength_overall_away")
    private int strength_overall_away;
    @Expose
    @SerializedName("strength_overall_home")
    private int strength_overall_home;
    @Expose
    @SerializedName("win")
    private int win;
    @Expose
    @SerializedName("unavailable")
    private boolean unavailable;
    @Expose
    @SerializedName("strength")
    private int strength;
    @Expose
    @SerializedName("short_name")
    private String short_name;
    @Expose
    @SerializedName("position")
    private int position;
    @Expose
    @SerializedName("points")
    private int points;
    @Expose
    @SerializedName("played")
    private int played;
    @Expose
    @SerializedName("name")
    private String name;
    @Expose
    @SerializedName("loss")
    private int loss;
    @Expose
    @SerializedName("id")
    private int id;
    @Expose
    @SerializedName("draw")
    private int draw;
    @Expose
    @SerializedName("code")
    private int code;

    public int getPulse_id() {
        return pulse_id;
    }

    public void setPulse_id(int pulse_id) {
        this.pulse_id = pulse_id;
    }

    public int getStrength_defence_away() {
        return strength_defence_away;
    }

    public void setStrength_defence_away(int strength_defence_away) {
        this.strength_defence_away = strength_defence_away;
    }

    public int getStrength_defence_home() {
        return strength_defence_home;
    }

    public void setStrength_defence_home(int strength_defence_home) {
        this.strength_defence_home = strength_defence_home;
    }

    public int getStrength_attack_away() {
        return strength_attack_away;
    }

    public void setStrength_attack_away(int strength_attack_away) {
        this.strength_attack_away = strength_attack_away;
    }

    public int getStrength_attack_home() {
        return strength_attack_home;
    }

    public void setStrength_attack_home(int strength_attack_home) {
        this.strength_attack_home = strength_attack_home;
    }

    public int getStrength_overall_away() {
        return strength_overall_away;
    }

    public void setStrength_overall_away(int strength_overall_away) {
        this.strength_overall_away = strength_overall_away;
    }

    public int getStrength_overall_home() {
        return strength_overall_home;
    }

    public void setStrength_overall_home(int strength_overall_home) {
        this.strength_overall_home = strength_overall_home;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public boolean getUnavailable() {
        return unavailable;
    }

    public void setUnavailable(boolean unavailable) {
        this.unavailable = unavailable;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getShort_name() {
        return short_name;
    }

    public void setShort_name(String short_name) {
        this.short_name = short_name;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getPlayed() {
        return played;
    }

    public void setPlayed(int played) {
        this.played = played;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLoss() {
        return loss;
    }

    public void setLoss(int loss) {
        this.loss = loss;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
