package com.b.factoryPattern.factoryReflection;

import com.b.factoryPattern.utilitaries.Vehicle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class VehicleFactory {

    private Map<String, Constructor> registeredProducts = new HashMap<String, Constructor>();

    public void registerVehicle( String vehicleId, Constructor vehicleClass ) {
        registeredProducts.put( vehicleId, vehicleClass );
    }
    
    public Vehicle createVehicle( String type ) throws  InstantiationException, IllegalAccessException, InvocationTargetException {
        Constructor productClass = registeredProducts.get( type );
        Vehicle vehicle = (Vehicle) productClass.newInstance();
        return vehicle;
    }

}
