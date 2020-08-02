package com.example.fpl.data.model.Standings;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class League {
    @Expose
    @SerializedName("code_privacy")
    private String code_privacy;
    @Expose
    @SerializedName("start_event")
    private int start_event;
    @Expose
    @SerializedName("admin_entry")
    private int admin_entry;
    @Expose
    @SerializedName("scoring")
    private String scoring;
    @Expose
    @SerializedName("league_type")
    private String league_type;
    @Expose
    @SerializedName("closed")
    private boolean closed;
    @Expose
    @SerializedName("created")
    private String created;
    @Expose
    @SerializedName("name")
    private String name;
    @Expose
    @SerializedName("id")
    private int id;

    public String getCode_privacy() {
        return code_privacy;
    }

    public void setCode_privacy(String code_privacy) {
        this.code_privacy = code_privacy;
    }

    public int getStart_event() {
        return start_event;
    }

    public void setStart_event(int start_event) {
        this.start_event = start_event;
    }

    public int getAdmin_entry() {
        return admin_entry;
    }

    public void setAdmin_entry(int admin_entry) {
        this.admin_entry = admin_entry;
    }

    public String getScoring() {
        return scoring;
    }

    public void setScoring(String scoring) {
        this.scoring = scoring;
    }

    public String getLeague_type() {
        return league_type;
    }

    public void setLeague_type(String league_type) {
        this.league_type = league_type;
    }

    public boolean getClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "League{" +
                "code_privacy='" + code_privacy + '\'' +
                ", start_event=" + start_event +
                ", admin_entry=" + admin_entry +
                ", scoring='" + scoring + '\'' +
                ", league_type='" + league_type + '\'' +
                ", closed=" + closed +
                ", created='" + created + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
