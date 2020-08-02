package com.example.fpl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.fpl.data.model.Standings.LeagueStandings;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LeagueStandingActivity extends AppCompatActivity {

    int league_id ;
    TextView exampleTV;
    ServiceApiFPL service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_league_standing);

        Intent i = getIntent();
        league_id = i.getIntExtra("league_id", 0);

        System.out.println(league_id);

        exampleTV = findViewById(R.id.exampleTextView);

        exampleTV.setText(String.valueOf(league_id));


        service = RequestManager.getRetrofitInstance(MyApplication.getAppContext()).create(ServiceApiFPL.class);

        Call<LeagueStandings> call = service.getStandings(league_id);

        call.enqueue(new Callback<LeagueStandings>() {
            @Override
            public void onResponse(Call<LeagueStandings> call, Response<LeagueStandings> response) {
                if (response.isSuccessful()) {
                    System.out.println("call getStandings" + response.toString());

                    LeagueStandings result = response.body();
                    exampleTV.setText(result.toString());

                }
            }

            @Override
            public void onFailure(Call<LeagueStandings> call, Throwable t) {
                System.out.println("onFailure: userTeam frag " + t.getLocalizedMessage());
            }
        });

    }




}