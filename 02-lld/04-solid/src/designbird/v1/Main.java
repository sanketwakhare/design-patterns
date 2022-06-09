package designbird.v1;

public class Main {

    public static void main(String[] args) {
        Bird parrot = new Parrot();
        System.out.println(parrot.getType());
        parrot.fly();
        parrot.makeSound();

        Bird crow = new Crow();
        System.out.println(crow.getType());
        crow.fly();
        crow.makeSound();
    }
}
