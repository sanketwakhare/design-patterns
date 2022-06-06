package interfaces;

public class Human extends Mammal implements Onmivore {
    @Override
    public void eatAnimal() {
        System.out.println("Human is eating animal");
    }

    @Override
    public void eatPlant() {
        System.out.println("Human is eating plant");
    }
}
