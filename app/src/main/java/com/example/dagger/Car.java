package com.example.dagger;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";

    // Field Injection
    @Inject Engine engine;
    private Wheel wheel;

    // Constructor Injection
    @Inject
    public Car( Wheel wheel) {
        this.wheel = wheel;
    }

    // Method Injection
    @Inject
    public void enableRemote(Remote remote){
        remote.setListener(this);
    }

    public void drive(){
        Log.d(TAG,"driving...");
    }
}
