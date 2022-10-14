package practise;

public class Singleton_06_StaticInnerClass {
    public static void main(String[] args) {
        Singleton_v6 instanceOne = Singleton_v6.getInstance();
        Singleton_v6 instanceTwo = Singleton_v6.getInstance();
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }
}

class Singleton_v6 {

    private Singleton_v6() {
    }

    public static Singleton_v6 getInstance() {
        return SingletonHelper.instance;
    }

    private static class SingletonHelper {
        private static final Singleton_v6 instance = new Singleton_v6();
    }
}
