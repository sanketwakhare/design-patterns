package singleton.v6;

/**
 * singleton using static inner class.
 * this does not use synchronization hence it is faster than double-lock checking singleton
 */
public class Singleton {

    private Singleton() {
    }

    public static Singleton getInstance() {
        return InnerStaticClass.instance;
    }

    private static class InnerStaticClass {
        // this private class get loaded when getInstance() is invoked for first time
        private static final Singleton instance = new Singleton();
    }
}
