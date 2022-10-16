package vehicle.abstractfactory.car;

import vehicle.abstractfactory.AbstractVehicleFactory;
import vehicle.abstractfactory.Vehicle;
import vehicle.abstractfactory.VehicleType;

public class CarFactory extends AbstractVehicleFactory {

    @Override
    public Vehicle getVehicle(VehicleType vehicleType) {
        if (vehicleType == VehicleType.MEGA_CAR) {
            return new MegaCar();
        } else if (vehicleType == VehicleType.MICRO_CAR) {
            return new MicroCar();
        }
        return null;
    }
}
