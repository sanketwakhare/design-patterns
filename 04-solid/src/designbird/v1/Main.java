package designbird.v1;

public class Main {

    public static void main(String[] args) {
        Bird parrot = new Parrot();
        parrot.fly();
        parrot.makeSound();

        Bird crow = new Crow();
        crow.fly();
        crow.makeSound();
    }
}
