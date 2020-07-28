package com.example.fpl.Models.Bootstrap;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Game_settings implements Serializable {
    @Expose
    @SerializedName("timezone")
    private String timezone;
    @Expose
    @SerializedName("league_h2h_tiebreak_stats")
    private List<String> league_h2h_tiebreak_stats;
    @Expose
    @SerializedName("transfers_sell_on_fee")
    private double transfers_sell_on_fee;
    @Expose
    @SerializedName("sys_vice_captain_enabled")
    private boolean sys_vice_captain_enabled;
    @Expose
    @SerializedName("stats_form_days")
    private int stats_form_days;
    @Expose
    @SerializedName("ui_special_shirt_exclusions")
    private List<String> ui_special_shirt_exclusions;
    @Expose
    @SerializedName("ui_use_special_shirts")
    private boolean ui_use_special_shirts;
    @Expose
    @SerializedName("ui_currency_multiplier")
    private int ui_currency_multiplier;
    @Expose
    @SerializedName("squad_total_spend")
    private int squad_total_spend;
    @Expose
    @SerializedName("squad_team_limit")
    private int squad_team_limit;
    @Expose
    @SerializedName("squad_squadsize")
    private int squad_squadsize;
    @Expose
    @SerializedName("squad_squadplay")
    private int squad_squadplay;
    @Expose
    @SerializedName("cup_type")
    private String cup_type;
    @Expose
    @SerializedName("cup_qualifying_method")
    private String cup_qualifying_method;
    @Expose
    @SerializedName("cup_stop_event_id")
    private int cup_stop_event_id;
    @Expose
    @SerializedName("cup_start_event_id")
    private int cup_start_event_id;
    @Expose
    @SerializedName("league_ko_first_instead_of_random")
    private boolean league_ko_first_instead_of_random;
    @Expose
    @SerializedName("league_points_h2h_draw")
    private int league_points_h2h_draw;
    @Expose
    @SerializedName("league_points_h2h_lose")
    private int league_points_h2h_lose;
    @Expose
    @SerializedName("league_points_h2h_win")
    private int league_points_h2h_win;
    @Expose
    @SerializedName("league_prefix_public")
    private String league_prefix_public;
    @Expose
    @SerializedName("league_max_ko_rounds_private_h2h")
    private int league_max_ko_rounds_private_h2h;
    @Expose
    @SerializedName("league_max_size_private_h2h")
    private int league_max_size_private_h2h;
    @Expose
    @SerializedName("league_max_size_public_h2h")
    private int league_max_size_public_h2h;
    @Expose
    @SerializedName("league_max_size_public_classic")
    private int league_max_size_public_classic;
    @Expose
    @SerializedName("league_join_public_max")
    private int league_join_public_max;
    @Expose
    @SerializedName("league_join_private_max")
    private int league_join_private_max;

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public List<String> getLeague_h2h_tiebreak_stats() {
        return league_h2h_tiebreak_stats;
    }

    public void setLeague_h2h_tiebreak_stats(List<String> league_h2h_tiebreak_stats) {
        this.league_h2h_tiebreak_stats = league_h2h_tiebreak_stats;
    }

    public double getTransfers_sell_on_fee() {
        return transfers_sell_on_fee;
    }

    public void setTransfers_sell_on_fee(double transfers_sell_on_fee) {
        this.transfers_sell_on_fee = transfers_sell_on_fee;
    }

    public boolean getSys_vice_captain_enabled() {
        return sys_vice_captain_enabled;
    }

    public void setSys_vice_captain_enabled(boolean sys_vice_captain_enabled) {
        this.sys_vice_captain_enabled = sys_vice_captain_enabled;
    }

    public int getStats_form_days() {
        return stats_form_days;
    }

    public void setStats_form_days(int stats_form_days) {
        this.stats_form_days = stats_form_days;
    }

    public List<String> getUi_special_shirt_exclusions() {
        return ui_special_shirt_exclusions;
    }

    public void setUi_special_shirt_exclusions(List<String> ui_special_shirt_exclusions) {
        this.ui_special_shirt_exclusions = ui_special_shirt_exclusions;
    }

    public boolean getUi_use_special_shirts() {
        return ui_use_special_shirts;
    }

    public void setUi_use_special_shirts(boolean ui_use_special_shirts) {
        this.ui_use_special_shirts = ui_use_special_shirts;
    }

    public int getUi_currency_multiplier() {
        return ui_currency_multiplier;
    }

    public void setUi_currency_multiplier(int ui_currency_multiplier) {
        this.ui_currency_multiplier = ui_currency_multiplier;
    }

    public int getSquad_total_spend() {
        return squad_total_spend;
    }

    public void setSquad_total_spend(int squad_total_spend) {
        this.squad_total_spend = squad_total_spend;
    }

    public int getSquad_team_limit() {
        return squad_team_limit;
    }

    public void setSquad_team_limit(int squad_team_limit) {
        this.squad_team_limit = squad_team_limit;
    }

    public int getSquad_squadsize() {
        return squad_squadsize;
    }

    public void setSquad_squadsize(int squad_squadsize) {
        this.squad_squadsize = squad_squadsize;
    }

    public int getSquad_squadplay() {
        return squad_squadplay;
    }

    public void setSquad_squadplay(int squad_squadplay) {
        this.squad_squadplay = squad_squadplay;
    }

    public String getCup_type() {
        return cup_type;
    }

    public void setCup_type(String cup_type) {
        this.cup_type = cup_type;
    }

    public String getCup_qualifying_method() {
        return cup_qualifying_method;
    }

    public void setCup_qualifying_method(String cup_qualifying_method) {
        this.cup_qualifying_method = cup_qualifying_method;
    }

    public int getCup_stop_event_id() {
        return cup_stop_event_id;
    }

    public void setCup_stop_event_id(int cup_stop_event_id) {
        this.cup_stop_event_id = cup_stop_event_id;
    }

    public int getCup_start_event_id() {
        return cup_start_event_id;
    }

    public void setCup_start_event_id(int cup_start_event_id) {
        this.cup_start_event_id = cup_start_event_id;
    }

    public boolean getLeague_ko_first_instead_of_random() {
        return league_ko_first_instead_of_random;
    }

    public void setLeague_ko_first_instead_of_random(boolean league_ko_first_instead_of_random) {
        this.league_ko_first_instead_of_random = league_ko_first_instead_of_random;
    }

    public int getLeague_points_h2h_draw() {
        return league_points_h2h_draw;
    }

    public void setLeague_points_h2h_draw(int league_points_h2h_draw) {
        this.league_points_h2h_draw = league_points_h2h_draw;
    }

    public int getLeague_points_h2h_lose() {
        return league_points_h2h_lose;
    }

    public void setLeague_points_h2h_lose(int league_points_h2h_lose) {
        this.league_points_h2h_lose = league_points_h2h_lose;
    }

    public int getLeague_points_h2h_win() {
        return league_points_h2h_win;
    }

    public void setLeague_points_h2h_win(int league_points_h2h_win) {
        this.league_points_h2h_win = league_points_h2h_win;
    }

    public String getLeague_prefix_public() {
        return league_prefix_public;
    }

    public void setLeague_prefix_public(String league_prefix_public) {
        this.league_prefix_public = league_prefix_public;
    }

    public int getLeague_max_ko_rounds_private_h2h() {
        return league_max_ko_rounds_private_h2h;
    }

    public void setLeague_max_ko_rounds_private_h2h(int league_max_ko_rounds_private_h2h) {
        this.league_max_ko_rounds_private_h2h = league_max_ko_rounds_private_h2h;
    }

    public int getLeague_max_size_private_h2h() {
        return league_max_size_private_h2h;
    }

    public void setLeague_max_size_private_h2h(int league_max_size_private_h2h) {
        this.league_max_size_private_h2h = league_max_size_private_h2h;
    }

    public int getLeague_max_size_public_h2h() {
        return league_max_size_public_h2h;
    }

    public void setLeague_max_size_public_h2h(int league_max_size_public_h2h) {
        this.league_max_size_public_h2h = league_max_size_public_h2h;
    }

    public int getLeague_max_size_public_classic() {
        return league_max_size_public_classic;
    }

    public void setLeague_max_size_public_classic(int league_max_size_public_classic) {
        this.league_max_size_public_classic = league_max_size_public_classic;
    }

    public int getLeague_join_public_max() {
        return league_join_public_max;
    }

    public void setLeague_join_public_max(int league_join_public_max) {
        this.league_join_public_max = league_join_public_max;
    }

    public int getLeague_join_private_max() {
        return league_join_private_max;
    }

    public void setLeague_join_private_max(int league_join_private_max) {
        this.league_join_private_max = league_join_private_max;
    }
}
