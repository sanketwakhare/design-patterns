package designbird.v2;

public class Duck extends Bird implements Eatable, Flyable, Swimmable {

    public Duck() {
        super("duck");
    }

    @Override
    public void eat() {
        System.out.println(getType() + " eating");
    }

    @Override
    public void fly() {
        System.out.println(getType() + " flying");
    }

    @Override
    public void swim() {
        System.out.println(getType() + " swimming");
    }

}
