package com.example.dagger.dagger;

import com.example.dagger.car.Car;
import com.example.dagger.MainActivity;

import dagger.Component;

@Component (modules = {WheelsModule.class,PetrolEngineModule.class})
public interface CarComponent {

    Car getCar();

    void inject(MainActivity mainActivity);
}
