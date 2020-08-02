package com.example.fpl.ui.Fragments;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.fpl.R;
import com.example.fpl.data.model.Entry.Classic;
import com.example.fpl.data.model.Entry.Leagues;

import java.util.List;

public class LeagueAdapter extends ArrayAdapter<Classic> {

    private Context context;
    private List<Classic> lLeagues;


    public LeagueAdapter(@NonNull Context context , @NonNull List<Classic> objects) {
        super(context, 0, objects);

        this.context = context;
        this. lLeagues = objects;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Nullable
    @Override
    public Classic getItem(int position) {
        return super.getItem(position);
    }

    @Override
    public int getPosition(@Nullable Classic item) {
        return super.getPosition(item);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if(listItem == null) {
            listItem = LayoutInflater.from(context).inflate(R.layout.layout_league_item,parent,false);
        }

        Classic currentLeague = lLeagues.get(position);

        TextView entry_rank = listItem.findViewById(R.id.entry_rankTV);
        TextView name = listItem.findViewById(R.id.league_nameTV);

        entry_rank.setText(String.valueOf(currentLeague.getEntryRank()));
        name.setText(currentLeague.getName());

        return  listItem;
    }
}
