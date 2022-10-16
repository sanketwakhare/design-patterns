package vehicle.abstractfactory.bike;

import vehicle.abstractfactory.VehicleType;

public class NormalBike extends Bike {

    public NormalBike() {
        vehicleType = VehicleType.NORMAL_BIKE;
    }

    @Override
    public void drive() {
        System.out.println("drive normal bike");
    }
}
