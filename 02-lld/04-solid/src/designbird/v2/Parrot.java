package designbird.v2;

public class Parrot extends FlyableBird {

    public Parrot() {
        super("parrot");
    }

    @Override
    public void fly() {
        System.out.println("parrot is flying");
    }
}
