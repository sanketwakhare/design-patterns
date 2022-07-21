package designbird.vfinal;

public class Sparrow extends Bird implements Flyable {

    FlyingBehavior fb;

    public Sparrow(FlyingBehavior fb) {
        super("sparrow");
        this.fb = fb;
    }

    @Override
    public void eat() {
        System.out.println("sparrow eating");
    }

    @Override
    public void makeSound() {
        System.out.println("chirping");
    }

    @Override
    public void fly() {
        fb.makeFly();
    }
}
