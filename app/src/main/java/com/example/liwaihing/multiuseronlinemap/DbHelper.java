package com.example.liwaihing.multiuseronlinemap;

import android.content.Context;
import com.firebase.client.Firebase;

/**
 * Created by WaiHing on 20/2/2016.
 */
public class DbHelper {
    private static final String FIREBASE_URL = "https://multiuseronlinemap.firebaseio.com/";
    private Firebase firebaseRef;

    public DbHelper(){

    }

    public DbHelper(Context context){
        Firebase.setAndroidContext(context);
        firebaseRef = new Firebase(FIREBASE_URL);
    }

    public Firebase getFirebaseRef() {
        return firebaseRef;
    }

    public void registerUser(User user){
        firebaseRef.push().setValue(user);
    }
}
