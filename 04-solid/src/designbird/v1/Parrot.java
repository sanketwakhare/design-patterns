package designbird.v1;

public class Parrot extends Bird {
    Parrot() {
        super("parrot");
    }

    @Override
    public void fly() {
        System.out.println("flying at high altitude");
    }

    @Override
    public void makeSound() {
        System.out.println("mithuu..");
    }
}
