package designbird.v5;

public class Crow extends Bird implements Flyable ,Eatable, SoundMaker {

    FlyingBehavior flyingBehavior;

    public Crow(FlyingBehavior flyingBehavior) {
        super("crow");
        this.flyingBehavior = flyingBehavior;
    }

    @Override
    public void fly() {
        System.out.print(getType() + " ");
        flyingBehavior.makeFly();
    }

    @Override
    public void makeSound() {
        System.out.println("kra-kra-kra");
    }
}
