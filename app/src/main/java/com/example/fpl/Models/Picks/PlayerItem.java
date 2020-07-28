package com.example.fpl.Models.Picks;

public class PlayerItem {


    public static final int GKP = 1;
    public static final int DEF = 2;
    public static final int MID = 3;
    public static final int FWD = 4;


    public static final int ARS = 1;
    public static final int AVL = 2;
    public static final int BOU = 3;
    public static final int BHA = 4;
    public static final int BUR = 5;
    public static final int CHE = 6;
    public static final int CRY = 7;
    public static final int EVE = 8;
    public static final int LEI = 9;
    public static final int LIV = 10;
    public static final int MCI = 11;
    public static final int MUN = 12;
    public static final int NEW = 13;
    public static final int NOR = 14;
    public static final int SHU = 15;
    public static final int SOU = 16;
    public static final int TOT = 17;
    public static final int WAT = 18;
    public static final int WHU = 19;
    public static final int WOL = 20;


    private String name;
    private int id;
    private int element_type; //position gk,mid etc
    private int event_points;
    private int team_id; //team code for club ARS, LIV

    public PlayerItem() {
        this.name = "Player Name";
        this.id = 0;
        this.element_type = 0;
        this.event_points = 0;
        this.team_id = 0;
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

    public int getElement_type() {
        return element_type;
    }

    public void setElement_type(int element_type) {
        this.element_type = element_type;
    }

    public int getEvent_points() {
        return event_points;
    }

    public void setEvent_points(int event_points) {
        this.event_points = event_points;
    }

    public int getTeam_id() {
        return team_id;
    }

    public void setTeam_id(int team_id) {
        this.team_id = team_id;
    }
}
