package database.v4.abstractfactory.factories;

import database.v4.abstractfactory.database.Database;
import database.v4.abstractfactory.database.MySQLDatabase;
import database.v4.abstractfactory.query.MySQLQuery;
import database.v4.abstractfactory.query.Query;

public class MySQLFactory implements AbstractDBFactory {
    @Override
    public Database createDatabase() {
        return new MySQLDatabase();
    }

    @Override
    public Query createQuery() {
        return new MySQLQuery();
    }
}
