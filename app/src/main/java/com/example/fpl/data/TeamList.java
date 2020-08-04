package com.example.fpl.data;

import java.util.List;

public class TeamList {

    public static final int GK = 0;
    public static final int DEF = 1;
    public static final int MID = 2;
    public static final int FWD = 3;
    public static final int BENCH = 4;


    List<PlayerItem> playersList;
    int listType;

    public TeamList(List<PlayerItem> playersList, int type) {
        this.playersList = playersList;
        this.listType = type;
    }

    public List<PlayerItem> getPlayersList() {
        return playersList;
    }

    public void setPlayersList(List<PlayerItem> playersList) {
        this.playersList = playersList;
    }

    public int getType() {
        return  listType;
    }
}
