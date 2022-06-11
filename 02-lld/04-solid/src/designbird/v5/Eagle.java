package designbird.v5;

public class Eagle extends Bird implements Flyable, Eatable, SoundMaker {

    FlyingBehavior flyingBehavior;

    public Eagle(FlyingBehavior flyingBehavior) {
        super("eagle");
        this.flyingBehavior = flyingBehavior;
    }

    @Override
    public void fly() {
        System.out.print(getType() + " ");
        flyingBehavior.makeFly();
    }

    @Override
    public void makeSound() {
        System.out.println("high-pitched whistling");
    }
}
