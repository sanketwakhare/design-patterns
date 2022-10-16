package database.v4.abstractfactory.factories;

import database.v4.abstractfactory.database.Database;
import database.v4.abstractfactory.database.MongoDatabase;
import database.v4.abstractfactory.query.MongoQuery;
import database.v4.abstractfactory.query.Query;

public class MongoFactory implements AbstractDBFactory {

    @Override
    public Database createDatabase() {
        return new MongoDatabase();
    }

    @Override
    public Query createQuery() {
        return new MongoQuery();
    }
}
