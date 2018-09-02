package com.c.factorymethodPattern.models;

public abstract class Vehicle {
    private String color;

    public void setColor( String color ){
        this.color = color;
    }

    public abstract void testVehicle();


}
