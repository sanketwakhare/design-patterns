package vehicle.abstractfactory;

import vehicle.abstractfactory.bike.BikeFactory;
import vehicle.abstractfactory.car.CarFactory;

public class Client {
    public static void main(String[] args) {
        AbstractVehicleFactory bikeFactory = new BikeFactory();
        AbstractVehicleFactory carFactory = new CarFactory();

        Vehicle normalBike = bikeFactory.getVehicle(VehicleType.NORMAL_BIKE);
        normalBike.drive();
        Vehicle sportsBike = bikeFactory.getVehicle(VehicleType.SPORTS_BIKE);
        sportsBike.drive();

        Vehicle megaCar = carFactory.getVehicle(VehicleType.MEGA_CAR);
        megaCar.drive();
        Vehicle microCar = carFactory.getVehicle(VehicleType.MICRO_CAR);
        microCar.drive();

    }
}
