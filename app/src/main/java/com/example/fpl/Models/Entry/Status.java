
package com.example.fpl.Models.Entry;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Status implements Serializable {

    @SerializedName("qualification_event")
    @Expose
    private Integer qualificationEvent;
    @SerializedName("qualification_numbers")
    @Expose
    private Integer qualificationNumbers;
    @SerializedName("qualification_rank")
    @Expose
    private Integer qualificationRank;
    @SerializedName("qualification_state")
    @Expose
    private String qualificationState;

    public Integer getQualificationEvent() {
        return qualificationEvent;
    }

    public void setQualificationEvent(Integer qualificationEvent) {
        this.qualificationEvent = qualificationEvent;
    }

    public Integer getQualificationNumbers() {
        return qualificationNumbers;
    }

    public void setQualificationNumbers(Integer qualificationNumbers) {
        this.qualificationNumbers = qualificationNumbers;
    }

    public Integer getQualificationRank() {
        return qualificationRank;
    }

    public void setQualificationRank(Integer qualificationRank) {
        this.qualificationRank = qualificationRank;
    }

    public String getQualificationState() {
        return qualificationState;
    }

    public void setQualificationState(String qualificationState) {
        this.qualificationState = qualificationState;
    }

}
