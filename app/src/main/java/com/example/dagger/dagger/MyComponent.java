package com.example.dagger.dagger;

import com.example.dagger.NewActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {SharedPrefModule.class})
public interface MyComponent {

    void inject(NewActivity newActivity);
}
