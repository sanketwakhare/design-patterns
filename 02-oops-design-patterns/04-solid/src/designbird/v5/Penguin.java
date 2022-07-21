package designbird.v5;

public class Penguin extends Bird implements Eatable, SoundMaker {

    public Penguin() {
        super("penguin");
    }

    @Override
    public void makeSound() {
        System.out.println("squawking");
    }
}
