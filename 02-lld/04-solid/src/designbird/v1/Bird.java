package designbird.v1;

/**
 * v1 design of class Bird
 * follows SRP -> in this design, Bird is responsible for only shared attributes and shared behaviors
 * follows OCP -> no need to change Bird class if new type of Bird is to be added in system
 * <p>
 * Problems:
 * what happens when there is some type of Bird which cannot fly and can swim instead
 */
abstract public class Bird {

    private final String type;
    private int weight;
    private String color;
    private int size;
    private String beakType;

    public Bird(String type) {
        this.type = type;
    }

    abstract public void fly();

    public void eat() {
        System.out.println(type + " is eating");
    }

    abstract public void makeSound();

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