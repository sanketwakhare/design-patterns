package designbird.v3;

/**
 * v3 design of class Bird
 *
 * Provide only attributes for Bird class. Do no provide behaviors.
 * The behaviors can be provided by interfaces so that different kind of birds can perform different behaviors
 * follows SRP -> yes
 * follows OCP -> yes as new type of Bird can have its own class, and it can implement the required behavior
 * follows LSP (Liskov's Substitution Principle) -> yes as object of child is stored in variable of parent Bird. here type variable?
 * follows ISP -> Interface Segregation Principle tells use to have minimum behaviors in single interfaces, ideally single method per interface. Functional interfaces follows this structure
 *
 * <p>
 * Problems: 2 birds can fly the similar way and can eat similar way, in that case there would be code duplication
 */
public abstract class Bird {

    private final String type;
    private int weight;
    private String color;
    private int size;
    private String beakType;

    public Bird(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBeakType() {
        return beakType;
    }

    public void setBeakType(String beakType) {
        this.beakType = beakType;
    }
}
