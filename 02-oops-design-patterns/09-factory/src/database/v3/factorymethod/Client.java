package database.v3.factorymethod;

import database.v3.factorymethod.database.Database;
import database.v3.factorymethod.database.DatabaseFactory;
import database.v3.factorymethod.database.DatabaseType;
import database.v3.factorymethod.query.Query;

public class Client {
    public static void main(String[] args) {
        DatabaseFactory databaseFactory = new DatabaseFactory();
        // mysql database
        Database mysqlDatabase = databaseFactory.getDatabase(DatabaseType.MYSQL);
        System.out.println(mysqlDatabase);
        Query mySqlQuery = mysqlDatabase.createQuery();
        System.out.println(mySqlQuery);

        // postgres sql
        Database postGreSqlDatabase = databaseFactory.getDatabase(DatabaseType.POSTGRESQL);
        System.out.println(postGreSqlDatabase);
        Query postGreSQLQuery = postGreSqlDatabase.createQuery();
        System.out.println(postGreSQLQuery);

        // mongo database
        Database mongoDatabase = databaseFactory.getDatabase(DatabaseType.MONGODB);
        System.out.println(mongoDatabase);
        Query mongoQuery = mongoDatabase.createQuery();
        System.out.println(mongoQuery);
    }
}
