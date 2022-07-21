package designbird.v1;

public class Parrot extends Bird {
    public Parrot() {
        super("parrot");
    }

    @Override
    public void fly() {
        System.out.println("flying at high altitude");
    }

    @Override
    public void makeSound() {
        System.out.println("whistles and squawk");
    }
}
