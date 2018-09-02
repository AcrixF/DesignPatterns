package com.b.factoryPattern.factoryRegistration;

import com.b.factoryPattern.utilitaries.Vehicle;

import java.util.HashMap;
import java.util.Map;

public class VehicleFactory {

    private Map<String, Vehicle> registeredProducts = new HashMap<>();

    public void registerVehicle( String vehicleId, Vehicle vehicle ) {
        registeredProducts.put( vehicleId, vehicle );
    }

    public Vehicle createVehicle( String vehicleId ) {
        return registeredProducts.get( vehicleId ).newInstance();
    }


}
