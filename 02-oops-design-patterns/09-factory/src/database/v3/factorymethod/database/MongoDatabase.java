package database.v3.factorymethod.database;

import database.v3.factorymethod.query.MongoQuery;
import database.v3.factorymethod.query.Query;

public class MongoDatabase implements Database {
    @Override
    public Query createQuery() {
        return new MongoQuery();
    }
}
