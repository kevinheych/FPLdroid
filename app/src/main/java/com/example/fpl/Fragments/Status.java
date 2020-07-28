package com.example.fpl.Fragments;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.fpl.Models.Entry.Current;
import com.example.fpl.Models.Entry.History;
import com.example.fpl.Models.Bootstrap.Events;
import com.example.fpl.Models.Bootstrap.Bootstrap;
import com.example.fpl.Models.Entry.User;
import com.example.fpl.R;
import com.example.fpl.fplAPI;
import com.example.fpl.ui.SwipeNavigation.ShareViewModel;

import java.util.List;


public class Status extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    //data
    private User managerData;
    private Bootstrap bootstrap;
    private History userHistory;

    //views
    private TextView managerText;
    private TextView teamNameText;
    private TextView gameweekHeader;
    private TextView averageText;
    private TextView yourScoreText;
    private TextView highText;
    private TextView gwRankText;
    private TextView overallRankText;
    private TextView totalPlayerText;
    private TextView teamIDText;
    private TextView overallPointsText;
    private TextView gwPointsText;
    private TextView gwTransfersText;
    private TextView totalTransfersText;
    private TextView ITBText;
    private TextView teamValueText;
    private TextView wildcardText;
    private TextView freehitText;
    private TextView benchboostText;


    private fplAPI fpLapi;
    int userID;

    private ShareViewModel viewModel;


    public Status() {
        // Required empty public constructor
    }

    public static Status newInstance(String param1, String param2) {
        Status fragment = new Status();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View v = inflater.inflate(R.layout.fragment_status, container, false);
        managerText = v.findViewById(R.id.managerText);
        teamNameText = v.findViewById(R.id.teamNameText);
        gameweekHeader = v.findViewById(R.id.gameweekHeader);
        averageText = v.findViewById(R.id.averageText);
        yourScoreText = v.findViewById(R.id.yourScoreText);
        highText = v.findViewById(R.id.highText);
        gwRankText = v.findViewById(R.id.gwRankText);
        overallRankText = v.findViewById(R.id.overallRankText);
        totalPlayerText = v.findViewById(R.id.totalPlayerText);
        teamIDText = v.findViewById(R.id.teamIDText);
        overallPointsText = v.findViewById(R.id.overallPointsText);
        gwPointsText = v.findViewById(R.id.gwPointsText);
        gwTransfersText = v.findViewById(R.id.gwTransfersText);
        totalTransfersText = v.findViewById(R.id.totalTransfersText);
        ITBText = v.findViewById(R.id.ITBText);
        teamValueText = v.findViewById(R.id.teamValueText);
        wildcardText = v.findViewById(R.id.wildcardText);
        freehitText = v.findViewById(R.id.freehitText);
        benchboostText = v.findViewById(R.id.benchboostText);


        return v;


    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        viewModel = ViewModelProviders.of(getActivity()).get(ShareViewModel.class);
        managerData = viewModel.getUser().getValue();
        userHistory = viewModel.getHistory().getValue();
        bootstrap = viewModel.getBootstrap().getValue();

        if (managerData != null) {
            if (userHistory != null) {
                if (bootstrap != null) {
                    loadViews();
                }
            }
        }


    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        viewModel = ViewModelProviders.of(getActivity()).get(ShareViewModel.class);


        viewModel.getUser().observe(getViewLifecycleOwner(), new Observer<User>() {
            @Override
            public void onChanged(User user) {
                managerData = user;
                System.out.println(managerData);
                loadViews();
            }
        });

        viewModel.getBootstrap().observe(getViewLifecycleOwner(), new Observer<Bootstrap>() {
            @Override
            public void onChanged(Bootstrap bootstrapData) {
                bootstrap = bootstrapData;
                System.out.println(bootstrap);
                loadViews();
            }
        });

        viewModel.getHistory().observe(getViewLifecycleOwner(), new Observer<History>() {
            @Override
            public void onChanged(History historyData) {
                userHistory = historyData;
                System.out.println(userHistory);
                loadViews();
            }
        });


        loadViews();


    }


    public void loadViews() {

        if (managerData != null) {

            managerText.setText(managerData.getPlayerFirstName() + " " + managerData.getPlayerLastName());
            teamNameText.setText(managerData.getName());
            gameweekHeader.setText("Gameweek " + String.valueOf(managerData.getCurrentEvent()));

            yourScoreText.setText(String.valueOf(managerData.getSummaryEventPoints()));
            gwRankText.setText(String.format("%,d", managerData.getSummaryEventRank()));
            overallRankText.setText(String.format("%,d", managerData.getSummaryOverallRank()));
            teamIDText.setText(String.valueOf(managerData.getId()));
            overallPointsText.setText(String.format("%,d", managerData.getSummaryOverallPoints()));
            gwPointsText.setText(String.valueOf(managerData.getSummaryEventPoints()));

            totalTransfersText.setText(String.valueOf(managerData.getLastDeadlineTotalTransfers()));
            ITBText.setText("£" + String.valueOf(managerData.getLastDeadlineBank() / 10));
            teamValueText.setText("£" + String.valueOf(managerData.getLastDeadlineValue() / 10));
        }

        if (userHistory != null) {
            if (bootstrap != null) {


                totalPlayerText.setText(String.format("%,d", bootstrap.getTotal_players()));

                List<Events> events = bootstrap.getEvents();
                Events currentEvent = events.stream()
                        .filter(event -> event.getIs_current() == true)
                        .findFirst()
                        .orElse(null);

                List<Current> userHist = userHistory.getCurrent();
                Current userHistoryCurrent = userHist.stream()
                        .filter(current -> current.getEvent() == currentEvent.getId())
                        .findFirst()
                        .orElse(null);


                averageText.setText(String.format("%,d", currentEvent.getAverage_entry_score()));
                highText.setText(String.format("%,d", currentEvent.getHighest_score()));
                gwTransfersText.setText(String.valueOf(userHistoryCurrent.getEvent_transfers()));


            }
        }

        // wildcardText
        //freehitText
        //benchboostText
        // to set this requires login


    }
}