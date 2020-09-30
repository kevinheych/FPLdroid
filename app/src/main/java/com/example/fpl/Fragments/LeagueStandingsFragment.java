package com.example.fpl.Fragments;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.TextView;

import com.example.fpl.MyApplication;
import com.example.fpl.R;
import com.example.fpl.RequestManager;
import com.example.fpl.ServiceApiFPL;
import com.example.fpl.ShareViewModel;
import com.example.fpl.data.LeagueEntryModel;
import com.example.fpl.data.model.Bootstrap.Bootstrap;
import com.example.fpl.data.model.Bootstrap.Elements;
import com.example.fpl.data.model.Picks.Picks;
import com.example.fpl.data.model.Picks.UserTeam;
import com.example.fpl.data.PlayerItem;
import com.example.fpl.data.model.Standings.LeagueStandings;
import com.example.fpl.data.model.Standings.ResultComp;
import com.example.fpl.data.model.Standings.Results;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LeagueStandingsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LeagueStandingsFragment extends Fragment {


    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String LEAGUE_ID = "leagueID";
    private static final String CURRENT_GW = "currentGW";
    private static final String LEAGUE_NAME = "leagueName";

    private int leagueID;
    String leagueName;
    private int currentGW;
    ShareViewModel viewModel;
    Bootstrap bootstrap;
    ServiceApiFPL service;
    TreeMap<Results,List<PlayerItem>> leagueEntries;
    LeagueStandings leagueStanding;

    List<Results> entryObjectList;

    TextView leagueHeader;
    ExpandableListView expandableRV;
    LeagueStandingAdapter2 adapter;

    public LeagueStandingsFragment() {
        // Required empty public constructor
    }


    public static LeagueStandingsFragment newInstance(int leagueID, String leagueName, int currentGW) {
        LeagueStandingsFragment fragment = new LeagueStandingsFragment();
        Bundle args = new Bundle();
        args.putInt(LEAGUE_ID, leagueID);
        args.putString(LEAGUE_NAME, leagueName);
        args.putInt(CURRENT_GW, currentGW);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            leagueID = getArguments().getInt(LEAGUE_ID);
            leagueName = getArguments().getString(LEAGUE_NAME);
            currentGW = getArguments().getInt(CURRENT_GW);
        }


    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        viewModel = ViewModelProviders.of(getActivity()).get(ShareViewModel.class);
        bootstrap = viewModel.getBootstrap().getValue();

        service = RequestManager.getRetrofitInstance(MyApplication.getAppContext()).create(ServiceApiFPL.class);

        leagueEntries = new TreeMap<Results,List<PlayerItem>>(new ResultComp());

        getLeagueStanding(leagueID);

    }

    private void loadViews(TreeMap<Results,List<PlayerItem>> entries) {

        adapter = new LeagueStandingAdapter2( MyApplication.getAppContext(), entries);

        expandableRV.setAdapter(adapter);
    }


    private void getLeagueStanding(int league_id) {
        Call<LeagueStandings> call = service.getStandings(league_id);

        call.enqueue(new Callback<LeagueStandings>() {
            @Override
            public void onResponse(Call<LeagueStandings> call, Response<LeagueStandings> response) {
                if (response.isSuccessful()) {
                    System.out.println("call getStandings" + response.toString());

                    leagueStanding = response.body();
                    parseResponse();
                }
            }

            @Override
            public void onFailure(Call<LeagueStandings> call, Throwable t) {
                System.out.println("onFailure: getLeagueStanding  " + t.getLocalizedMessage());

            }
        });

    }


    private void parseResponse(){

          entryObjectList = leagueStanding.getStandings().getResults();
        for( Results entry : entryObjectList) {
            //find id to use to populate teamdata

            int id =  entry.getEntry();

            //fetch teamdata using id
            getTeamData( entry,id, currentGW);

        }

    }


    //fetches new team data
    public void getTeamData(Results entry, int entryID, int gameweek) {


        Call<UserTeam> call = service.getUserTeam(entryID, gameweek);
        call.enqueue(new Callback<UserTeam>() {
            @Override
            public void onResponse(Call<UserTeam> call, Response<UserTeam> response) {
                if (response.isSuccessful()) {
                    System.out.println(entry.getEntry_name());
                    System.out.println("Team " +response.toString());

                    UserTeam userTeam = response.body();
                    List<Picks> picks = userTeam.getPicks();

                    List<PlayerItem> convertedPicksList;
                    convertedPicksList =  createCustomPlayerList(picks, bootstrap.getElements());

                    leagueEntries.put(entry,convertedPicksList );

                    loadViews(leagueEntries);
                }
            }

            @Override
            public void onFailure(Call<UserTeam> call, Throwable t) {
                System.out.println("onFailure: userTeam frag " + t.getLocalizedMessage());

            }
        });
    }

    private List<PlayerItem> createCustomPlayerList(List<Picks> playerList, List<Elements> allData) {

        List<PlayerItem> newList = new ArrayList<>();

        for(int i=0; i< playerList.size(); i++){
            //add a seperation between XI and bench
            if (i==11){
                newList.add(new PlayerItem());
            }
            Picks player = playerList.get(i);
            int playerID = player.getElement();
            Elements playerInfo = allData.stream()
                    .filter(element -> element.getId() == playerID)
                    .findFirst()
                    .orElse(null);

            PlayerItem playerItem = new PlayerItem();
            playerItem.setId(playerID);
            playerItem.setName(playerInfo.getWeb_name());
            playerItem.setElement_type(playerInfo.getElement_type());
            playerItem.setTeam_code(playerInfo.getTeam_code());
            playerItem.setEvent_points(playerInfo.getEvent_points());
            playerItem.setIs_captain(player.getIs_captain());
            playerItem.setIs_vice_captain(player.getIs_vice_captain());
            playerItem.setMultiplier(player.getMultiplier());
            newList.add(playerItem);

        }


        return newList;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_league_standings, container, false);


        leagueHeader = view.findViewById(R.id.leagueName);
        TextView leagueHeaderPts = view.findViewById(R.id.gwHeader);
        expandableRV = view.findViewById(R.id.expandableRV);


        leagueHeader.setText(leagueName);
        leagueHeaderPts.setText("GW"+currentGW);
        return view;
    }
}