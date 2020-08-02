package com.example.fpl.data.model.Standings;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Standings {
    @Expose
    @SerializedName("results")
    private List<Results> results;
    @Expose
    @SerializedName("page")
    private int page;
    @Expose
    @SerializedName("has_next")
    private boolean has_next;

    public List<Results> getResults() {
        return results;
    }

    public void setResults(List<Results> results) {
        this.results = results;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public boolean getHas_next() {
        return has_next;
    }

    public void setHas_next(boolean has_next) {
        this.has_next = has_next;
    }

    @Override
    public String toString() {
        return "Standings{" +
                "results=" + results +
                ", page=" + page +
                ", has_next=" + has_next +
                '}';
    }
}
