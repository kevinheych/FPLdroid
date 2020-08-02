package com.example.fpl.data;

import com.example.fpl.MyApplication;
import com.example.fpl.RequestManager;
import com.example.fpl.data.model.LoggedInUser;
import com.example.fpl.ServiceApiFPL;

import java.io.IOException;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
public class LoginDataSource {

    public Result<LoggedInUser> login(String username, String password) {

        try {

            ServiceApiFPL service = RequestManager.getRetrofitInstance(MyApplication.getAppContext()).create(ServiceApiFPL.class);
            RequestBody requestBody = new MultipartBody.Builder()
                    .setType(MultipartBody.FORM)
                    .addFormDataPart("login", username)
                    .addFormDataPart("password", password)
                    .addFormDataPart("app", "plfpl-web")
                    .addFormDataPart("redirect_uri", "https://fantasy.premierleague.com/a/login")
                    .build();

            service.login(requestBody);




            // TODO: handle loggedInUser authentication
            LoggedInUser fakeUser =
                    new LoggedInUser(
                            java.util.UUID.randomUUID().toString(),
                            "Jane Doe");
            return new Result.Success<>(fakeUser);
        } catch (Exception e) {
            return new Result.Error(new IOException("Error logging in", e));
        }
    }

    public void logout() {
        // TODO: revoke authentication
    }
}