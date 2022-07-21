package bullet;

/*Extrinsic / mutable / state can change */
public class MovingBullet {

    private double direction;
    private double coordinates;
    private double speed;

    // composition
    private Bullet bullet;

    public MovingBullet(double direction, double coordinates, double speed, Bullet bullet) {
        this.direction = direction;
        this.coordinates = coordinates;
        this.speed = speed;
        this.bullet = bullet;
    }

    public double getDirection() {
        return direction;
    }

    public void setDirection(double direction) {
        this.direction = direction;
    }

    public double getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(double coordinates) {
        this.coordinates = coordinates;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public Bullet getBullet() {
        return bullet;
    }

    public void setBullet(Bullet bullet) {
        this.bullet = bullet;
    }
}
