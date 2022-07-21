package designbird.v5;

public class Parrot extends Bird implements Flyable, Eatable, SoundMaker {

    FlyingBehavior flyingBehavior;

    public Parrot(FlyingBehavior flyingBehavior) {
        super("parrot");
        this.flyingBehavior = flyingBehavior;
    }

    @Override
    public void fly() {
        System.out.print(getType() + " ");
        flyingBehavior.makeFly();
    }

    @Override
    public void makeSound() {
        System.out.println("whistles and squawk");
    }
}
