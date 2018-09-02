package com.c.factorymethodPattern.factories;

import com.c.factorymethodPattern.models.Vehicle;
import com.c.factorymethodPattern.models.LargeTruck;
import com.c.factorymethodPattern.models.SmallTruck;

public class TruckFactory extends VehicleFactory {

    @Override
    protected Vehicle createVehicle( String size ) {
        if( size.equals("small") ) {
            return new SmallTruck();
        } else if( size.equals("large") ) {
            return new LargeTruck();
        } else {
            return null;
        }
    }

}
