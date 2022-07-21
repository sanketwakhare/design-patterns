package singleton.v6;

public class Main {
    public static void main(String[] args) {

        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        Singleton instance3 = Singleton.getInstance();

        System.out.println("done");
    }
}
