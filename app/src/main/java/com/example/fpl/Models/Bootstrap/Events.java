package com.example.fpl.Models.Bootstrap;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Events implements Serializable {
    @Expose
    @SerializedName("most_vice_captained")
    private int most_vice_captained;
    @Expose
    @SerializedName("most_captained")
    private int most_captained;
    @Expose
    @SerializedName("transfers_made")
    private int transfers_made;
    @Expose
    @SerializedName("top_element_info")
    private Top_element_info top_element_info;
    @Expose
    @SerializedName("top_element")
    private int top_element;
    @Expose
    @SerializedName("most_transferred_in")
    private int most_transferred_in;
    @Expose
    @SerializedName("most_selected")
    private int most_selected;
    @Expose
    @SerializedName("chip_plays")
    private List<Chip_plays> chip_plays;
    @Expose
    @SerializedName("is_next")
    private boolean is_next;
    @Expose
    @SerializedName("is_current")
    private boolean is_current;
    @Expose
    @SerializedName("is_previous")
    private boolean is_previous;
    @Expose
    @SerializedName("highest_score")
    private int highest_score;
    @Expose
    @SerializedName("deadline_time_game_offset")
    private int deadline_time_game_offset;
    @Expose
    @SerializedName("deadline_time_epoch")
    private int deadline_time_epoch;
    @Expose
    @SerializedName("highest_scoring_entry")
    private int highest_scoring_entry;
    @Expose
    @SerializedName("data_checked")
    private boolean data_checked;
    @Expose
    @SerializedName("finished")
    private boolean finished;
    @Expose
    @SerializedName("average_entry_score")
    private int average_entry_score;
    @Expose
    @SerializedName("deadline_time")
    private String deadline_time;
    @Expose
    @SerializedName("name")
    private String name;
    @Expose
    @SerializedName("id")
    private int id;

    public int getMost_vice_captained() {
        return most_vice_captained;
    }

    public void setMost_vice_captained(int most_vice_captained) {
        this.most_vice_captained = most_vice_captained;
    }

    public int getMost_captained() {
        return most_captained;
    }

    public void setMost_captained(int most_captained) {
        this.most_captained = most_captained;
    }

    public int getTransfers_made() {
        return transfers_made;
    }

    public void setTransfers_made(int transfers_made) {
        this.transfers_made = transfers_made;
    }

    public Top_element_info getTop_element_info() {
        return top_element_info;
    }

    public void setTop_element_info(Top_element_info top_element_info) {
        this.top_element_info = top_element_info;
    }

    public int getTop_element() {
        return top_element;
    }

    public void setTop_element(int top_element) {
        this.top_element = top_element;
    }

    public int getMost_transferred_in() {
        return most_transferred_in;
    }

    public void setMost_transferred_in(int most_transferred_in) {
        this.most_transferred_in = most_transferred_in;
    }

    public int getMost_selected() {
        return most_selected;
    }

    public void setMost_selected(int most_selected) {
        this.most_selected = most_selected;
    }

    public List<Chip_plays> getChip_plays() {
        return chip_plays;
    }

    public void setChip_plays(List<Chip_plays> chip_plays) {
        this.chip_plays = chip_plays;
    }

    public boolean getIs_next() {
        return is_next;
    }

    public void setIs_next(boolean is_next) {
        this.is_next = is_next;
    }

    public boolean getIs_current() {
        return is_current;
    }

    public void setIs_current(boolean is_current) {
        this.is_current = is_current;
    }

    public boolean getIs_previous() {
        return is_previous;
    }

    public void setIs_previous(boolean is_previous) {
        this.is_previous = is_previous;
    }

    public int getHighest_score() {
        return highest_score;
    }

    public void setHighest_score(int highest_score) {
        this.highest_score = highest_score;
    }

    public int getDeadline_time_game_offset() {
        return deadline_time_game_offset;
    }

    public void setDeadline_time_game_offset(int deadline_time_game_offset) {
        this.deadline_time_game_offset = deadline_time_game_offset;
    }

    public int getDeadline_time_epoch() {
        return deadline_time_epoch;
    }

    public void setDeadline_time_epoch(int deadline_time_epoch) {
        this.deadline_time_epoch = deadline_time_epoch;
    }

    public int getHighest_scoring_entry() {
        return highest_scoring_entry;
    }

    public void setHighest_scoring_entry(int highest_scoring_entry) {
        this.highest_scoring_entry = highest_scoring_entry;
    }

    public boolean getData_checked() {
        return data_checked;
    }

    public void setData_checked(boolean data_checked) {
        this.data_checked = data_checked;
    }

    public boolean getFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public int getAverage_entry_score() {
        return average_entry_score;
    }

    public void setAverage_entry_score(int average_entry_score) {
        this.average_entry_score = average_entry_score;
    }

    public String getDeadline_time() {
        return deadline_time;
    }

    public void setDeadline_time(String deadline_time) {
        this.deadline_time = deadline_time;
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
}
