package designbird.vfinal;

public class Ostrich extends Bird {

    public Ostrich() {
        super("ostrich");
    }

    @Override
    public void eat() {
        System.out.println("ostrich eating");
    }

    @Override
    public void makeSound() {
        System.out.println("ostrich making sound");
    }
}
