package designbird.vfinal;

// Requirements:
// 5 birds
//        Pigeon
//        Crow
//        Sparrow
//        Ostrich
//        Penguin
//
// Penguin and Ostrich don't fly, everyone else flies
// Crows and sparrows fly in the same way
// Every bird can eat and make sound


import java.util.List;

public class Main {

    public static void main(String[] args) {

        FlyingBehavior crowSparrowFlyingBehavior = new CrowSparrowFlyingBehavior();
        FlyingBehavior defaultFlyingBehavior = new DefaultFlyingBehavior();

        // pigeon
        Pigeon pigeon = new Pigeon(defaultFlyingBehavior);
        pigeon.fly();
        pigeon.eat();
        pigeon.makeSound();

        // crow
        Crow crow = new Crow(crowSparrowFlyingBehavior);
        crow.fly();
        crow.eat();
        crow.makeSound();

        // sparrow
        Sparrow sparrow = new Sparrow(crowSparrowFlyingBehavior);
        sparrow.fly();
        sparrow.eat();
        sparrow.makeSound();

        // ostrich
        Ostrich ostrich = new Ostrich();
        ostrich.eat();
        ostrich.makeSound();

        // ostrich
        Penguin penguin = new Penguin();
        penguin.eat();
        penguin.makeSound();

        // flyable birds
        List<Flyable> flyableBirds = List.of(new Pigeon(defaultFlyingBehavior),
                new Crow(crowSparrowFlyingBehavior));

        System.out.println(flyableBirds);

    }
}
