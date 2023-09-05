package com.company;

public class VehicleFactory {
    static Vehicle getVehicle(String vt) {

        if(vt == "Car") {
            return new Car();
        } else {
            return new Bus();
        }
    }
}
