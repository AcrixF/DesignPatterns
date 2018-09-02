package com.b.factoryPattern.factoryReflection;

import com.b.factoryPattern.utilitaries.Bike;
import com.b.factoryPattern.utilitaries.Car;
import com.b.factoryPattern.utilitaries.Truck;
import com.b.factoryPattern.utilitaries.Vehicle;

public class Main {

    public static void main( String [] args )  throws Exception {

        VehicleFactory factory = new VehicleFactory();
        factory.registerVehicle("Bike", Bike.class.getConstructor());
        factory.registerVehicle("Car", Car.class.getConstructor());
        factory.registerVehicle("Truck", Truck.class.getConstructor());

        Vehicle vehicle_one = factory.createVehicle("Bike");
        System.out.println( vehicle_one.toString() );

        Vehicle vehicle_two = factory.createVehicle("Car");
        System.out.println( vehicle_two.toString() );

        Vehicle vehicle_three = factory.createVehicle("Truck");
        System.out.println( vehicle_three.toString() );



    }
}
