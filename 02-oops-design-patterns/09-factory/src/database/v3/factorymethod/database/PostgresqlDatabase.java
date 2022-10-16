package database.v3.factorymethod.database;

import database.v3.factorymethod.query.PostgresqlQuery;
import database.v3.factorymethod.query.Query;

public class PostgresqlDatabase implements Database {
    @Override
    public Query createQuery() {
        return new PostgresqlQuery();
    }
}
