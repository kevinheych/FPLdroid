package com.example.fpl;

import com.example.fpl.Models.Entry.History;
import com.example.fpl.Models.Bootstrap.Bootstrap;
import com.example.fpl.Models.Entry.User;
import com.example.fpl.Models.Picks.UserTeam;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

public interface fplAPI {

/*
## Json links
 - http://fantasy.premierleague.com/api/entry/{}/event/{}/picks (FPL ID, Gameweek number) - Live team points
 - http://fantasy.premierleague.com/api/entry/{}/history (FPL ID) - GW history
 - http://fantasy.premierleague.com/api/bootstrap-static  - Contains all player data
 - http://fantasy.premierleague.com/api/entry/{}/transfers (GW number) - Transfer history
 - http://fantasy.premierleague.com/api/dream-team  - Dream team
 - http://fantasy.premierleague.com/api/entry/{}/cup - Cup History
 - https://fantasy.premierleague.com/api/event/{}/live (FPL ID) - Live Player Points
 - https://fantasy.premierleague.com/api/dream-team/{} (GW Number) - Weekly Dream Team
/
 */
    String BASE_URL = "https://fantasy.premierleague.com/api/";

    @Headers("User-Agent: Mozilla/5.0")
    @GET("entry/{id}/")
    Call<User> getUser(@Path("id") int userID);

    @Headers("User-Agent: Mozilla/5.0")
    @GET("bootstrap-static/")
    Call<Bootstrap> getLive();

    @Headers("User-Agent: Mozilla/5.0")
    @GET("entry/{id}/history/")
    Call<History> getHistory(@Path("id") int userID);


    @Headers("User-Agent: Mozilla/5.0")
    @GET("entry/{id}/event/{gw}/picks/")
    Call<UserTeam> getUserTeam(@Path("id") int userID, @Path("gw") int gw);






}
