package com.example.dagger.dagger;

import com.example.dagger.car.DieselEngine;
import com.example.dagger.car.Engine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {

    private int horsepower;

    public DieselEngineModule(int horsepower) {
        this.horsepower = horsepower;
    }

    @Provides
    int provideHorsePower() {
        return horsepower;
    }
    @Provides
    Engine provideEngine(DieselEngine engine){
        return engine;
    };
}
