package singleton.v3;

/**
 * Eager Loading
 * Cons:
 * 1. no way to pass parameter to singleton constructor
 * 2. cannot throw exception
 */
public class Singleton {

    private static final Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }
}
