package designbird.v4;

public class Sparrow extends Bird implements Flyable {

    private final LowFlyingBehavior flyingBehavior = new LowFlyingBehavior();

    public Sparrow() {
        super("sparrow");
    }

    @Override
    public void fly() {
        flyingBehavior.makeFly();
    }
}
