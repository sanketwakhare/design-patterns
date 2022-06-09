package designbird.v0;

public class Main {

    public static void main(String[] args) {
        Bird parrot = new Bird("parrot");
        parrot.fly();
        parrot.makeSound();

        Bird crow = new Bird("crow");
        crow.fly();
        crow.makeSound();
    }
}
