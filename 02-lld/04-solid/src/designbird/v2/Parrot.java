package designbird.v2;

public class Parrot extends Bird implements Eatable, Flyable {

    public Parrot() {
        super("parrot");
    }

    @Override
    public void eat() {
        System.out.println(getType() + " eating");
    }

    @Override
    public void fly() {
        System.out.println(getType() + " flying");
    }
}
