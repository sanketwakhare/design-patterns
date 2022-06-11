package designbird.v2;


public class Crow extends FlyableBird {

    public Crow() {
        super("crow");
    }

    @Override
    public void fly() {
        System.out.println("crow is flying");
    }
}
