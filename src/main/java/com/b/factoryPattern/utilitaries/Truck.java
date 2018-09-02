package com.b.factoryPattern.utilitaries;

public class Truck extends Vehicle {

    @Override
    public Truck newInstance(){
        return new Truck();
    }

    @Override
    public String toString(){
        return "This is a Truck.";
    }

}
