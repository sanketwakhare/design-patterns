package vehicle.abstractfactory.car;

import vehicle.abstractfactory.VehicleType;

public class MicroCar extends Car {
    public MicroCar() {
        vehicleType = VehicleType.MICRO_CAR;
    }

    @Override
    public void drive() {
        System.out.println("drive micro car");
    }
}
