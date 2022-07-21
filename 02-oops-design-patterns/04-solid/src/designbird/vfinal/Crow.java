package designbird.vfinal;

public class Crow extends Bird implements Flyable {

    FlyingBehavior fb;

    public Crow(FlyingBehavior fb) {
        super("crow");
        this.fb = fb;
    }

    @Override
    public void eat() {
        System.out.println("crow eating");
    }

    @Override
    public void makeSound() {
        System.out.println("kra-kra-kra");
    }

    @Override
    public void fly() {
        fb.makeFly();
    }
}
