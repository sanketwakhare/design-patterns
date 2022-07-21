package designbird.v0;

public class Main {

    public static void main(String[] args) {
        Bird parrot = new Bird("parrot");
        System.out.println(parrot.getType());
        parrot.fly();
        parrot.makeSound();

        Bird crow = new Bird("crow");
        System.out.println(crow.getType());
        crow.fly();
        crow.makeSound();
    }
}
