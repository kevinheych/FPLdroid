package com.example.fpl.ui.SwipeNavigation;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.fpl.Models.Entry.History;
import com.example.fpl.Models.Entry.User;
import com.example.fpl.Models.Bootstrap.Bootstrap;
import com.example.fpl.Models.Picks.UserTeam;

public class ShareViewModel extends ViewModel {

    private MutableLiveData<User> userData = new MutableLiveData<>();
    private MutableLiveData<Bootstrap> bootstrap = new MutableLiveData<>();
    private MutableLiveData<History> history = new MutableLiveData<>();
    private MutableLiveData<UserTeam> userTeamData = new MutableLiveData<>();

    public LiveData<User> getUser() {
        return userData;
    }

    public void setUser(User data) {
        userData.setValue(data);
    }

    public LiveData<Bootstrap> getBootstrap() {
        return bootstrap;
    }

    public void setBootstrap(Bootstrap bootstrapData) {
        this.bootstrap.setValue(bootstrapData);
    }

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