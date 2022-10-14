package practise;

/* Thread Safe Singleton */
// performance issues when more thread ae present
public class Singleton_04_ThreadSafe {
    public static void main(String[] args) {
        Singleton_v4 instanceOne = Singleton_v4.getInstance();
        Singleton_v4 instanceTwo = Singleton_v4.getInstance();
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }
}

class Singleton_v4 {
    private static Singleton_v4 instance = null;

    // private constructor
    private Singleton_v4() {
    }

    public static synchronized Singleton_v4 getInstance() {
        if (instance == null) {
            instance = new Singleton_v4();
        }
        return instance;
    }
}
