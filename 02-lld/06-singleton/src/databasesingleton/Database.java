package databasesingleton;

public class Database {

    public static Database instance = null;

    private Database() {
    }

    public static Database getInstance() {

        // synchronized block double-checked locking
        if (instance == null) {
            synchronized (Database.class) {
                if (instance == null) {
                    instance = new Database();
                }
            }
        }
        return instance;
    }
}
