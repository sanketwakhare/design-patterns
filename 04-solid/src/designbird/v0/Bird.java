package designbird.v0;

/**
 * vo design of class Bird
 * <p>
 * Problems:
 * violates SRP -> Bird class is responsible for every type of Bird
 * violates OCP -> if new type of Bird need to be added in system, Bird class it required to change.
 * this design does not provide extensibility and not maintainable as require more code changes in same class
 */
public class Bird {

    private final String type;
    private int weight;
    private String color;
    private int size;
    private String beakType;

    public Bird(String type) {
        this.type = type;
    }

    public void fly() {
        if (type == "crow") {
            System.out.println("crow is flying");
        } else if (type == "parrot") {
            System.out.println("parrot is flying high");
        }
    }

    public void eat() {
        System.out.println(type + " is eating");
    }

    public void makeSound() {
        if (type == "crow") {
            System.out.println("croww...");
        } else if (type == "parrot") {
            System.out.println("mithuuu...");
        }
    }

}
