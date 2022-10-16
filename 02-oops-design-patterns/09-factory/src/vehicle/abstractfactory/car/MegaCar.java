package vehicle.abstractfactory.car;

import vehicle.abstractfactory.VehicleType;

public class MegaCar extends Car {
    public MegaCar() {
        vehicleType = VehicleType.MEGA_CAR;
    }

    public void drive() {
        System.out.println("drive mega car");
    }
}
