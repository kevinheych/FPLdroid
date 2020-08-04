package com.example.fpl.Fragments;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fpl.R;
import com.example.fpl.data.PlayerItem;
import com.example.fpl.data.model.Standings.Results;
import com.thoughtbot.expandablerecyclerview.ExpandableRecyclerViewAdapter;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

public class LeagueStandingAdapter extends ExpandableRecyclerViewAdapter<LeagueEntryViewHolder, LeaguePlayerListViewHolder> {

private List<Results>   entries;
    public LeagueStandingAdapter(List<? extends ExpandableGroup> groups, List<Results> entries) {
        super(groups);
this.entries = entries;

    }

    @Override
    public int getItemCount() {

        return super.getItemCount();
    }


    @Override
    public LeagueEntryViewHolder onCreateGroupViewHolder(ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.league_standing_entrytitle, parent, false);
        return new LeagueEntryViewHolder(view);
    }

    @Override
    public LeaguePlayerListViewHolder onCreateChildViewHolder(ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.league_standing_teamlist, parent, false);
        return new LeaguePlayerListViewHolder(view);
    }

    @Override
    public void onBindChildViewHolder(LeaguePlayerListViewHolder holder, int flatPosition, ExpandableGroup group, int childIndex) {
        final PlayerItem playerItem = (PlayerItem) group.getItems().get(childIndex);
        holder.setItem(playerItem);
    }

    @Override
    public void onBindGroupViewHolder(LeagueEntryViewHolder holder, int flatPosition, ExpandableGroup group) {
            holder.setViews(group.getTitle(), entries);
    }
}
