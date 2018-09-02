package com.c.factorymethodPattern.factories;

import com.c.factorymethodPattern.models.Vehicle;
import com.c.factorymethodPattern.models.SedanCar;
import com.c.factorymethodPattern.models.SportCar;

public class CarFactory extends VehicleFactory {
    @Override
    protected Vehicle createVehicle(String size ) {
        if( size.equals("small") ) {
            return new SportCar();
        } else if( size.equals("large") ) {
            return new SedanCar();
        } else {
            return null;
        }
    }
}
