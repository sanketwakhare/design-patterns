package designbird.v4;

import lombok.Data;

/**
 * v4 design of class Bird
 * <p>
 * To handle code duplication, create separate class which can have specific behavior
 * <p>
 * create HighFlyingBirds and LowFlyingBirds as two separate behaviors
 * <p>
 * now birds which fly higher, can implement teh HighFlyingBehavior and
 * birds which fly at lower altitude, can use the LowFlyingBehavior
 * <p>
 * Problems:
 * 1. Dependency between two concrete classes
 * e.g. Eagle and HighFlyingBehavior are dependent
 * Falcon and HighFlyingBehavior are dependent
 * Sparrow and LowFlyingBehavior are dependent
 * <p>
 * 2. The new behavior types are always created for each bird.
 *
 * <p>
 * <p>
 * To resolve this :
 * 1. Dependency Inversion Principle can be used
 * 2. can we inject the behavior type from constructor injection? -> Yes
 */

@Data
abstract public class Bird {
    private final String type;
    private int weight;
    private String color;
    private int size;
    private String beakType;

    public Bird(String type) {
        this.type = type;
    }
}
