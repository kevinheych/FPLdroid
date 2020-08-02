package com.example.fpl;

import com.example.fpl.data.model.Entry.History;
import com.example.fpl.data.model.Bootstrap.Bootstrap;
import com.example.fpl.data.model.Entry.User;
import com.example.fpl.data.model.Picks.UserTeam;
import com.example.fpl.data.model.Standings.LeagueStandings;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface ServiceApiFPL {

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
    @GET("me/")
    Call<ResponseBody> geUserID();

    @Headers("User-Agent: Mozilla/5.0")
    @GET("entry/{id}/")
    Call<User> getUserData(@Path("id") int userID);

    @Headers("User-Agent: Mozilla/5.0")
    @GET("bootstrap-static/")
    Call<Bootstrap> getLive();

    @Headers("User-Agent: Mozilla/5.0")
    @GET("entry/{id}/history/")
    Call<History> getHistory(@Path("id") int userID);


    @Headers("User-Agent: Mozilla/5.0")
    @GET("entry/{id}/event/{gw}/picks/")
    Call<UserTeam> getUserTeam(@Path("id") int userID, @Path("gw") int gw);

    @Headers("User-Agent: Mozilla/5.0")
    @POST("https://users.premierleague.com/accounts/login/")
    Call<ResponseBody> login(@Body RequestBody body);

    @Headers("User-Agent: Mozilla/5.0")
    @GET("leagues-classic/{league_id}/standings/")
    Call<LeagueStandings> getStandings(@Path("league_id") int leagueID);











}
