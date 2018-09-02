package com.b.factoryPattern.utilitaries;

public abstract class Vehicle {

    public abstract Vehicle newInstance();

    @Override
    public String toString(){
        return "This is a Vehicle";
    }

}
