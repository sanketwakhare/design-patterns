package vehicle.abstractfactory.bike;

import vehicle.abstractfactory.AbstractVehicleFactory;
import vehicle.abstractfactory.Vehicle;
import vehicle.abstractfactory.VehicleType;

public class BikeFactory extends AbstractVehicleFactory {
    @Override
    public Vehicle getVehicle(VehicleType vehicleType) {
        if (vehicleType == VehicleType.NORMAL_BIKE) {
            return new NormalBike();
        } else if (vehicleType == VehicleType.SPORTS_BIKE) {
            return new SportsBike();
        }
        return null;
    }
}
