package singleton.v2;

/**
 * Implementation of Singleton pattern
 * Lazy loading with synchronized method
 * Cons: performance issues
 */
public class Singleton {

    private static Singleton instance = null;

    private Singleton() {
    }

    // performance issues
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
