package practise;

/* Issues with Eager loading:
1. allocates memory to instance even when not invoked by client
2. do not provide any exception handling mechanism
*/
public class Singleton_01EagerInitialization {
    public static void main(String[] args) {
        Singleton instanceOne = Singleton.getInstance();
        Singleton instanceTwo = Singleton.getInstance();
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }
}

class Singleton {
    private static final Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }
}
