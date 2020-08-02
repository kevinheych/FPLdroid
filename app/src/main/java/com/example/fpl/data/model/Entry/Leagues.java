
package com.example.fpl.data.model.Entry;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Leagues implements Serializable {

    @SerializedName("classic")
    @Expose
    private List<Classic> classic = null;
    @SerializedName("h2h")
    @Expose
    private List<Object> h2h = null;
    @SerializedName("cup")
    @Expose
    private Cup cup;

    public List<Classic> getClassic() {
        return classic;
    }

    public void setClassic(List<Classic> classic) {
        this.classic = classic;
    }

    public List<Object> getH2h() {
        return h2h;
    }

    public void setH2h(List<Object> h2h) {
        this.h2h = h2h;
    }

    public Cup getCup() {
        return cup;
    }

    public void setCup(Cup cup) {
        this.cup = cup;
    }

    @Override
    public String toString() {
        return "Leagues{" +
                "classic=" + classic +
                ", h2h=" + h2h +
                ", cup=" + cup +
                '}';
    }
}
