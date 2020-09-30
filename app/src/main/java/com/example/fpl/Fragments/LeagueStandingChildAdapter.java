package com.example.fpl.Fragments;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.fpl.MyApplication;
import com.example.fpl.R;
import com.example.fpl.data.PlayerItem;
import com.example.fpl.data.model.Standings.Results;

import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class LeagueStandingChildAdapter extends RecyclerView.Adapter<LeagueStandingChildAdapter.ViewHolder> {
    private List<PlayerItem>  child;
    Context context;
    int groupPosition;


    public LeagueStandingChildAdapter(Context context, TreeMap<Results,List<PlayerItem>> entries, int groupPosition) {
        Object groupEntry = entries.keySet().toArray()[groupPosition];
        this.child =  entries.get(groupEntry);
        this.context = context;
        this.groupPosition = groupPosition;

    }

    @Override
    public int getItemViewType(int position) {
 
        return super.getItemViewType(position);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.league_standing_player_item, parent, false);
        LeagueStandingChildAdapter.ViewHolder vh = new LeagueStandingChildAdapter.ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final PlayerItem playerItem = (PlayerItem) getChild(groupPosition,position);
        holder.setItem(playerItem, position);

    }

    @Override
    public int getItemCount() {
        return child.size()+2;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView playerItemTV;
        private ImageView clubImageView;
        private ImageView captainView;
        private LinearLayout child_layout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            clubImageView = itemView.findViewById(R.id.imageView);
            playerItemTV = itemView.findViewById(R.id.playerItemTV);
            captainView =itemView.findViewById(R.id.captain);
            child_layout = itemView.findViewById(R.id.layout_league_standing_child_player);
        }
        public void setItem(PlayerItem player, int position) {
            int playerPoints = player.getEvent_points()*player.getMultiplier();

            if ( position == 11) {return;}
            if ( position > 11)
            {
                child_layout.setBackgroundColor(Color.parseColor("#00753a"));
                playerItemTV.setTextColor(Color.WHITE);
                playerPoints = player.getEvent_points();
            }



            if (player.isIs_captain()) {
                Drawable captainIcon =  MyApplication.getAppContext().getDrawable(R.drawable.icon_captain);
                captainView.setImageDrawable(captainIcon);
                playerItemTV.setTypeface(playerItemTV.getTypeface(), Typeface.BOLD);

            } else if (player.isIs_vice_captain()) {
                Drawable vcIcon =  MyApplication.getAppContext().getDrawable(R.drawable.icon_vice);
                captainView.setImageDrawable(vcIcon);
            } else {
                captainView.setImageResource(0);
            }



            String text = player.getName() + String.format(" (%d)", playerPoints);
            playerItemTV.setText(text);

            String suffix = (player.getElement_type() == 1) ? "_" + player.getElement_type() : "";
            String imageUrl = String.format("https://fantasy.premierleague.com/dist/img/shirts/standard/shirt_%s%s-110.png",player.getTeam_code(),suffix);
            System.out.println(imageUrl);

            // Picasso.get().load(imageUrl).into(playerImageView);
            Glide.with(MyApplication.getAppContext())
                    .load(imageUrl)
                    .centerCrop()
                    .override(66,87)
                    .into(clubImageView);

        }
    }

    public Object getChild(int groupPosition, int childPosition) {

        // This will return the child
        return this.child.get(childPosition);
    }

}
