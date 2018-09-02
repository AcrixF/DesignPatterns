package com.c.factorymethodPattern;

import com.c.factorymethodPattern.factories.CarFactory;
import com.c.factorymethodPattern.factories.TruckFactory;
import com.c.factorymethodPattern.factories.VehicleFactory;
import com.c.factorymethodPattern.models.Vehicle;
import com.c.factorymethodPattern.models.MountainBike;
import com.c.factorymethodPattern.models.CityBike;

public class Main {

    public static void main( String [] args ) {
        VehicleFactory carFactory = new CarFactory();
        Vehicle vehicle = carFactory.orderVehicle("large","Blue");

        vehicle.testVehicle();

        TruckFactory truckFactory = new TruckFactory();
        Vehicle truckVehicle = truckFactory.orderVehicle("large","Red");
        truckVehicle.testVehicle() ;

        VehicleFactory bikeFactory = new VehicleFactory() {
            @Override
            protected Vehicle createVehicle(String size) {
                if( size.equals("small") ) {
                    return new MountainBike();
                } else if ( size.equals("large") ) {
                    return new CityBike();
                } else {
                    return null;
                }
            }
        };

        Vehicle bikeVehicle = bikeFactory.orderVehicle("large","Red");
        bikeVehicle.testVehicle();
    }
}
