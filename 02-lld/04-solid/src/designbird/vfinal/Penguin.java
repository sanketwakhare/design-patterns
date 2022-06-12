package designbird.vfinal;

public class Penguin extends Bird {

    public Penguin() {
        super("penguin");
    }

    @Override
    public void eat() {
        System.out.println("penguin eating");
    }

    @Override
    public void makeSound() {
        System.out.println("squawking");
    }
}
