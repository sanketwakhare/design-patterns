package designbird.v4;

public class Eagle extends Bird implements Flyable {

    private final HighFlyingBehavior flyingBehavior = new HighFlyingBehavior();

    public Eagle() {
        super("eagle");
    }

    @Override
    public void fly() {
        flyingBehavior.makeFly();
    }
}
