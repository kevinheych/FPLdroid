
package com.example.fpl.Models.Entry;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class User implements Serializable {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("joined_time")
    @Expose
    private String joinedTime;
    @SerializedName("started_event")
    @Expose
    private Integer startedEvent;
    @SerializedName("favourite_team")
    @Expose
    private Integer favouriteTeam;
    @SerializedName("player_first_name")
    @Expose
    private String playerFirstName;
    @SerializedName("player_last_name")
    @Expose
    private String playerLastName;
    @SerializedName("player_region_id")
    @Expose
    private Integer playerRegionId;
    @SerializedName("player_region_name")
    @Expose
    private String playerRegionName;
    @SerializedName("player_region_iso_code_short")
    @Expose
    private String playerRegionIsoCodeShort;
    @SerializedName("player_region_iso_code_long")
    @Expose
    private String playerRegionIsoCodeLong;
    @SerializedName("summary_overall_points")
    @Expose
    private Integer summaryOverallPoints;
    @SerializedName("summary_overall_rank")
    @Expose
    private Integer summaryOverallRank;
    @SerializedName("summary_event_points")
    @Expose
    private Integer summaryEventPoints;
    @SerializedName("summary_event_rank")
    @Expose
    private Integer summaryEventRank;
    @SerializedName("current_event")
    @Expose
    private Integer currentEvent;
    @SerializedName("leagues")
    @Expose
    private Leagues leagues;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("kit")
    @Expose
    private String kit;
    @SerializedName("last_deadline_bank")
    @Expose
    private Double lastDeadlineBank;
    @SerializedName("last_deadline_value")
    @Expose
    private Double lastDeadlineValue;
    @SerializedName("last_deadline_total_transfers")
    @Expose
    private Integer lastDeadlineTotalTransfers;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJoinedTime() {
        return joinedTime;
    }

    public void setJoinedTime(String joinedTime) {
        this.joinedTime = joinedTime;
    }

    public Integer getStartedEvent() {
        return startedEvent;
    }

    public void setStartedEvent(Integer startedEvent) {
        this.startedEvent = startedEvent;
    }

    public Integer getFavouriteTeam() {
        return favouriteTeam;
    }

    public void setFavouriteTeam(Integer favouriteTeam) {
        this.favouriteTeam = favouriteTeam;
    }

    public String getPlayerFirstName() {
        return playerFirstName;
    }

    public void setPlayerFirstName(String playerFirstName) {
        this.playerFirstName = playerFirstName;
    }

    public String getPlayerLastName() {
        return playerLastName;
    }

    public void setPlayerLastName(String playerLastName) {
        this.playerLastName = playerLastName;
    }

    public Integer getPlayerRegionId() {
        return playerRegionId;
    }

    public void setPlayerRegionId(Integer playerRegionId) {
        this.playerRegionId = playerRegionId;
    }

    public String getPlayerRegionName() {
        return playerRegionName;
    }

    public void setPlayerRegionName(String playerRegionName) {
        this.playerRegionName = playerRegionName;
    }

    public String getPlayerRegionIsoCodeShort() {
        return playerRegionIsoCodeShort;
    }

    public void setPlayerRegionIsoCodeShort(String playerRegionIsoCodeShort) {
        this.playerRegionIsoCodeShort = playerRegionIsoCodeShort;
    }

    public String getPlayerRegionIsoCodeLong() {
        return playerRegionIsoCodeLong;
    }

    public void setPlayerRegionIsoCodeLong(String playerRegionIsoCodeLong) {
        this.playerRegionIsoCodeLong = playerRegionIsoCodeLong;
    }

    public Integer getSummaryOverallPoints() {
        return summaryOverallPoints;
    }

    public void setSummaryOverallPoints(Integer summaryOverallPoints) {
        this.summaryOverallPoints = summaryOverallPoints;
    }

    public Integer getSummaryOverallRank() {
        return summaryOverallRank;
    }

    public void setSummaryOverallRank(Integer summaryOverallRank) {
        this.summaryOverallRank = summaryOverallRank;
    }

    public Integer getSummaryEventPoints() {
        return summaryEventPoints;
    }

    public void setSummaryEventPoints(Integer summaryEventPoints) {
        this.summaryEventPoints = summaryEventPoints;
    }

    public Integer getSummaryEventRank() {
        return summaryEventRank;
    }

    public void setSummaryEventRank(Integer summaryEventRank) {
        this.summaryEventRank = summaryEventRank;
    }

    public Integer getCurrentEvent() {
        return currentEvent;
    }

    public void setCurrentEvent(Integer currentEvent) {
        this.currentEvent = currentEvent;
    }

    public Leagues getLeagues() {
        return leagues;
    }

    public void setLeagues(Leagues leagues) {
        this.leagues = leagues;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKit() {
        return kit;
    }

    public void setKit(String kit) {
        this.kit = kit;
    }

    public Double getLastDeadlineBank() {
        return lastDeadlineBank;
    }

    public void setLastDeadlineBank(Double lastDeadlineBank) {
        this.lastDeadlineBank = lastDeadlineBank;
    }

    public Double getLastDeadlineValue() {
        return lastDeadlineValue;
    }

    public void setLastDeadlineValue(Double lastDeadlineValue) {
        this.lastDeadlineValue = lastDeadlineValue;
    }

    public Integer getLastDeadlineTotalTransfers() {
        return lastDeadlineTotalTransfers;
    }

    public void setLastDeadlineTotalTransfers(Integer lastDeadlineTotalTransfers) {
        this.lastDeadlineTotalTransfers = lastDeadlineTotalTransfers;
    }

}
