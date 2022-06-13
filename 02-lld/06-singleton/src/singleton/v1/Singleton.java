package singleton.v1;

/**
 * Naive implementation of Singleton pattern
 * cons: will not remain singleton in multithreaded environment
 */
public class Singleton {

    private static Singleton instance = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
