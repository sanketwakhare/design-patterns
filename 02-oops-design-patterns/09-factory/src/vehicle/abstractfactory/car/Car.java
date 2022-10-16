package vehicle.abstractfactory.car;

import vehicle.abstractfactory.Vehicle;
import vehicle.abstractfactory.VehicleType;

public abstract class Car implements Vehicle {
    VehicleType vehicleType;

    public abstract void drive();
}
