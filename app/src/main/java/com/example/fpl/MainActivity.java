package com.example.fpl;

import android.os.Bundle;

import com.example.fpl.data.model.Entry.History;
import com.example.fpl.data.model.Bootstrap.Bootstrap;
import com.example.fpl.data.model.Entry.User;
import com.example.fpl.data.model.Picks.UserTeam;
import com.google.android.material.tabs.TabLayout;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import com.example.fpl.ui.SwipeNavigation.TabPagerAdapter;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    //data
    private User managerData;
    private Bootstrap bootstrap;
    private History userHistory;
    private UserTeam userTeam;

    private ServiceApiFPL fpLapi;
    int userID;
    public int currentGW;



    private ShareViewModel viewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get data
        viewModel = ViewModelProviders.of(this).get(ShareViewModel.class);
        fpLapi = RequestManager.getRetrofitInstance(this).create(ServiceApiFPL.class);


        getUserID();

        viewModel.getUserID().observe(this, new Observer<Integer>() {
                    @Override
                    public void onChanged(Integer integer) {
                        System.out.println("ID: "+ integer);
                        userID = integer;
                        if (integer != null ) {
                            getData();

                            loadUI();

                        }
                    }
                });

    }

    private void loadUI() {
        TabPagerAdapter sectionsPagerAdapter = new TabPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
    }

    public void getData() {
        getUserEntryData(userID);
        getLiveData();
        getHistory(userID);
    }

    public void getUserID() {
        Call<ResponseBody> call = fpLapi.geUserID();

        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                if (response.isSuccessful()) {
                    System.out.println(response.toString());
                    try {
                        String jsonResponse = response.body().string();
                        JSONObject obj = new JSONObject(jsonResponse);
                        Integer userID = obj.getJSONObject("player").getInt("entry");
                        viewModel.setUserID(userID);
                    } catch (IOException | JSONException e) {
                        e.printStackTrace();
                    }

                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                System.out.println("onFailure: getManagerData " + t.getLocalizedMessage());
            }
        });
    }


    public void getUserEntryData(int userID) {

        Call<User> call = fpLapi.getUserData(userID);



        call.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                if (response.isSuccessful()) {
                    System.out.println(response.toString());
                    managerData = response.body();
                    viewModel.setUserData(managerData);

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