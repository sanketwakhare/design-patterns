package practise;

// lazy initialization
// instance is created only when getInstance is invoked

/* Issues with Lazy Initialization:
 * Multithreaded environment, we can end up creating multiple instances.
 * It might break the singleton property */

public class Singleton_03_LazyInitialization {
    public static void main(String[] args) {
        Singleton_v3 instanceOne = Singleton_v3.getInstance();
        Singleton_v3 instanceTwo = Singleton_v3.getInstance();
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }
}

class Singleton_v3 {

    private static Singleton_v3 instance = null;

    // private constructor
    private Singleton_v3() {
    }

    // lazy initialization
    public static Singleton_v3 getInstance() {
        if (instance == null) {
            instance = new Singleton_v3();
        }
        return instance;
    }
}
