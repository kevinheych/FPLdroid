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

import com.example.fpl.data.model.Entry.Current;
import com.example.fpl.data.model.Entry.History;
import com.example.fpl.data.model.Bootstrap.Events;
import com.example.fpl.data.model.Bootstrap.Bootstrap;
import com.example.fpl.data.model.Entry.User;
import com.example.fpl.R;
import com.example.fpl.ServiceApiFPL;
import com.example.fpl.ShareViewModel;

import java.util.List;


public class StatusFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    //data
    private User userData;
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


    private ServiceApiFPL fpLapi;
    int userID;

    private ShareViewModel viewModel;


    public StatusFragment() {
        // Required empty public constructor
    }

    public static StatusFragment newInstance(String param1, String param2) {
        StatusFragment fragment = new StatusFragment();
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
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        viewModel = ViewModelProviders.of(getActivity()).get(ShareViewModel.class);

        userID =  viewModel.getUserID().getValue();

        viewModel.getUserData().observe(getViewLifecycleOwner(), new Observer<User>() {
            @Override
            public void onChanged(User user) {
                userData = user;
                System.out.println(userData);
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





    }


    public void loadViews() {
        System.out.println("loadviews");

        if (userData != null) {

            managerText.setText(userData.getPlayerFirstName() + " " + userData.getPlayerLastName());
            teamNameText.setText(userData.getName());
            gameweekHeader.setText("Gameweek " + String.valueOf(userData.getCurrentEvent()));

            yourScoreText.setText(String.valueOf(userData.getSummaryEventPoints()));
            gwRankText.setText(String.format("%,d", userData.getSummaryEventRank()));
            overallRankText.setText(String.format("%,d", userData.getSummaryOverallRank()));
            teamIDText.setText(String.valueOf(userData.getId()));
            overallPointsText.setText(String.format("%,d", userData.getSummaryOverallPoints()));
            gwPointsText.setText(String.valueOf(userData.getSummaryEventPoints()));

            totalTransfersText.setText(String.valueOf(userData.getLastDeadlineTotalTransfers()));
            ITBText.setText("£" + String.valueOf(userData.getLastDeadlineBank() / 10));
            teamValueText.setText("£" + String.valueOf(userData.getLastDeadlineValue() / 10));
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