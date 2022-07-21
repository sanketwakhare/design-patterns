package singleton.v5;

public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        RandomClass r = new RandomClass();
        System.out.println("stop");
    }
}
