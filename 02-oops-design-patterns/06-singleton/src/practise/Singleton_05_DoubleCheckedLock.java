package practise;
/* Double-Checked Locking */
// only single instance is created
public class Singleton_05_DoubleCheckedLock {
    public static void main(String[] args) {
        Singleton_v5 instanceOne = Singleton_v5.getInstance();
        Singleton_v5 instanceTwo = Singleton_v5.getInstance();
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
        for (int i = 0; i < 50; i++) {
            Singleton_v5 instance = Singleton_v5.getInstance();
            System.out.println(instance.hashCode());
        }
    }
}

class Singleton_v5 {
    private static Singleton_v5 instance = null;

    private Singleton_v5() {}

    public static Singleton_v5 getInstance() {
        if (instance == null) {
            synchronized (Singleton_v5.class) {
                if (instance == null) {
                    instance = new Singleton_v5();
                }
            }
        }
        return instance;
    }
}
