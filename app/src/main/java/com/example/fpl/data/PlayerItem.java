package com.example.fpl.data;

import android.os.Parcel;
import android.os.Parcelable;
public class PlayerItem implements Parcelable {

//http://www.parcelabler.com/

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
    private int team_code; //team code for club ARS, LIV

    private boolean is_captain;
    private boolean is_vice_captain;
    private int multiplier;

    public PlayerItem() {
        this.name = "Player Name";
        this.id = 0;
        this.element_type = 0;
        this.event_points = 0;
        this.team_code = 0;
    }

    public int getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(int multiplier) {
        this.multiplier = multiplier;
    }

    public boolean isIs_captain() {
        return is_captain;
    }

    public void setIs_captain(boolean is_captain) {
        this.is_captain = is_captain;
    }

    public boolean isIs_vice_captain() {
        return is_vice_captain;
    }

    public void setIs_vice_captain(boolean is_vice_captain) {
        this.is_vice_captain = is_vice_captain;
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

    public int getTeam_code() {
        return team_code;
    }

    public void setTeam_code(int team_code) {
        this.team_code = team_code;
    }



    protected PlayerItem(Parcel in) {
        name = in.readString();
        id = in.readInt();
        element_type = in.readInt();
        event_points = in.readInt();
        team_code = in.readInt();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(id);
        dest.writeInt(element_type);
        dest.writeInt(event_points);
        dest.writeInt(team_code);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<PlayerItem> CREATOR = new Parcelable.Creator<PlayerItem>() {
        @Override
        public PlayerItem createFromParcel(Parcel in) {
            return new PlayerItem(in);
        }

        @Override
        public PlayerItem[] newArray(int size) {
            return new PlayerItem[size];
        }
    };

    @Override
    public String toString() {
        return "PlayerItem{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", element_type=" + element_type +
                ", event_points=" + event_points +
                ", team_code=" + team_code +
                '}';
    }
}
