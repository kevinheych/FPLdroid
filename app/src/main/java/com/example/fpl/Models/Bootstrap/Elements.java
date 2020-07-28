package com.example.fpl.Models.Bootstrap;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Elements implements Serializable {
    @Expose
    @SerializedName("ict_index_rank_type")
    private int ict_index_rank_type;
    @Expose
    @SerializedName("ict_index_rank")
    private int ict_index_rank;
    @Expose
    @SerializedName("threat_rank_type")
    private int threat_rank_type;
    @Expose
    @SerializedName("threat_rank")
    private int threat_rank;
    @Expose
    @SerializedName("creativity_rank_type")
    private int creativity_rank_type;
    @Expose
    @SerializedName("creativity_rank")
    private int creativity_rank;
    @Expose
    @SerializedName("influence_rank_type")
    private int influence_rank_type;
    @Expose
    @SerializedName("influence_rank")
    private int influence_rank;
    @Expose
    @SerializedName("ict_index")
    private String ict_index;
    @Expose
    @SerializedName("threat")
    private String threat;
    @Expose
    @SerializedName("creativity")
    private String creativity;
    @Expose
    @SerializedName("influence")
    private String influence;
    @Expose
    @SerializedName("bps")
    private int bps;
    @Expose
    @SerializedName("bonus")
    private int bonus;
    @Expose
    @SerializedName("saves")
    private int saves;
    @Expose
    @SerializedName("red_cards")
    private int red_cards;
    @Expose
    @SerializedName("yellow_cards")
    private int yellow_cards;
    @Expose
    @SerializedName("penalties_missed")
    private int penalties_missed;
    @Expose
    @SerializedName("penalties_saved")
    private int penalties_saved;
    @Expose
    @SerializedName("own_goals")
    private int own_goals;
    @Expose
    @SerializedName("goals_conceded")
    private int goals_conceded;
    @Expose
    @SerializedName("clean_sheets")
    private int clean_sheets;
    @Expose
    @SerializedName("assists")
    private int assists;
    @Expose
    @SerializedName("goals_scored")
    private int goals_scored;
    @Expose
    @SerializedName("minutes")
    private int minutes;
    @Expose
    @SerializedName("web_name")
    private String web_name;
    @Expose
    @SerializedName("value_season")
    private String value_season;
    @Expose
    @SerializedName("value_form")
    private String value_form;
    @Expose
    @SerializedName("transfers_out_event")
    private int transfers_out_event;
    @Expose
    @SerializedName("transfers_out")
    private int transfers_out;
    @Expose
    @SerializedName("transfers_in_event")
    private int transfers_in_event;
    @Expose
    @SerializedName("transfers_in")
    private int transfers_in;
    @Expose
    @SerializedName("total_points")
    private int total_points;
    @Expose
    @SerializedName("team_code")
    private int team_code;
    @Expose
    @SerializedName("team")
    private int team;
    @Expose
    @SerializedName("status")
    private String status;
    @Expose
    @SerializedName("special")
    private boolean special;
    @Expose
    @SerializedName("selected_by_percent")
    private String selected_by_percent;
    @Expose
    @SerializedName("second_name")
    private String second_name;
    @Expose
    @SerializedName("points_per_game")
    private String points_per_game;
    @Expose
    @SerializedName("photo")
    private String photo;
    @Expose
    @SerializedName("now_cost")
    private int now_cost;
    @Expose
    @SerializedName("news_added")
    private String news_added;
    @Expose
    @SerializedName("news")
    private String news;
    @Expose
    @SerializedName("in_dreamteam")
    private boolean in_dreamteam;
    @Expose
    @SerializedName("id")
    private int id;
    @Expose
    @SerializedName("form")
    private String form;
    @Expose
    @SerializedName("first_name")
    private String first_name;
    @Expose
    @SerializedName("event_points")
    private int event_points;
    @Expose
    @SerializedName("ep_this")
    private String ep_this;
    @Expose
    @SerializedName("ep_next")
    private String ep_next;
    @Expose
    @SerializedName("element_type")
    private int element_type;
    @Expose
    @SerializedName("dreamteam_count")
    private int dreamteam_count;
    @Expose
    @SerializedName("cost_change_start_fall")
    private int cost_change_start_fall;
    @Expose
    @SerializedName("cost_change_start")
    private int cost_change_start;
    @Expose
    @SerializedName("cost_change_event_fall")
    private int cost_change_event_fall;
    @Expose
    @SerializedName("cost_change_event")
    private int cost_change_event;
    @Expose
    @SerializedName("code")
    private int code;
    @Expose
    @SerializedName("chance_of_playing_this_round")
    private int chance_of_playing_this_round;
    @Expose
    @SerializedName("chance_of_playing_next_round")
    private int chance_of_playing_next_round;

    public int getIct_index_rank_type() {
        return ict_index_rank_type;
    }

    public void setIct_index_rank_type(int ict_index_rank_type) {
        this.ict_index_rank_type = ict_index_rank_type;
    }

    public int getIct_index_rank() {
        return ict_index_rank;
    }

    public void setIct_index_rank(int ict_index_rank) {
        this.ict_index_rank = ict_index_rank;
    }

    public int getThreat_rank_type() {
        return threat_rank_type;
    }

    public void setThreat_rank_type(int threat_rank_type) {
        this.threat_rank_type = threat_rank_type;
    }

    public int getThreat_rank() {
        return threat_rank;
    }

    public void setThreat_rank(int threat_rank) {
        this.threat_rank = threat_rank;
    }

    public int getCreativity_rank_type() {
        return creativity_rank_type;
    }

    public void setCreativity_rank_type(int creativity_rank_type) {
        this.creativity_rank_type = creativity_rank_type;
    }

    public int getCreativity_rank() {
        return creativity_rank;
    }

    public void setCreativity_rank(int creativity_rank) {
        this.creativity_rank = creativity_rank;
    }

    public int getInfluence_rank_type() {
        return influence_rank_type;
    }

    public void setInfluence_rank_type(int influence_rank_type) {
        this.influence_rank_type = influence_rank_type;
    }

    public int getInfluence_rank() {
        return influence_rank;
    }

    public void setInfluence_rank(int influence_rank) {
        this.influence_rank = influence_rank;
    }

    public String getIct_index() {
        return ict_index;
    }

    public void setIct_index(String ict_index) {
        this.ict_index = ict_index;
    }

    public String getThreat() {
        return threat;
    }

    public void setThreat(String threat) {
        this.threat = threat;
    }

    public String getCreativity() {
        return creativity;
    }

    public void setCreativity(String creativity) {
        this.creativity = creativity;
    }

    public String getInfluence() {
        return influence;
    }

    public void setInfluence(String influence) {
        this.influence = influence;
    }

    public int getBps() {
        return bps;
    }

    public void setBps(int bps) {
        this.bps = bps;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getSaves() {
        return saves;
    }

    public void setSaves(int saves) {
        this.saves = saves;
    }

    public int getRed_cards() {
        return red_cards;
    }

    public void setRed_cards(int red_cards) {
        this.red_cards = red_cards;
    }

    public int getYellow_cards() {
        return yellow_cards;
    }

    public void setYellow_cards(int yellow_cards) {
        this.yellow_cards = yellow_cards;
    }

    public int getPenalties_missed() {
        return penalties_missed;
    }

    public void setPenalties_missed(int penalties_missed) {
        this.penalties_missed = penalties_missed;
    }

    public int getPenalties_saved() {
        return penalties_saved;
    }

    public void setPenalties_saved(int penalties_saved) {
        this.penalties_saved = penalties_saved;
    }

    public int getOwn_goals() {
        return own_goals;
    }

    public void setOwn_goals(int own_goals) {
        this.own_goals = own_goals;
    }

    public int getGoals_conceded() {
        return goals_conceded;
    }

    public void setGoals_conceded(int goals_conceded) {
        this.goals_conceded = goals_conceded;
    }

    public int getClean_sheets() {
        return clean_sheets;
    }

    public void setClean_sheets(int clean_sheets) {
        this.clean_sheets = clean_sheets;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public int getGoals_scored() {
        return goals_scored;
    }

    public void setGoals_scored(int goals_scored) {
        this.goals_scored = goals_scored;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public String getWeb_name() {
        return web_name;
    }

    public void setWeb_name(String web_name) {
        this.web_name = web_name;
    }

    public String getValue_season() {
        return value_season;
    }

    public void setValue_season(String value_season) {
        this.value_season = value_season;
    }

    public String getValue_form() {
        return value_form;
    }

    public void setValue_form(String value_form) {
        this.value_form = value_form;
    }

    public int getTransfers_out_event() {
        return transfers_out_event;
    }

    public void setTransfers_out_event(int transfers_out_event) {
        this.transfers_out_event = transfers_out_event;
    }

    public int getTransfers_out() {
        return transfers_out;
    }

    public void setTransfers_out(int transfers_out) {
        this.transfers_out = transfers_out;
    }

    public int getTransfers_in_event() {
        return transfers_in_event;
    }

    public void setTransfers_in_event(int transfers_in_event) {
        this.transfers_in_event = transfers_in_event;
    }

    public int getTransfers_in() {
        return transfers_in;
    }

    public void setTransfers_in(int transfers_in) {
        this.transfers_in = transfers_in;
    }

    public int getTotal_points() {
        return total_points;
    }

    public void setTotal_points(int total_points) {
        this.total_points = total_points;
    }

    public int getTeam_code() {
        return team_code;
    }

    public void setTeam_code(int team_code) {
        this.team_code = team_code;
    }

    public int getTeam() {
        return team;
    }

    public void setTeam(int team) {
        this.team = team;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean getSpecial() {
        return special;
    }

    public void setSpecial(boolean special) {
        this.special = special;
    }

    public String getSelected_by_percent() {
        return selected_by_percent;
    }

    public void setSelected_by_percent(String selected_by_percent) {
        this.selected_by_percent = selected_by_percent;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public String getPoints_per_game() {
        return points_per_game;
    }

    public void setPoints_per_game(String points_per_game) {
        this.points_per_game = points_per_game;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getNow_cost() {
        return now_cost;
    }

    public void setNow_cost(int now_cost) {
        this.now_cost = now_cost;
    }

    public String getNews_added() {
        return news_added;
    }

    public void setNews_added(String news_added) {
        this.news_added = news_added;
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }

    public boolean getIn_dreamteam() {
        return in_dreamteam;
    }

    public void setIn_dreamteam(boolean in_dreamteam) {
        this.in_dreamteam = in_dreamteam;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public int getEvent_points() {
        return event_points;
    }

    public void setEvent_points(int event_points) {
        this.event_points = event_points;
    }

    public String getEp_this() {
        return ep_this;
    }

    public void setEp_this(String ep_this) {
        this.ep_this = ep_this;
    }

    public String getEp_next() {
        return ep_next;
    }

    public void setEp_next(String ep_next) {
        this.ep_next = ep_next;
    }

    public int getElement_type() {
        return element_type;
    }

    public void setElement_type(int element_type) {
        this.element_type = element_type;
    }

    public int getDreamteam_count() {
        return dreamteam_count;
    }

    public void setDreamteam_count(int dreamteam_count) {
        this.dreamteam_count = dreamteam_count;
    }

    public int getCost_change_start_fall() {
        return cost_change_start_fall;
    }

    public void setCost_change_start_fall(int cost_change_start_fall) {
        this.cost_change_start_fall = cost_change_start_fall;
    }

    public int getCost_change_start() {
        return cost_change_start;
    }

    public void setCost_change_start(int cost_change_start) {
        this.cost_change_start = cost_change_start;
    }

    public int getCost_change_event_fall() {
        return cost_change_event_fall;
    }

    public void setCost_change_event_fall(int cost_change_event_fall) {
        this.cost_change_event_fall = cost_change_event_fall;
    }

    public int getCost_change_event() {
        return cost_change_event;
    }

    public void setCost_change_event(int cost_change_event) {
        this.cost_change_event = cost_change_event;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getChance_of_playing_this_round() {
        return chance_of_playing_this_round;
    }

    public void setChance_of_playing_this_round(int chance_of_playing_this_round) {
        this.chance_of_playing_this_round = chance_of_playing_this_round;
    }

    public int getChance_of_playing_next_round() {
        return chance_of_playing_next_round;
    }

    public void setChance_of_playing_next_round(int chance_of_playing_next_round) {
        this.chance_of_playing_next_round = chance_of_playing_next_round;
    }
}
