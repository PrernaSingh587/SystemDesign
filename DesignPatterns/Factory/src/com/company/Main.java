package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Factory Design Pattern");
        Vehicle vehicle = VehicleFactory.getVehicle("Car");
        vehicle.drive();
        Vehicle vehicle1 = VehicleFactory.getVehicle("Bus");
        vehicle1.drive();
    }
}
