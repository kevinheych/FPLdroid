package com.example.fpl;

import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class RequestManager {



    public Manager managerData;

    public void fetchData() {


        String url = "https://fantasy.premierleague.com/api/entry/134211/";

        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                    Manager managerData = new Manager();
                    managerData.setName(response.getString("name"));
                    managerData.setId(response.getInt("id"));
                    managerData.setPlayer_first_name(response.getString("player_first_name"));
                    managerData.setPlayer_last_name(response.getString("player_last_name"));
                    managerData.setSummary_overall_points(response.getInt("summary_overall_points"));
                    managerData.setSummary_overall_rank(response.getInt("summary_overall_rank"));
                    managerData.setSummary_event_points(response.getInt("summary_event_points"));
                    managerData.setSummary_event_rank(response.getInt("summary_event_rank"));
                    managerData.setCurrent_event(response.getInt("current_event"));
                    managerData.setLast_deadline_total_transfers(response.getInt("last_deadline_total_transfers"));
                    managerData.setLast_deadline_value(response.getInt("last_deadline_value"));
                    managerData.setLast_deadline_bank(response.getInt("last_deadline_bank"));



                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        });



    }

    public Manager getManagerData() {
        return managerData;
    }
}
