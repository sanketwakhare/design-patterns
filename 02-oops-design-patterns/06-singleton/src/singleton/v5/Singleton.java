package singleton.v5;

/**
 * Lazy Loading - synchronized block - double check locking
 */
public class Singleton {
    private static Singleton instance = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            // only when instance is null, use synchronized block
            synchronized (Singleton.class) {
                // double check locking - handle concurrency for high performance
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
