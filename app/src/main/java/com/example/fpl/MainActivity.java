package com.example.fpl;

import android.os.Bundle;

import com.example.fpl.Models.Entry.History;
import com.example.fpl.Models.Bootstrap.Bootstrap;
import com.example.fpl.Models.Entry.User;
import com.example.fpl.Models.Picks.UserTeam;
import com.example.fpl.ui.SwipeNavigation.ShareViewModel;
import com.google.android.material.tabs.TabLayout;

import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import com.example.fpl.ui.SwipeNavigation.TabPagerAdapter;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    //data
    private User managerData;
    private Bootstrap bootstrap;
    private History userHistory;
    private UserTeam userTeam;

    private fplAPI fpLapi;
    int userID;

    private ShareViewModel viewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get data
        viewModel = ViewModelProviders.of(this).get(ShareViewModel.class);
        getData();


        //create adapter for tab navigation
        TabPagerAdapter sectionsPagerAdapter = new TabPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);



    }

    public void getData() {
        userID = 134211;
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(fplAPI.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        fpLapi = retrofit.create(fplAPI.class);



        getManagerData();
        getLiveData();
        getHistory();
        getTeam();


    }

    private void getTeam() {


        Call<UserTeam> call = fpLapi.getUserTeam(userID, 46);

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

    private void getManagerData() {

        Call<User> call = fpLapi.getUser(userID);

        call.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                if (response.isSuccessful()) {
                    System.out.println(response.toString());
                    managerData = response.body();
                    viewModel.setUser(managerData);
                    System.out.println("Success getManagerData");
                }
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                System.out.println("onFailure: getManagerData " + t.getLocalizedMessage());

            }
        });

    }

    private void getLiveData() {
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

    private void getHistory() {
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