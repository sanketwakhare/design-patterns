package practise;

enum Singleton_v7 {
    INSTANCE;
}

public class Singleton_07_Enum {
    public static void main(String[] args) {
        Singleton_v7 instanceOne = Singleton_v7.INSTANCE;
        Singleton_v7 instanceTwo = Singleton_v7.INSTANCE;
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }
}
