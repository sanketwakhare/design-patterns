package vehicle.simplefactory;

public class VehicleFactory {
    public Vehicle getVehicle(VehicleType vehicleType) {
        if (vehicleType == VehicleType.BIKE) {
            return new Bike();
        } else if (vehicleType == VehicleType.CAR) {
            return new Car();
        }
        return null;
    }
}
