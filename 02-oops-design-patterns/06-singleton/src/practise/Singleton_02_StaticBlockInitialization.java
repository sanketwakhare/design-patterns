package practise;

public class Singleton_02_StaticBlockInitialization {
    public static void main(String[] args) {
        Singleton_v2 instanceOne = Singleton_v2.getInstance();
        Singleton_v2 instanceTwo = Singleton_v2.getInstance();
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }
}

class Singleton_v2 {

    private static final Singleton_v2 instance;

    // static block initialization
    static {
        try {
            instance = new Singleton_v2();
        } catch (Exception e) {
            throw new RuntimeException("exception while creating singleton");
        }
    }

    // private constructor
    private Singleton_v2() {
    }

    public static Singleton_v2 getInstance() {
        return instance;
    }
}
