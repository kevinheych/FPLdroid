package com.example.fpl.Fragments;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fpl.Models.Bootstrap.Bootstrap;
import com.example.fpl.Models.Bootstrap.Elements;
import com.example.fpl.Models.Entry.User;
import com.example.fpl.Models.Picks.Picks;
import com.example.fpl.Models.Picks.PlayerItem;
import com.example.fpl.Models.Picks.UserTeam;
import com.example.fpl.Models.TeamList;
import com.example.fpl.R;
import com.example.fpl.RequestManager;
import com.example.fpl.ShareViewModel;
import com.example.fpl.fplAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import travel.ithaka.android.horizontalpickerlib.PickerLayoutManager;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Team#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Team extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    RecyclerView teamRecyclerView, pickerRV;
    private fplAPI fpLapi;
    //data
//    private ShareViewModel viewModel;
    private UserTeam userTeam;
    private Bootstrap bootstrap;
    private List<TeamList> sectionedList;
    private int currentGW;
    private int selectedGW;
    ShareViewModel viewModel;

    private int userID;

    public Team() {
        // Required empty public constructor
    }

    public static Team newInstance() {
        Team fragment = new Team();
        return fragment;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);



        viewModel = ViewModelProviders.of(getActivity()).get(ShareViewModel.class);

        if (viewModel.getUserID().getValue() != null) {
            System.out.println("videmodel.getUserID  "+viewModel.getUserID().getValue());
            userID = viewModel.getUserID().getValue();
        }




        viewModel.getUserID().observe(getViewLifecycleOwner(), new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                userID = integer;
                System.out.println("Get team");


            }
        });

        viewModel.getCurrentGW().observe(getViewLifecycleOwner(), new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                currentGW = integer;
                initialisePickerRV();
                getTeamData(currentGW);
            }
        });


        //subscribe and observe to changes to data
        viewModel.getUserTeam().observe(getViewLifecycleOwner(), new Observer<UserTeam>() {
            @Override
            public void onChanged(UserTeam userTeamData) {
                userTeam = userTeamData;
                System.out.println("getUserTeam() : " +userTeam);

                if (userTeam != null && bootstrap != null) {

                    getFullPlayerDetails();
                    loadTeamRV();
                }

            }
        });

        //check if bootstrap (live) data changes and update RV
        viewModel.getBootstrap().observe(getViewLifecycleOwner(), new Observer<Bootstrap>() {
            @Override
            public void onChanged(Bootstrap bootstrapData) {
                bootstrap = bootstrapData;
                System.out.println(bootstrap);

                if (userTeam != null && bootstrap != null) {
                    getFullPlayerDetails();

                    loadTeamRV();
                }

            }
        });


    }

    public void getTeamData(int gameweek) {

        fpLapi = RequestManager.getRetrofitInstance().create(fplAPI.class);
        Call<UserTeam> call = fpLapi.getUserTeam(userID, gameweek);
        call.enqueue(new Callback<UserTeam>() {
            @Override
            public void onResponse(Call<UserTeam> call, Response<UserTeam> response) {
                if (response.isSuccessful()) {
                    System.out.println("call getUserTeam in getTeamData" +response.toString());

                    userTeam = response.body();
                    viewModel.setUserTeamData(userTeam);

                    System.out.println("Success userTeam in team fragment");
                }
            }

            @Override
            public void onFailure(Call<UserTeam> call, Throwable t) {
                System.out.println("onFailure: userTeam frag " + t.getLocalizedMessage());
            }
        });
    }

    private void initialisePickerRV() {


        //create pickerview
        PickerLayoutManager pickerLayoutManager = new PickerLayoutManager(getContext(), PickerLayoutManager.HORIZONTAL, false);
        pickerLayoutManager.setChangeAlpha(true);
        pickerLayoutManager.setScaleDownBy(0.99f);
        pickerLayoutManager.setScaleDownDistance(0.8f);
        pickerLayoutManager.setStackFromEnd(true);

        pickerRV.setLayoutManager(pickerLayoutManager);
        PickerAdapter pickerAdapter = new PickerAdapter(getContext(), currentGW);
        pickerRV.setAdapter(pickerAdapter);
        SnapHelper snapHelper = new LinearSnapHelper();
        snapHelper.attachToRecyclerView(pickerRV);


        pickerLayoutManager.setOnScrollStopListener(new PickerLayoutManager.onScrollStopListener() {
            @Override
            public void selectedView(View view) {
                TextView gwView = view.findViewById(R.id.pickerText);
                int gwNum = Integer.parseInt(gwView.getText().toString());
                Toast.makeText(getContext(), gwView.getText(), Toast.LENGTH_SHORT).show();
                selectedGW = gwNum;

                getTeamData(selectedGW);


            }
        });
    }

    private void loadTeamRV() {

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        teamRecyclerView.setLayoutManager(linearLayoutManager);
        TeamSectionAdapter adapter = new TeamSectionAdapter(getContext(), sectionedList);
        teamRecyclerView.setAdapter(adapter);

    }


    //updates data recieved and creates new list in sections for starting and bench
    private void getFullPlayerDetails() {


        //get bootstrap data to match players info
        ShareViewModel viewModel = ViewModelProviders.of(getActivity()).get(ShareViewModel.class);
        bootstrap = viewModel.getBootstrap().getValue();
        userTeam = viewModel.getUserTeam().getValue();

        List<Picks> picks = userTeam.getPicks();

        //grab only the player data
        List<Elements> allPlayerData = bootstrap.getElements();


        //seperate starting and bench
        List<Picks> startingXIListRaw = picks.subList(0, 11);
        List<Picks> benchListRaw = picks.subList(11, 15);


        List<PlayerItem> convertList = createCustomPlayerList(startingXIListRaw, allPlayerData);

        List<PlayerItem> gk = convertList.stream()
                .filter(playerItem -> playerItem.getElement_type() == PlayerItem.GKP)
                .collect(Collectors.toList());
        List<PlayerItem> def = convertList.stream()
                .filter(playerItem -> playerItem.getElement_type() == PlayerItem.DEF)
                .collect(Collectors.toList());
        List<PlayerItem> mid = convertList.stream()
                .filter(playerItem -> playerItem.getElement_type() == PlayerItem.MID)
                .collect(Collectors.toList());
        List<PlayerItem> fwd = convertList.stream()
                .filter(playerItem -> playerItem.getElement_type() == PlayerItem.FWD)
                .collect(Collectors.toList());

        //create new list with custom player data that will be added to sectionlist
        TeamList gkList = new TeamList(gk, TeamList.GK);
        TeamList defList = new TeamList(def, TeamList.DEF);
        TeamList midList = new TeamList(mid, TeamList.MID);
        TeamList fwdList = new TeamList(fwd, TeamList.FWD);
        TeamList benchList = new TeamList(createCustomPlayerList(benchListRaw, allPlayerData), TeamList.BENCH);


        sectionedList = new ArrayList<>();
        sectionedList.add(gkList);
        sectionedList.add(defList);
        sectionedList.add(midList);
        sectionedList.add(fwdList);
        sectionedList.add(benchList);


    }

    private List<PlayerItem> createCustomPlayerList(List<Picks> playerList, List<Elements> allData) {

        List<PlayerItem> newList = new ArrayList<>();
        for (Picks player : playerList) {
            int playerID = player.getElement();

            Elements playerInfo = allData.stream()
                    .filter(element -> element.getId() == playerID)
                    .findFirst()
                    .orElse(null);

            PlayerItem playerItem = new PlayerItem();
            playerItem.setId(playerID);
            playerItem.setName(playerInfo.getWeb_name());
            playerItem.setElement_type(playerInfo.getElement_type());
            playerItem.setTeam_id(playerInfo.getTeam());
            playerItem.setEvent_points(playerInfo.getEvent_points());
            newList.add(playerItem);

        }
        return newList;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_team, container, false);
        teamRecyclerView = v.findViewById(R.id.teamRV);
        pickerRV = v.findViewById(R.id.pickerView);


        return v;
    }
}