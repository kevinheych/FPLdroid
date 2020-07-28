package com.example.fpl.Fragments;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fpl.Models.Picks.PlayerItem;
import com.example.fpl.Models.TeamList;
import com.example.fpl.R;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.example.fpl.Models.TeamList.BENCH;
import static com.example.fpl.Models.TeamList.DEF;
import static com.example.fpl.Models.TeamList.FWD;
import static com.example.fpl.Models.TeamList.GK;
import static com.example.fpl.Models.TeamList.MID;


public class TeamSectionAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<TeamList> sectionedTeamList;
    private Context context;
    private TeamRecyclerViewAdapter teamRecyclerViewAdapter;

    public TeamSectionAdapter(Context context, List<TeamList> sectionedTeamList ) {
        this.sectionedTeamList = sectionedTeamList;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;

        switch(viewType){
            case GK:
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

        public StartingViewHolder(@NonNull View itemView) {
            super(itemView);
            playerRV = itemView.findViewById(R.id.team_sectionRV);

        }
        public void bind(TeamList teamlist) {
            List<PlayerItem> items = teamlist.getPlayersList();

            loadRV(context, playerRV, items.size(), items );
        }
    }

    class BenchViewHolder extends RecyclerView.ViewHolder{
        private RecyclerView playerRV;

        public BenchViewHolder(@NonNull View itemView) {
            super(itemView);
            playerRV = itemView.findViewById(R.id.team_sectionRV);
        }

        public void bind(TeamList teamlist) {
            GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 4);
            playerRV.setLayoutManager(gridLayoutManager);
            TeamRecyclerViewAdapter adapter = new TeamRecyclerViewAdapter(context, teamlist.getPlayersList());
            playerRV.setAdapter(adapter);
        }
    }


    private void loadRV(Context context, RecyclerView recyclerView,  int columnCount, List<PlayerItem> list) {
        GridLayoutManager gridLayoutManager = new GridLayoutManager( context,  columnCount);
        recyclerView.setLayoutManager(gridLayoutManager);
        TeamRecyclerViewAdapter adapter = new TeamRecyclerViewAdapter(context, list);
        recyclerView.setAdapter(adapter);
    }
}
