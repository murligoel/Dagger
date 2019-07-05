package com.example.dagger.dagger;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class SharedPrefModule {

    private Context context;

    public SharedPrefModule(Context context) {
        this.context = context;
    }

    @Provides
    @Singleton
    public Context provideContext(Context context){
        return context;
    }

    @Provides
    @Singleton
    private SharedPreferences provideSharedPrefernces(Context context){
        return PreferenceManager.getDefaultSharedPreferences(context);
    }
}
