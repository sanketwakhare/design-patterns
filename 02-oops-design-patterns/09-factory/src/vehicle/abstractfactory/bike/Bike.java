package vehicle.abstractfactory.bike;

import vehicle.abstractfactory.Vehicle;
import vehicle.abstractfactory.VehicleType;

public abstract class Bike implements Vehicle {
    VehicleType vehicleType;
    public abstract void drive();
}
