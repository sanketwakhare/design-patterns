package singleton.v4;

/**
 * Lazy Loading - synchronized block
 * cons: performance issues, similar to synchronized method
 */
public class Singleton {
    private static Singleton instance = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            // only when instance is null, use synchronized block
            synchronized (Singleton.class) {
                // again performance issues. same as lazy loading with synchronized method
                instance = new Singleton();
            }
        }
        return instance;
    }
}
