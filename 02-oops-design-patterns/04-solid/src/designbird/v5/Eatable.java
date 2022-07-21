package designbird.v5;

public interface Eatable {
    default void eat() {
        System.out.println("eating");
    }
}
