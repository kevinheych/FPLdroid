
package com.example.fpl.Models.Entry;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Classic implements Serializable {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("short_name")
    @Expose
    private Object shortName;
    @SerializedName("created")
    @Expose
    private String created;
    @SerializedName("closed")
    @Expose
    private Boolean closed;
    @SerializedName("rank")
    @Expose
    private Object rank;
    @SerializedName("max_entries")
    @Expose
    private Object maxEntries;
    @SerializedName("league_type")
    @Expose
    private String leagueType;
    @SerializedName("scoring")
    @Expose
    private String scoring;
    @SerializedName("admin_entry")
    @Expose
    private Integer adminEntry;
    @SerializedName("start_event")
    @Expose
    private Integer startEvent;
    @SerializedName("entry_rank")
    @Expose
    private Integer entryRank;
    @SerializedName("entry_last_rank")
    @Expose
    private Integer entryLastRank;
    @SerializedName("entry_can_leave")
    @Expose
    private Boolean entryCanLeave;
    @SerializedName("entry_can_admin")
    @Expose
    private Boolean entryCanAdmin;
    @SerializedName("entry_can_invite")
    @Expose
    private Boolean entryCanInvite;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getShortName() {
        return shortName;
    }

    public void setShortName(Object shortName) {
        this.shortName = shortName;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public Boolean getClosed() {
        return closed;
    }

    public void setClosed(Boolean closed) {
        this.closed = closed;
    }

    public Object getRank() {
        return rank;
    }

    public void setRank(Object rank) {
        this.rank = rank;
    }

    public Object getMaxEntries() {
        return maxEntries;
    }

    public void setMaxEntries(Object maxEntries) {
        this.maxEntries = maxEntries;
    }

    public String getLeagueType() {
        return leagueType;
    }

    public void setLeagueType(String leagueType) {
        this.leagueType = leagueType;
    }

    public String getScoring() {
        return scoring;
    }

    public void setScoring(String scoring) {
        this.scoring = scoring;
    }

    public Integer getAdminEntry() {
        return adminEntry;
    }

    public void setAdminEntry(Integer adminEntry) {
        this.adminEntry = adminEntry;
    }

    public Integer getStartEvent() {
        return startEvent;
    }

    public void setStartEvent(Integer startEvent) {
        this.startEvent = startEvent;
    }

    public Integer getEntryRank() {
        return entryRank;
    }

    public void setEntryRank(Integer entryRank) {
        this.entryRank = entryRank;
    }

    public Integer getEntryLastRank() {
        return entryLastRank;
    }

    public void setEntryLastRank(Integer entryLastRank) {
        this.entryLastRank = entryLastRank;
    }

    public Boolean getEntryCanLeave() {
        return entryCanLeave;
    }

    public void setEntryCanLeave(Boolean entryCanLeave) {
        this.entryCanLeave = entryCanLeave;
    }

    public Boolean getEntryCanAdmin() {
        return entryCanAdmin;
    }

    public void setEntryCanAdmin(Boolean entryCanAdmin) {
        this.entryCanAdmin = entryCanAdmin;
    }

    public Boolean getEntryCanInvite() {
        return entryCanInvite;
    }

    public void setEntryCanInvite(Boolean entryCanInvite) {
        this.entryCanInvite = entryCanInvite;
    }

}
