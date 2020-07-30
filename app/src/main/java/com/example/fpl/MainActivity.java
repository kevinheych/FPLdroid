package com.example.fpl;

import android.os.Bundle;

import com.example.fpl.Models.Entry.History;
import com.example.fpl.Models.Bootstrap.Bootstrap;
import com.example.fpl.Models.Entry.User;
import com.example.fpl.Models.Picks.UserTeam;
import com.google.android.material.tabs.TabLayout;

import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import com.example.fpl.ui.SwipeNavigation.TabPagerAdapter;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    //data
    private User managerData;
    private Bootstrap bootstrap;
    private History userHistory;
    private UserTeam userTeam;

    private fplAPI fpLapi;
    int userID;
    public int currentGW;
    boolean isLatestGwSaved;


    private ShareViewModel viewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get data
        viewModel = ViewModelProviders.of(this).get(ShareViewModel.class);

        isLatestGwSaved = false;
        userID = 134211;

        viewModel.setUserID(userID);


        getData();


        //create adapter for tab navigation
        TabPagerAdapter sectionsPagerAdapter = new TabPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);



    }

    public void getData() {
         fpLapi = RequestManager.getRetrofitInstance().create(fplAPI.class);


        getUserEntryData(userID);
        getLiveData();
        getHistory(userID);



    }


    public void getUserEntryData(int userID) {

        Call<User> call = fpLapi.getUser(userID);



        call.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                if (response.isSuccessful()) {
                    System.out.println(response.toString());
                    managerData = response.body();
                    viewModel.setUser(managerData);

                    currentGW = managerData.getCurrentEvent();
                    viewModel.setCurrentGW(currentGW);




                    System.out.println("Success getManagerData");
                }
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                System.out.println("onFailure: getManagerData " + t.getLocalizedMessage());

            }
        });


    }

    public void getTeam(int userID, int gw) {


        Call<UserTeam> call = fpLapi.getUserTeam(userID, gw);

        call.enqueue(new Callback<UserTeam>() {
            @Override
            public void onResponse(Call<UserTeam> call, Response<UserTeam> response) {
                System.out.println(response.toString());
                if (response.isSuccessful()) {
                    System.out.println(response.toString());
                    userTeam = response.body();
                    viewModel.setUserTeamData(userTeam);
                    System.out.println("Success getTeam");
                }
            }

            @Override
            public void onFailure(Call<UserTeam> call, Throwable t) {
                System.out.println("onFailure: getTeam " + t.getLocalizedMessage());
            }
        });



    }

    public void getLiveData() {
        Call<Bootstrap> call = fpLapi.getLive();

        call.enqueue(new Callback<Bootstrap>() {
            @Override
            public void onResponse(Call<Bootstrap> call, Response<Bootstrap> response) {
                if (response.isSuccessful()) {
                    bootstrap = response.body();
                    viewModel.setBootstrap(bootstrap);
                    System.out.println(response.toString());
                    System.out.println("Success getLiveData");
                }
            }

            @Override
            public void onFailure(Call<Bootstrap> call, Throwable t) {
                System.out.println("onFailure: getLive " + t.getLocalizedMessage());
            }
        });


    }

    public void getHistory(int userID) {
        Call<History> call = fpLapi.getHistory(userID);

        call.enqueue(new Callback<History>() {
            @Override
            public void onResponse(Call<History> call, Response<History> response) {
                userHistory = response.body();
                viewModel.setHistory(userHistory);
                System.out.println(response.toString());
                System.out.println("Success getHistory");
            }

            @Override
            public void onFailure(Call<History> call, Throwable t) {
                System.out.println("onFailure: getHistory " + t.getLocalizedMessage());
            }
        });


    }
}