
package com.example.fpl.data.model.Entry;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Cup implements Serializable {

    @SerializedName("matches")
    @Expose
    private List<Match> matches = null;
    @SerializedName("status")
    @Expose
    private Status status;

    public List<Match> getMatches() {
        return matches;
    }

    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Cup{" +
                "matches=" + matches +
                ", status=" + status +
                '}';
    }
}
