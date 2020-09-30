package com.example.fpl.Fragments;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fpl.R;
import com.example.fpl.data.PlayerItem;
import com.example.fpl.data.model.Standings.Results;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;

public class LeagueStandingAdapter2 extends BaseExpandableListAdapter {


    private Context _context;
    private TreeMap<Results,List<PlayerItem>> entries;
    RecyclerView recyclerView;



    public LeagueStandingAdapter2(Context _context, TreeMap<Results,List<PlayerItem>> entries) {
        this._context = _context;
        this.entries = entries;
        System.out.println("entries: " +entries);
        System.out.println(" group size" + entries.size());
        System.out.println(" child size" + entries.size());


    }


    @Override
    public int getGroupCount() {
        System.out.println("Get group size" + entries.size());
        return entries.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return 1;
    }

    @Override
    public Object getGroup(int groupPosition) {
        return this.entries.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {

        return this.entries.get(groupPosition).get(childPosition);
    }
    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        // Getting header title
        Results groupEntry = (Results) entries.keySet().toArray()[groupPosition];


        // Inflating header layout and setting text
        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) parent.getContext().
                    getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.league_standing_entry_header, null);

        }

        ConstraintLayout entry_header = (ConstraintLayout) convertView.findViewById(R.id.entry_header);
        TextView teamName = (TextView) convertView.findViewById(R.id.entryTV);
        TextView rankTV = convertView.findViewById(R.id.rankTV);
        TextView gwPoints = convertView.findViewById(R.id.gwPoints);
        TextView totalPoints = convertView.findViewById(R.id.totalPoints);
        TextView managerName = convertView.findViewById(R.id.entryTV2);

        teamName.setText(groupEntry.getEntry_name());
        rankTV.setText(String.valueOf(groupEntry.getRank()));
        gwPoints.setText(String.valueOf(groupEntry.getEvent_total()));
        totalPoints.setText(String.valueOf(groupEntry.getTotal()));
        managerName.setText(groupEntry.getPlayer_name());

        // If group is expanded then change the text into bold and change the
        // icon
        if (isExpanded) {

            teamName.setTextColor(Color.WHITE);
            rankTV.setTextColor(Color.parseColor("#e72d75"));
            totalPoints.setTextColor(Color.WHITE);
            entry_header.setBackgroundColor(Color.parseColor("#44004a"));

        } else {
            // If group is not expanded then change the text back into normal
            // and change the icon

            teamName.setTypeface(null, Typeface.NORMAL);
            teamName.setTextColor(Color.parseColor("#e72d75"));
            rankTV.setTextColor(Color.parseColor("#7739e7"));
            totalPoints.setTextColor(Color.parseColor("#37003c"));
            entry_header.setBackgroundColor(Color.parseColor("#ffffff"));
        }

        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {

        View v = convertView;
        if (v == null) {
            v = LayoutInflater.from(parent.getContext()).inflate(R.layout.childs, null  , false);
        }
        recyclerView = (RecyclerView) v.findViewById(R.id.recyclerview);
        ViewGroup.LayoutParams params = recyclerView.getLayoutParams();
        params.width = ViewGroup.LayoutParams.MATCH_PARENT;
        recyclerView.setLayoutParams(params);
        LeagueStandingChildAdapter childAdapter = new LeagueStandingChildAdapter(_context, entries, groupPosition);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(_context, 2,GridLayoutManager.VERTICAL, false);



        recyclerView.setAdapter(childAdapter);
        recyclerView.setLayoutManager(gridLayoutManager);


        return v;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }


}
