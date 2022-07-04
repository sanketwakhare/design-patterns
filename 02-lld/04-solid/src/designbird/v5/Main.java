package designbird.v5;

public class Main {

    public static void main(String[] args) {

        FlyingBehavior lowAltitudeFlyingBehavior = new LowAltitudeFlyingBehavior();
        FlyingBehavior highAltitudeFlyingBehavior = new HighAltitudeFlyingBehavior();

        Parrot parrot = new Parrot(lowAltitudeFlyingBehavior);
        parrot.fly();
        parrot.makeSound();

        Crow crow = new Crow(lowAltitudeFlyingBehavior);
        crow.fly();
        crow.makeSound();

        Eagle eagle = new Eagle(highAltitudeFlyingBehavior);
        eagle.fly();
        eagle.makeSound();

        Falcon falcon = new Falcon(highAltitudeFlyingBehavior);
        falcon.fly();
        falcon.makeSound();

        Parrot highAltitudeFlyerParrot = new Parrot(highAltitudeFlyingBehavior);
        highAltitudeFlyerParrot.fly();
        highAltitudeFlyerParrot.makeSound();

        Penguin penguin = new Penguin();
        penguin.makeSound();
    }


}
