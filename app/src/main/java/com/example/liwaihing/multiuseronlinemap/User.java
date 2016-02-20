package com.example.liwaihing.multiuseronlinemap;

import android.content.SharedPreferences;

/**
 * Created by WaiHing on 20/2/2016.
 */
public class User {
    private String username;
    private String userID;

    protected User(String username, String userID){
        this.username = username;
        this.userID = userID;
    }

    public String getUserID() {
        return userID;
    }

    public String getUsername() {
        return username;
    }
}
