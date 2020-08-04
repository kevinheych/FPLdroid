package com.example.fpl.Fragments;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.fpl.MyApplication;
import com.example.fpl.R;
import com.example.fpl.data.PlayerItem;
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

public class LeaguePlayerListViewHolder extends ChildViewHolder {

    private TextView playerItemTV;
    private ImageView clubImageView;
    private ImageView captainView;

    public LeaguePlayerListViewHolder(View itemView) {
        super(itemView);
        clubImageView = itemView.findViewById(R.id.imageView);
        playerItemTV = itemView.findViewById(R.id.playerItemTV);
        captainView =itemView.findViewById(R.id.captain);
    }


    public void setItem(PlayerItem player) {
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


        int playerPoints = player.getEvent_points()*player.getMultiplier();
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
