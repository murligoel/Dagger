package com.example.dagger;

import android.util.Log;

import javax.inject.Inject;

import static android.content.ContentValues.TAG;

public class Remote {

    @Inject
    public Remote(){

    }

    public void setListener(Car car) {
        Log.d(TAG,"Remote Connected");
    }
}
