package com.example.fpl.data;

import com.example.fpl.data.model.Standings.Results;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

public class LeagueEntryModel extends ExpandableGroup<PlayerItem> {

    private Results entry;


    public LeagueEntryModel(Results entry, List<PlayerItem> items) {
        super(entry.getPlayer_name(), items);
        this.entry = entry;
    }

    public int getRank() {
        return entry.getRank();
    }
}


