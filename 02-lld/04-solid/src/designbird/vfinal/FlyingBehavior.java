package designbird.vfinal;

public interface FlyingBehavior {
    default void makeFly() {
        System.out.println("default flying behavior");
    }
}
