package databasesingleton;

public class Main {
    public static void main(String[] args) {

        Database instance1 = Database.getInstance();
        Database instance2 = Database.getInstance();
        Database instance3 = Database.getInstance();

        System.out.println("done");
    }
}
