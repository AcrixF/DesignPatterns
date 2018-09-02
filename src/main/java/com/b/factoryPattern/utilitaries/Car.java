package com.b.factoryPattern.utilitaries;

public class Car extends Vehicle {

    @Override
    public Car newInstance() {
        return new Car();
    }

    @Override
    public String toString(){
        return "This is a Car.";
    }
}
