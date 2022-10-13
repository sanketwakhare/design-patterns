package practise;

/* Issues with Eager loading:
1. allocates memory to instance even when not invoked by client
2. do not provide any exception handling mechanism
*/
public class Singleton_01_EagerInitialization {
    public static void main(String[] args) {
        Singleton_v1 instanceOne = Singleton_v1.getInstance();
        Singleton_v1 instanceTwo = Singleton_v1.getInstance();
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }
}

class Singleton_v1 {
    private static final Singleton_v1 instance = new Singleton_v1();

    private Singleton_v1() {
    }

    public static Singleton_v1 getInstance() {
        return instance;
    }
}
