package com.example.fpl.Fragments;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.fpl.R;
import com.example.fpl.ServiceApiFPL;
import com.example.fpl.ShareViewModel;
import com.example.fpl.data.model.Bootstrap.Bootstrap;
import com.example.fpl.data.model.Entry.Classic;
import com.example.fpl.data.model.Entry.Leagues;
import com.example.fpl.data.model.Entry.User;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LeagueFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LeagueFragment extends Fragment {

    ListView classicLV;

    Bootstrap boostrap;
    Leagues userLeagues;
    private ServiceApiFPL fpLapi;
    int userID;

    int currentGW;

    private ShareViewModel viewModel;



    public LeagueFragment() {

    }


    public static LeagueFragment newInstance(String param1, String param2) {
        LeagueFragment fragment = new LeagueFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        viewModel = ViewModelProviders.of(getActivity()).get(ShareViewModel.class);



        userID =  viewModel.getUserID().getValue();
        currentGW = viewModel.getCurrentGW().getValue();
        boostrap = viewModel.getBootstrap().getValue();


        if (userID != 0) {
            User userData = viewModel.getUserData().getValue();
            userLeagues = userData.getLeagues();
            String displayText;

            String failtext = "UserID: " + userID;
            userLeagues.getClassic();

            System.out.println(failtext);
        } else
        {
            String failtext = "UserID is null or 0 = %s" + userID;

            System.out.println(failtext);
        }


        LeagueAdapter classicAdapter = new LeagueAdapter(getContext(), userLeagues.getClassic());
        classicLV.setAdapter(classicAdapter);

        classicLV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Classic item = classicAdapter.getItem(position);
                int leagueID = item.getId();
                //listener.passLeagueID(leagueID);



                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.layout_league, LeagueStandingsFragment.newInstance(leagueID,item.getName(), currentGW));
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();




            }
        });






        viewModel.getUserID().observe(getViewLifecycleOwner(), new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                userID = integer;
                System.out.println("get user id recieved");


            }
        });



    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_league, container, false);

        classicLV = v.findViewById(R.id.classicListView);




        return v;
    }


//
//    @Override
//    public void onDetach() {
//        super.onDetach();
//        listener = null;
//    }
}


