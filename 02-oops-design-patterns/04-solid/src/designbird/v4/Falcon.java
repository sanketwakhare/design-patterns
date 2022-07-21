package designbird.v4;

public class Falcon extends Bird implements Flyable {

    private final HighFlyingBehavior flyingBehavior = new HighFlyingBehavior();

    public Falcon() {
        super("falcon");
    }

    @Override
    public void fly() {
        flyingBehavior.makeFly();
    }
}
