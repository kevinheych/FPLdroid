
package com.example.fpl.Models.Entry;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Match  implements Serializable {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("entry_1_entry")
    @Expose
    private Integer entry1Entry;
    @SerializedName("entry_1_name")
    @Expose
    private String entry1Name;
    @SerializedName("entry_1_player_name")
    @Expose
    private String entry1PlayerName;
    @SerializedName("entry_1_points")
    @Expose
    private Integer entry1Points;
    @SerializedName("entry_1_win")
    @Expose
    private Integer entry1Win;
    @SerializedName("entry_1_draw")
    @Expose
    private Integer entry1Draw;
    @SerializedName("entry_1_loss")
    @Expose
    private Integer entry1Loss;
    @SerializedName("entry_1_total")
    @Expose
    private Integer entry1Total;
    @SerializedName("entry_2_entry")
    @Expose
    private Integer entry2Entry;
    @SerializedName("entry_2_name")
    @Expose
    private String entry2Name;
    @SerializedName("entry_2_player_name")
    @Expose
    private String entry2PlayerName;
    @SerializedName("entry_2_points")
    @Expose
    private Integer entry2Points;
    @SerializedName("entry_2_win")
    @Expose
    private Integer entry2Win;
    @SerializedName("entry_2_draw")
    @Expose
    private Integer entry2Draw;
    @SerializedName("entry_2_loss")
    @Expose
    private Integer entry2Loss;
    @SerializedName("entry_2_total")
    @Expose
    private Integer entry2Total;
    @SerializedName("is_knockout")
    @Expose
    private Boolean isKnockout;
    @SerializedName("winner")
    @Expose
    private Integer winner;
    @SerializedName("seed_value")
    @Expose
    private Object seedValue;
    @SerializedName("event")
    @Expose
    private Integer event;
    @SerializedName("tiebreak")
    @Expose
    private Object tiebreak;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEntry1Entry() {
        return entry1Entry;
    }

    public void setEntry1Entry(Integer entry1Entry) {
        this.entry1Entry = entry1Entry;
    }

    public String getEntry1Name() {
        return entry1Name;
    }

    public void setEntry1Name(String entry1Name) {
        this.entry1Name = entry1Name;
    }

    public String getEntry1PlayerName() {
        return entry1PlayerName;
    }

    public void setEntry1PlayerName(String entry1PlayerName) {
        this.entry1PlayerName = entry1PlayerName;
    }

    public Integer getEntry1Points() {
        return entry1Points;
    }

    public void setEntry1Points(Integer entry1Points) {
        this.entry1Points = entry1Points;
    }

    public Integer getEntry1Win() {
        return entry1Win;
    }

    public void setEntry1Win(Integer entry1Win) {
        this.entry1Win = entry1Win;
    }

    public Integer getEntry1Draw() {
        return entry1Draw;
    }

    public void setEntry1Draw(Integer entry1Draw) {
        this.entry1Draw = entry1Draw;
    }

    public Integer getEntry1Loss() {
        return entry1Loss;
    }

    public void setEntry1Loss(Integer entry1Loss) {
        this.entry1Loss = entry1Loss;
    }

    public Integer getEntry1Total() {
        return entry1Total;
    }

    public void setEntry1Total(Integer entry1Total) {
        this.entry1Total = entry1Total;
    }

    public Integer getEntry2Entry() {
        return entry2Entry;
    }

    public void setEntry2Entry(Integer entry2Entry) {
        this.entry2Entry = entry2Entry;
    }

    public String getEntry2Name() {
        return entry2Name;
    }

    public void setEntry2Name(String entry2Name) {
        this.entry2Name = entry2Name;
    }

    public String getEntry2PlayerName() {
        return entry2PlayerName;
    }

    public void setEntry2PlayerName(String entry2PlayerName) {
        this.entry2PlayerName = entry2PlayerName;
    }

    public Integer getEntry2Points() {
        return entry2Points;
    }

    public void setEntry2Points(Integer entry2Points) {
        this.entry2Points = entry2Points;
    }

    public Integer getEntry2Win() {
        return entry2Win;
    }

    public void setEntry2Win(Integer entry2Win) {
        this.entry2Win = entry2Win;
    }

    public Integer getEntry2Draw() {
        return entry2Draw;
    }

    public void setEntry2Draw(Integer entry2Draw) {
        this.entry2Draw = entry2Draw;
    }

    public Integer getEntry2Loss() {
        return entry2Loss;
    }

    public void setEntry2Loss(Integer entry2Loss) {
        this.entry2Loss = entry2Loss;
    }

    public Integer getEntry2Total() {
        return entry2Total;
    }

    public void setEntry2Total(Integer entry2Total) {
        this.entry2Total = entry2Total;
    }

    public Boolean getIsKnockout() {
        return isKnockout;
    }

    public void setIsKnockout(Boolean isKnockout) {
        this.isKnockout = isKnockout;
    }

    public Integer getWinner() {
        return winner;
    }

    public void setWinner(Integer winner) {
        this.winner = winner;
    }

    public Object getSeedValue() {
        return seedValue;
    }

    public void setSeedValue(Object seedValue) {
        this.seedValue = seedValue;
    }

    public Integer getEvent() {
        return event;
    }

    public void setEvent(Integer event) {
        this.event = event;
    }

    public Object getTiebreak() {
        return tiebreak;
    }

    public void setTiebreak(Object tiebreak) {
        this.tiebreak = tiebreak;
    }

}
