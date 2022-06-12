package designbird.v1;

public class Crow extends Bird {
    public Crow() {
        super("crow");
    }

    @Override
    public void fly() {
        System.out.println("flying at low altitude");
    }

    @Override
    public void makeSound() {
        System.out.println("kra-kra-kra");
    }
}
