package database.v1.base;

public class Client {
    public static void main(String[] args) {
        Database mySql = getDatabase(DatabaseType.MYSQL);
        System.out.println(mySql);
        Database postGreSQL = getDatabase(DatabaseType.POSTGRESQL);
        System.out.println(postGreSQL);
        Database mongoDb = getDatabase(DatabaseType.MONGODB);
        System.out.println(mongoDb);
    }

    private static Database getDatabase(DatabaseType dbType) {
        if (dbType == DatabaseType.MYSQL) {
            return new MySQLDatabase();
        } else if (dbType == DatabaseType.POSTGRESQL) {
            return new PostgresqlDatabase();
        } else if (dbType == DatabaseType.MONGODB) {
            return new MongoDatabase();
        }
        return null;
    }
}
