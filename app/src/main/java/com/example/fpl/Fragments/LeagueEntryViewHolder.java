package com.example.fpl.Fragments;

import android.view.View;
import android.widget.TextView;

import com.example.fpl.R;
import com.example.fpl.data.model.Standings.Results;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;
import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;

import java.util.List;

public class LeagueEntryViewHolder extends GroupViewHolder {

    private TextView teamName;
    private TextView rankTV;
    private TextView gwPoints;
    private TextView totalPoints;
    private TextView managerName;

    public LeagueEntryViewHolder(View itemView) {
        super(itemView);
        teamName = itemView.findViewById(R.id.entryTV);
        rankTV = itemView.findViewById(R.id.rankTV);
        gwPoints = itemView.findViewById(R.id.gwPoints);
        totalPoints = itemView.findViewById(R.id.totalPoints);
        managerName = itemView.findViewById(R.id.entryTV2);
    }

    public void setViews(String name, List<Results> entries) {

        Results entry = entries.stream()
                .filter(p -> name.equals(p.getPlayer_name()))
                .findFirst()
                .orElse(null);


        teamName.setText(entry.getEntry_name());
        rankTV.setText(String.valueOf(entry.getRank()));
        gwPoints.setText(String.valueOf(entry.getEvent_total()));
        totalPoints.setText(String.valueOf(entry.getTotal()));
        managerName.setText(entry.getPlayer_name());
    }

}
