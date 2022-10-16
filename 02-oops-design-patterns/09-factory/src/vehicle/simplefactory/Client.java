package vehicle.simplefactory;

public class Client {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();

        Vehicle bike = vehicleFactory.getVehicle(VehicleType.BIKE);
        bike.drive();

        Vehicle car = vehicleFactory.getVehicle(VehicleType.CAR);
        car.drive();
    }
}
