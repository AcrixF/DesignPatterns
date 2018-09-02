package com.b.factoryPattern.staticfactory;

import com.b.factoryPattern.utilitaries.Bike;
import com.b.factoryPattern.utilitaries.Car;
import com.b.factoryPattern.utilitaries.Truck;
import com.b.factoryPattern.utilitaries.Vehicle;

public class VehicleFactory {

    public enum VehicleType {
        Bike,Car,Truck
    }

    public static Vehicle create(VehicleType type ) {
        if ( type.equals( VehicleType.Bike) ) {
            return new Bike();
        } else if ( type.equals( VehicleType.Car ) ) {
            return new Car();
        } else if ( type.equals( VehicleType.Truck) ) {
            return new Truck();
        } else {
            return null;
        }

    }

}
