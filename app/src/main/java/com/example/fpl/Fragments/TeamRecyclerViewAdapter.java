package com.example.fpl.Fragments;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fpl.Models.Picks.PlayerItem;
import com.example.fpl.R;

import java.util.List;

public class TeamRecyclerViewAdapter extends RecyclerView.Adapter<TeamRecyclerViewAdapter.ViewHolder> {

    private List<PlayerItem> teamList;
    private LayoutInflater mInflater;

    public TeamRecyclerViewAdapter(Context context, List<PlayerItem> teamList) {
        this.mInflater = LayoutInflater.from(context);
        this.teamList = teamList;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.layout_playeritem, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        PlayerItem player = teamList.get(position);

        holder.playerNameTextView.setText(player.getName());
        holder.playerPointsTextView.setText(String.valueOf(player.getEvent_points()));
    }

    @Override
    public int getItemCount() {
            return teamList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView playerNameTextView;
        public TextView playerPointsTextView;
        public ImageView playerImageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            playerNameTextView = itemView.findViewById(R.id.playerName);
            playerPointsTextView = itemView.findViewById(R.id.playerPoints);
            playerImageView = itemView.findViewById(R.id.playerImageView);
        }
    }
}
