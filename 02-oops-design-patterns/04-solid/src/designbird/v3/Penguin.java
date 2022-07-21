package designbird.v3;

public class Penguin extends Bird implements Eatable, Swimmable {

    public Penguin() {
        super("penguin");
    }

    @Override
    public void eat() {
        System.out.println(getType() + " eating");
    }

    @Override
    public void swim() {
        System.out.println(getType() + " swimming");
    }
}
