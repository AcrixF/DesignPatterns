package com.b.factoryPattern.factoryRegistration;

import com.b.factoryPattern.utilitaries.Bike;
import com.b.factoryPattern.utilitaries.Car;
import com.b.factoryPattern.utilitaries.Truck;
import com.b.factoryPattern.utilitaries.Vehicle;

public class Main {

    public static void main( String [] args ) {

        VehicleFactory factory = new VehicleFactory();
        factory.registerVehicle("Bike", new Bike());
        factory.registerVehicle("Car", new Car());
        factory.registerVehicle("Truck", new Truck());

        Vehicle v1 = factory.createVehicle("Bike").newInstance();
        Vehicle v2 = factory.createVehicle("Car").newInstance();
        Vehicle v3 =factory.createVehicle("Truck").newInstance();

        System.out.println( v1 );
        System.out.println( v2 );
        System.out.println( v3 );

    }

}
