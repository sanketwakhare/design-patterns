package designbird.v3;

public class Main {

    public static void main(String[] args) {
        Parrot parrot = new Parrot();
        parrot.eat();
        parrot.fly();

        Penguin penguin = new Penguin();
        penguin.eat();
        penguin.swim();

        Duck duck = new Duck();
        duck.eat();
        duck.fly();
        duck.swim();

    }
}
