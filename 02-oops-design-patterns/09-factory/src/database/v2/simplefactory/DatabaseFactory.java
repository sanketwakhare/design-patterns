package database.v2.simplefactory;

public class DatabaseFactory {
    public Database getDatabase(DatabaseType dbType) {
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
