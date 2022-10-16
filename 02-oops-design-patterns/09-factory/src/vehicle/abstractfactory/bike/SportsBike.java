package vehicle.abstractfactory.bike;

import vehicle.abstractfactory.VehicleType;

public class SportsBike extends Bike {

    public SportsBike() {
        vehicleType = VehicleType.SPORTS_BIKE;
    }

    @Override
    public void drive() {
        System.out.println("drive sports bike");
    }
}
