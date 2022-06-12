package designbird.vfinal;

public class Pigeon extends Bird implements Flyable {

    FlyingBehavior fb;

    public Pigeon(FlyingBehavior fb) {
        super("pigeon");
        this.fb = fb;
    }

    @Override
    public void eat() {
        System.out.println("pigeon eating");
    }

    @Override
    public void makeSound() {
        System.out.println("pigeon making sound");
    }

    @Override
    public void fly() {
        fb.makeFly();
    }
}
