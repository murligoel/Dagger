package com.example.dagger.car;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class PetrolEngine implements Engine {
    private static final String TAG = "Car";

    private int horsepower;
    private int engineCapacity;

    public PetrolEngine(@Named("horse power") int horsepower,
                        @Named("engine capacity") int engineCapacity) {
        this.horsepower = horsepower;
        this.engineCapacity = engineCapacity;
    }

    @Inject
    public PetrolEngine(){}

    @Override
    public void start() {
        Log.d(TAG,"Petrol engine started. "+
                "\nHorsePower : "+horsepower
        +"\nEngine Capacity: "+engineCapacity);
    }
}
