package com.example.myapplication;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("dwBG5XdFDPp5e1DzOaN49v78TzIYdID8lnPtKFLD")
                .clientKey("g5FGjUaOUTaPnZ9Abn18zPcxsclhKfz3m3443Kyb")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
