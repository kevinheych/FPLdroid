package com.example.fpl.ui.login;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import android.util.Patterns;

import com.example.fpl.MyApplication;
import com.example.fpl.RequestManager;
import com.example.fpl.data.Login.LoginRepository;
import com.example.fpl.R;
import com.example.fpl.ServiceApiFPL;

import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginViewModel extends ViewModel {

    private MutableLiveData<LoginFormState> loginFormState = new MutableLiveData<>();
    private MutableLiveData<LoginResult> loginResult = new MutableLiveData<>();
    private LoginRepository loginRepository;

    LoginViewModel(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    LiveData<LoginFormState> getLoginFormState() {
        return loginFormState;
    }

    LiveData<LoginResult> getLoginResult() {
        return loginResult;
    }

    public void login(String username, String password) {
        ServiceApiFPL service = RequestManager.getRetrofitInstance(MyApplication.getAppContext()).create(ServiceApiFPL.class);
        RequestBody requestBody = new MultipartBody.Builder()
                .setType(MultipartBody.FORM)
                .addFormDataPart("login", username)
                .addFormDataPart("password", password)
                .addFormDataPart("app", "plfpl-web")
                .addFormDataPart("redirect_uri", "https://fantasy.premierleague.com/a/login")
                .build();

        service.login(requestBody).enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                if (response.isSuccessful()) {
                    System.out.println(response.toString());

                    String state = null;
                    HttpUrl url = response.raw().request().url();
                    state = url.queryParameter("state");

                    Headers headers = response.headers();
                    System.out.println("State " + state);


                    if (state.equals("fail")) {
                        String reason = "Login fail due to ";
                        reason = reason + url.queryParameter("reason");
                        System.out.println("Fail reason:  " + reason);
                        loginResult.setValue(new LoginResult(reason));
                    } else if (state.equals("success")) {
                        loginResult.setValue(new LoginResult(new LoggedInUserView(username)));
                    }
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                System.out.println("FAIL Login " + t.getLocalizedMessage());
            }
        });
    }

    public void loginDataChanged(String username, String password) {
        if (!isUserNameValid(username)) {
            loginFormState.setValue(new LoginFormState(R.string.invalid_username, null));
        } else if (!isPasswordValid(password)) {
            loginFormState.setValue(new LoginFormState(null, R.string.invalid_password));
        } else {
            loginFormState.setValue(new LoginFormState(true));
        }
    }

    // A placeholder username validation check
    private boolean isUserNameValid(String username) {
        if (username == null) {
            return false;
        }
        if (username.contains("@")) {
            return Patterns.EMAIL_ADDRESS.matcher(username).matches();
        } else {
            return !username.trim().isEmpty();
        }
    }

    // A placeholder password validation check
    private boolean isPasswordValid(String password) {
        return password != null && password.trim().length() > 5;
    }
}