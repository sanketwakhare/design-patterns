package database.v2.simplefactory;

public class Client {
    public static void main(String[] args) {
        DatabaseFactory databaseFactory = new DatabaseFactory();
        // mysql database
        Database mysqlDatabase = databaseFactory.getDatabase(DatabaseType.MYSQL);
        System.out.println(mysqlDatabase);
        // postgres sql
        Database postGreSqlDatabase = databaseFactory.getDatabase(DatabaseType.POSTGRESQL);
        System.out.println(postGreSqlDatabase);
        // mongo database
        Database mongoDatabase = databaseFactory.getDatabase(DatabaseType.MONGODB);
        System.out.println(mongoDatabase);
    }
}
