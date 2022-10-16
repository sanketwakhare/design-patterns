package database.v3.factorymethod.database;

import database.v3.factorymethod.query.MySQLQuery;
import database.v3.factorymethod.query.Query;

public class MySQLDatabase implements Database {
    @Override
    public Query createQuery() {
        return new MySQLQuery();
    }
}
