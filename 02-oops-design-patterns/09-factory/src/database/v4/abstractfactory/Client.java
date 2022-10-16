package database.v4.abstractfactory;

import database.v4.abstractfactory.database.Database;
import database.v4.abstractfactory.factories.AbstractDBFactory;
import database.v4.abstractfactory.factories.MongoFactory;
import database.v4.abstractfactory.factories.MySQLFactory;
import database.v4.abstractfactory.query.Query;

import java.util.Objects;

public class Client {
    public static void main(String[] args) {
        AbstractDBFactory mySQLFactory = configure(DBType.MYSQL_DB);
        if (!Objects.isNull(mySQLFactory)) {
            Database mySQLDb = mySQLFactory.createDatabase();
            Query mySQLQuery = mySQLFactory.createQuery();
            System.out.println(mySQLDb);
            System.out.println(mySQLQuery);
        }
        AbstractDBFactory mongoFactory = configure(DBType.MONGO_DB);
        if (!Objects.isNull(mongoFactory)) {
            Database mongoDb = mongoFactory.createDatabase();
            Query mongoQuery = mongoFactory.createQuery();
            System.out.println(mongoDb);
            System.out.println(mongoQuery);
        }

    }

    public static AbstractDBFactory configure(DBType dbType) {
        if (dbType == DBType.MYSQL_DB) {
            return new MySQLFactory();
        } else if (dbType == DBType.MONGO_DB) {
            return new MongoFactory();
        }
        return null;
    }
}
