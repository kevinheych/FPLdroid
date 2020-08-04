package com.example.fpl.Fragments;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fpl.data.PlayerItem;
import com.example.fpl.data.TeamList;
import com.example.fpl.R;
import com.example.fpl.data.model.Picks.Entry_history;

import java.util.List;

import static com.example.fpl.data.TeamList.BENCH;
import static com.example.fpl.data.TeamList.DEF;
import static com.example.fpl.data.TeamList.FWD;
import static com.example.fpl.data.TeamList.GK;
import static com.example.fpl.data.TeamList.MID;


public class TeamSectionAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<TeamList> sectionedTeamList;
    private Context context;
    private Entry_history history;

    public TeamSectionAdapter(Context context, List<TeamList> sectionedTeamList , Entry_history history) {
        this.sectionedTeamList = sectionedTeamList;
        this.context = context;
        this.history = history;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;

        switch(viewType){
            case GK:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.team_section, parent, false);
                return new GoalWithInfoViewHolder(view);
            case DEF:
            case MID:
            case FWD:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.team_section, parent, false);
                return new StartingViewHolder(view);

            case BENCH:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.team_section, parent, false);
                return new BenchViewHolder(view);
        }
        
         return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        TeamList teamlist = sectionedTeamList.get(position);
        if (teamlist != null) {
            switch (teamlist.getType()) {
                case GK:
                    ((GoalWithInfoViewHolder)holder).bind(teamlist);
                    break;
                case DEF:
                case MID:
                case FWD:
                    ((StartingViewHolder) holder).bind(teamlist);
                    break;
                case BENCH:
                    ((BenchViewHolder) holder).bind(teamlist);
                    break;
            }
        }
    }

    @Override
    public int getItemCount() {
        return sectionedTeamList.size();
    }

    @Override
    public int getItemViewType(int position) {

        if(sectionedTeamList != null) {
            TeamList list = sectionedTeamList.get(position);
            if (list != null) {
                return list.getType();
            }
        }
        return 0;
    }

    class StartingViewHolder extends RecyclerView.ViewHolder{
        private RecyclerView playerRV;
        private FrameLayout frameLayout;
        private LinearLayout info;

        public StartingViewHolder(@NonNull View itemView) {
            super(itemView);
            playerRV = itemView.findViewById(R.id.team_sectionRV);
            frameLayout= itemView.findViewById(R.id.team_section_layout);
            info = itemView.findViewById(R.id.infoBox);
        }
        public void bind(TeamList teamlist) {
             frameLayout.removeView(info);

            List<PlayerItem> items = teamlist.getPlayersList();

            loadRV(context, playerRV, items.size(), items );
        }


    }

    class BenchViewHolder extends RecyclerView.ViewHolder{
        private RecyclerView playerRV;
        private FrameLayout frameLayout;
        private LinearLayout info;

        private TextView points;
        private TextView benchpts;
        private TextView finance;
        public BenchViewHolder(@NonNull View itemView) {
            super(itemView);
            playerRV = itemView.findViewById(R.id.team_sectionRV);
            frameLayout= itemView.findViewById(R.id.team_section_layout);
            points = itemView.findViewById(R.id.score);
            benchpts = itemView.findViewById(R.id.benchpoints);
            finance = itemView.findViewById(R.id.bank);
            info = itemView.findViewById(R.id.infoBox);
        }

        public void bind(TeamList teamlist) {
            frameLayout.removeView(info);

            GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 4);
            playerRV.setLayoutManager(gridLayoutManager);
            TeamItemAdapter adapter = new TeamItemAdapter(context, teamlist.getPlayersList());
            playerRV.setAdapter(adapter);

            frameLayout.setBackgroundColor(Color.WHITE);



        }
    }

    class GoalWithInfoViewHolder extends RecyclerView.ViewHolder{
        private RecyclerView playerRV;

        private TextView points;
        private TextView benchpts;
        private TextView finance;

        public GoalWithInfoViewHolder(@NonNull View itemView) {
            super(itemView);
            playerRV = itemView.findViewById(R.id.team_sectionRV);

            points = itemView.findViewById(R.id.score);
            benchpts = itemView.findViewById(R.id.benchpoints);
            finance = itemView.findViewById(R.id.bank);

            //  layout.setPadding(0,5,0,0);
        }

        public void bind(TeamList teamlist) {
            String pointText = "Score: " + history.getPoints() + "pts";
            points.setText(pointText);

            String benchText = "Bench: " + history.getPoints_on_bench() + "pts";
            benchpts.setText(benchText);

            String financeText =  "Finance: £"+ history.getValue()/10 + " (" + history.getBank()/10 + ")";
            finance.setText(financeText);

            GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 1);
            playerRV.setLayoutManager(gridLayoutManager);
            TeamItemAdapter adapter = new TeamItemAdapter(context, teamlist.getPlayersList());
            playerRV.setAdapter(adapter);




        }
    }


    private void loadRV(Context context, RecyclerView recyclerView,  int columnCount, List<PlayerItem> list) {
        GridLayoutManager gridLayoutManager = new GridLayoutManager( context,  columnCount);
        recyclerView.setLayoutManager(gridLayoutManager);
        TeamItemAdapter adapter = new TeamItemAdapter(context, list);
        recyclerView.setAdapter(adapter);
    }
}
