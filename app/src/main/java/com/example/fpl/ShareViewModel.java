package com.example.fpl;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.fpl.data.model.Entry.History;
import com.example.fpl.data.model.Entry.User;
import com.example.fpl.data.model.Bootstrap.Bootstrap;
import com.example.fpl.data.model.Picks.UserTeam;

public class ShareViewModel extends ViewModel {


    private MutableLiveData<Integer> userID = new MutableLiveData<>();
    private MutableLiveData<Integer> currentGW = new MutableLiveData<>();;
    private MutableLiveData<User> userData = new MutableLiveData<>();
    private MutableLiveData<Bootstrap> bootstrap = new MutableLiveData<>();
    private MutableLiveData<History> history = new MutableLiveData<>();
    private MutableLiveData<UserTeam> userTeamData = new MutableLiveData<>();

    public LiveData<Integer>  getCurrentGW() {
        return currentGW;
    }

    public void setCurrentGW(Integer currentGWs) {
        currentGW.setValue(currentGWs);
    }

    public LiveData<Integer> getUserID() {
        return userID;
    }
    public void setUserID(Integer id) {
        userID.setValue(id);
    }

    public LiveData<User> getUserData() {
        return userData;
    }
    public void setUserData(User data) {
        userData.setValue(data);
    }

    public LiveData<Bootstrap> getBootstrap() {
        return bootstrap;
    }
    public void setBootstrap(Bootstrap bootstrapData) { this.bootstrap.setValue(bootstrapData); }

    public LiveData<History> getHistory() {
        return history;
    }
    public void setHistory(History historyData) {
        this.history.setValue(historyData);
    }

    public LiveData<UserTeam> getUserTeam() {
        return userTeamData;
    }
    public void setUserTeamData(UserTeam data) {
        userTeamData.setValue(data);
    }
}