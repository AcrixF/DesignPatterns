package com.b.factoryPattern.utilitaries;

public class Bike extends Vehicle {

    @Override
    public Bike newInstance(){
        return new Bike();
    }

    @Override
    public String toString(){
        return "This is a Bike.";
    }
}
