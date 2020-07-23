package com.example.fpl.Models.LiveData;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LiveData {


    @Expose
    @SerializedName("element_types")
    private List<Element_types> element_types;
    @Expose
    @SerializedName("element_stats")
    private List<Element_stats> element_stats;
    @Expose
    @SerializedName("elements")
    private List<Elements> elements;
    @Expose
    @SerializedName("total_players")
    private int total_players;
    @Expose
    @SerializedName("teams")
    private List<Teams> teams;
    @Expose
    @SerializedName("phases")
    private List<Phases> phases;
    @Expose
    @SerializedName("game_settings")
    private Game_settings game_settings;
    @Expose
    @SerializedName("events")
    private List<Events> events;

    public List<Element_types> getElement_types() {
        return element_types;
    }

    public void setElement_types(List<Element_types> element_types) {
        this.element_types = element_types;
    }

    public List<Element_stats> getElement_stats() {
        return element_stats;
    }

    public void setElement_stats(List<Element_stats> element_stats) {
        this.element_stats = element_stats;
    }

    public List<Elements> getElements() {
        return elements;
    }

    public void setElements(List<Elements> elements) {
        this.elements = elements;
    }

    public int getTotal_players() {
        return total_players;
    }

    public void setTotal_players(int total_players) {
        this.total_players = total_players;
    }

    public List<Teams> getTeams() {
        return teams;
    }

    public void setTeams(List<Teams> teams) {
        this.teams = teams;
    }

    public List<Phases> getPhases() {
        return phases;
    }

    public void setPhases(List<Phases> phases) {
        this.phases = phases;
    }

    public Game_settings getGame_settings() {
        return game_settings;
    }

    public void setGame_settings(Game_settings game_settings) {
        this.game_settings = game_settings;
    }

    public List<Events> getEvents() {
        return events;
    }

    public void setEvents(List<Events> events) {
        this.events = events;
    }
}