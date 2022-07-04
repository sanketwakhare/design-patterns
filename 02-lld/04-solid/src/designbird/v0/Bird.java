package designbird.v0;

import lombok.Data;

/**
 * vo design of class Bird
 * <p>
 * Problems:
 * violates SRP -> Bird class is responsible for every type of bird
 * violates OCP -> if new type of bird is required to be added in the system,
 * we have to change the Bird class to accommodate the change
 * this design is neither extensible nor maintainable as this needs the code change in same class
 */
@Data
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
        if ("crow".equalsIgnoreCase(type)) {
            System.out.println("crow is flying");
        } else if ("parrot".equalsIgnoreCase(type)) {
            System.out.println("parrot is flying");
        }
    }

    public void eat() {
        System.out.println(type + " is eating");
    }

    public void makeSound() {
        if ("crow".equalsIgnoreCase(type)) {
            System.out.println("kra-kra-kra");
        } else if ("parrot".equalsIgnoreCase(type)) {
            System.out.println("whistles and squawk");
        }
    }
}
