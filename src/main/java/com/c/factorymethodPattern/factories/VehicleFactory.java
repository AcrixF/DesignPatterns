package com.c.factorymethodPattern.factories;

import com.c.factorymethodPattern.models.Vehicle;

public abstract class VehicleFactory {

    protected abstract Vehicle createVehicle(String item );

    public Vehicle orderVehicle( String size, String color ) {
        Vehicle vehicle = createVehicle( size );
        vehicle.setColor( color );
        return vehicle;
    }


}
