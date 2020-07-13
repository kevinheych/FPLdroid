package com.example.fpl;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    private Manager managerData = new Manager();
    private RequestQueue mQueue;
    private TextView managerText;
    private TextView teamNameText;
    private TextView gameweekHeader ;
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
    private TextView totalTransfersText ;
    private TextView ITBText ;
    private TextView teamValueText;
    private TextView wildcardText;
    private TextView freehitText;
    private TextView benchboostText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //view outlets
        managerText = findViewById(R.id.managerText);
        teamNameText = findViewById(R.id.teamNameText);
        gameweekHeader = findViewById(R.id.gameweekHeader);
        averageText = findViewById(R.id.averageText);
        yourScoreText = findViewById(R.id.yourScoreText);
        highText = findViewById(R.id.highText);
        gwRankText = findViewById(R.id.gwRankText);
        overallRankText = findViewById(R.id.overallRankText);
        totalPlayerText = findViewById(R.id.totalPlayerText);
        teamIDText = findViewById(R.id.teamIDText);
        overallPointsText = findViewById(R.id.overallPointsText);
        gwPointsText = findViewById(R.id.gwPointsText);
        gwTransfersText = findViewById(R.id.gwTransfersText);
        totalTransfersText = findViewById(R.id.totalTransfersText);
        ITBText = findViewById(R.id.ITBText);
        teamValueText = findViewById(R.id.teamValueText);
        wildcardText = findViewById(R.id.wildcardText);
        freehitText = findViewById(R.id.freehitText);
        benchboostText = findViewById(R.id.benchboostText);


        mQueue = Volley.newRequestQueue(getApplicationContext());
        fetchData();


        loadViews();


    }

    public void fetchData() {

        RequestQueue requestQueue = Volley.newRequestQueue(getApplicationContext());

        String url = "https://fantasy.premierleague.com/api/entry/134211/";

        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                    managerData = new Manager();
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

                    loadViews();

                    //Toast.makeText(getApplicationContext(), "I am OK !" + response.toString(), Toast.LENGTH_LONG).show();
                } catch (JSONException e) {
                    e.printStackTrace();
                    Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_LONG).show();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        });

        requestQueue.add(request);

    }

    public void loadViews() {

        managerText.setText(managerData.player_first_name + " " + managerData.player_last_name);
        teamNameText.setText(managerData.name);
        gameweekHeader.setText("Gameweek " + String.valueOf(managerData.current_event) );
       // averageText.setText(String.valueOf(managerData.a));
        yourScoreText.setText(String.valueOf(managerData.summary_event_points));
        gwRankText.setText(String.valueOf(managerData.summary_event_rank));
        overallRankText.setText(String.valueOf(managerData.summary_overall_rank));
        teamIDText.setText(String.valueOf(managerData.id));
        overallPointsText.setText(String.valueOf(managerData.summary_overall_points));
        gwPointsText.setText(String.valueOf(managerData.summary_event_points));

       // gwTransfersText.setText(String.valueOf(managerData.tr));
        totalTransfersText.setText(String.valueOf(managerData.last_deadline_total_transfers));
        ITBText.setText(String.valueOf(managerData.last_deadline_bank));
        teamValueText.setText(String.valueOf(managerData.last_deadline_value));

       // wildcardText
        //freehitText
        //benchboostText



    }


}