package com.example.fpl.ui.Fragments;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.fpl.data.model.Picks.PlayerItem;
import com.example.fpl.R;


import java.util.List;

public class TeamItemAdapter extends RecyclerView.Adapter<TeamItemAdapter.ViewHolder> {

    private List<PlayerItem> teamList;
    private LayoutInflater mInflater;
    private Context context;

    public TeamItemAdapter(Context context, List<PlayerItem> teamList) {
        this.mInflater = LayoutInflater.from(context);
        this.teamList = teamList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.layout_playeritem, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        PlayerItem item = teamList.get(position);

        holder.bind(item);
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
        public void bind(PlayerItem player) {

            String suffix = (player.getElement_type() == 1) ? "_" + player.getElement_type() : "";
            String imageUrl = String.format("https://fantasy.premierleague.com/dist/img/shirts/standard/shirt_%s%s-110.png",player.getTeam_code(),suffix);
            System.out.println(imageUrl);

           // Picasso.get().load(imageUrl).into(playerImageView);
            Glide.with(context)
                    .load(imageUrl)
                    .centerCrop()
                    .override(66,87)
                    .into(playerImageView);

            playerNameTextView.setText(player.getName());
            playerPointsTextView.setText(String.valueOf(player.getEvent_points()));

        }

    }
}
